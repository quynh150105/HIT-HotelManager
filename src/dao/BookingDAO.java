package dao;

import Model.Booking;
import db.JDBCUtil;
import java.util.ArrayList;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookingDAO implements BookingDaoInterface<Booking> {
    
    public static BookingDAO getInstance(){
        return new BookingDAO();
    }
    
    // Phuong thuc dat phong
    @Override
    public int insert(Booking t) {
           int answer = 0;
        try {       
            Connection c = JDBCUtil.getConnection();
            // bảng booking (id, name, number, type, check in, check out, price);
            String sql = "insert into booking(id,name,number,type,checkin,checkout,price) value(?,?,?,?,?,?,?)";
            
            PreparedStatement p = c.prepareStatement(sql);
            
            p.setInt(1,t.getId());
            p.setString(2,t.getName());
            p.setString(3,t.getNumber());
            p.setString(4,t.getType());
            p.setObject(5,t.getCheckIn());
            p.setObject(6,t.getCheckOut());
            p.setString(7,t.getPrice());
            
            answer = p.executeUpdate();
            
            System.out.println("thuc hien cau lenh: " + sql);
            System.out.println("so dong thay doi: " + answer);
            
            JDBCUtil.closeConnection(c);
    
        } catch (SQLException ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return answer;
    }
    
    // Phuog thuc tim dat phong theo ten user (User)
    @Override
    public ArrayList<Booking> selectById(String username) {
        ArrayList<Booking> list = new ArrayList<>();
        try {
    
            Connection c = JDBCUtil.getConnection();
            
            String sql = "select * from booking where name = ?";
            
            PreparedStatement p = c.prepareStatement(sql);
            
            p.setString(1,username);
            
            ResultSet rs = p.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String number = rs.getString("number");
                String type = rs.getString("type");
                LocalDateTime checkin = rs.getObject("checkin",LocalDateTime.class);
                LocalDateTime checkout = rs.getObject("checkout",LocalDateTime.class);
                String price = rs.getString("price");

                Booking b = new Booking(id,name,number,type,checkin,checkout,price);
                list.add(b);
            }

            System.out.println("thuc hien cau lenh: " + sql);
            
            JDBCUtil.closeConnection(c);

        } catch (SQLException ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    
    // phuong thuc huy dat phong (xoa phong)
    @Override
    public int delete(String number) {
        int answer = 0;
        try {
            Connection c = JDBCUtil.getConnection();
            
            String sql = "delete from booking where number = ?";
            
            PreparedStatement p = c.prepareStatement(sql);
            
            p.setString(1,number);
            
            answer = p.executeUpdate();
            
            System.out.println("thuc hien cau lenh: " + sql);
            
            System.out.println("so dong thay doi: " + answer);
            
            p.close();
            JDBCUtil.closeConnection(c);

        } catch (SQLException ex) {
            Logger.getLogger(BookingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return answer;
    }
    
    // xem tat ca cac dat phong (admin)
    @Override
    public ArrayList<Booking> selectAll() {
       ArrayList<Booking> list = new ArrayList<>();
        try {
            Connection c = JDBCUtil.getConnection();
            
            String sql = "select * from booking";
            
            PreparedStatement p = c.prepareStatement(sql);
            
            ResultSet rs = p.executeQuery();
            // bảng booking (id, name, number, type, check in, check out, price);
            
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String number = rs.getString("number");
                String type = rs.getString("type");
                LocalDateTime checkin = rs.getObject("checkin",LocalDateTime.class);
                LocalDateTime checkout = rs.getObject("checkout",LocalDateTime.class);
                String price = rs.getString("price");
                
                Booking b = new Booking(id,name,number,type,checkin,checkout,price);
                
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
