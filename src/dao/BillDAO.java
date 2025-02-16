package dao;

import Model.Bill;
import Model.Booking;
import db.JDBCUtil;
import java.util.ArrayList;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BillDAO implements BillDaoInterface<Bill> {

    public static BillDAO getInstance(){
        return new BillDAO();
    }
    
    // database : bảng bill (id, create_date, name, phoneNumber, number, type, checkin, checkout, pice)
    // Them bill
    @Override
    public int insert(Bill t) {
        int answer = 0;
        try {
            Connection c = JDBCUtil.getConnection();           
            String sql = "insert into Bill(id, create_date, name, phoneNumber, number, type, checkin, checkout, price) value(?,?,?,?,?,?,?,?,?)";           
            PreparedStatement p = c.prepareStatement(sql);           
            p.setInt(1,t.getId());
            p.setObject(2,t.getCreateDate());
            p.setString(3,t.getName());
            p.setString(4,t.getPhoneNumber());
            p.setString(5,t.getNumber());
            p.setString(6,t.getType());
            p.setObject(7,t.getCheckIn());
            p.setObject(8,t.getCheckOut());
            p.setString(9, t.getPrice());           
            answer = p.executeUpdate();           
            System.out.println("thuc hien cau lenh: " + sql);
            System.out.println("So dong thay doi: " + answer);           
            JDBCUtil.closeConnection(c); 
        } catch (SQLException ex) {
            Logger.getLogger(BillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return answer;
    }

    @Override
    public ArrayList<Bill> selectById(String username) {
        ArrayList<Bill> list = new ArrayList<>();
        try {
    
            Connection c = JDBCUtil.getConnection();
            
            String sql = "select * from bill where name = ?";
            
            PreparedStatement p = c.prepareStatement(sql);
            
            p.setString(1,username);
            
            ResultSet rs = p.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                LocalDateTime create_date = rs.getObject("create_date",LocalDateTime.class);
                String name = rs.getString("name");
                String phoneNumber = rs.getString("phonenumber");
                String number = rs.getString("number");
                String type = rs.getString("type");
                LocalDateTime checkin = rs.getObject("checkin",LocalDateTime.class);
                LocalDateTime checkout = rs.getObject("checkout",LocalDateTime.class);
                String price = rs.getString("price");
                
                Bill b = new Bill(id,create_date,name,phoneNumber,number,type,checkin,checkout,price);
                
                list.add(b);
            }

            System.out.println("thuc hien cau lenh: " + sql);
            
            JDBCUtil.closeConnection(c);

        } catch (SQLException ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;    }

    @Override
    public int delete(int id) {
        int answer = 0;
        try {
            Connection c = JDBCUtil.getConnection();
            
            String sql = "delete from bill where id = ?";
            
            PreparedStatement p = c.prepareStatement(sql);
            
            p.setInt(1,id);
            
            answer = p.executeUpdate();
            
            System.out.println("thuc hien cau lenh: " + sql);
            
            System.out.println("so dong thay doi: " + answer);
            
            p.close();
            JDBCUtil.closeConnection(c);

        } catch (SQLException ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return answer;    }

    @Override
    public ArrayList<Bill> selectAll() {
        ArrayList<Bill> list = new ArrayList<>();
        try {
            Connection c = JDBCUtil.getConnection();
            
            String sql = "select * from bill";
            
            PreparedStatement p = c.prepareStatement(sql);
            
            ResultSet rs = p.executeQuery();            
            while(rs.next()){
            // database : bảng bill (id, create_date, name, phoneNumber, number, type, checkin, checkout, pice)
                int id = rs.getInt("id");
                LocalDateTime create_date = rs.getObject("create_date",LocalDateTime.class);
                String name = rs.getString("name");
                String phoneNumber = rs.getString("phonenumber");
                String number = rs.getString("number");
                String type = rs.getString("type");
                LocalDateTime checkin = rs.getObject("checkin",LocalDateTime.class);
                LocalDateTime checkout = rs.getObject("checkout",LocalDateTime.class);
                String price = rs.getString("price");
                
                Bill b = new Bill(id,create_date,name,phoneNumber,number,type,checkin,checkout,price);
                
                list.add(b);
            }
            
            System.out.println("thuc hien cau lenh: " + sql);     
            
            JDBCUtil.closeConnection(c);
  
        } catch (SQLException ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return list;    
    }
    
}
