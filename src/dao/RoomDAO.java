
package dao;

import Model.Room;
import db.JDBCUtil;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RoomDAO implements RoomdaoInterface<Room> {

    public static RoomDAO getInstance(){
        return new RoomDAO();
    }
    
    // Phuong thuc them phong cho admin
    @Override
    public int insert(Room t) {
        int answer = 0;
        try {

            Connection c = JDBCUtil.getConnection();
            
            // id number type price status #total(foreign key)
            String sql = "insert into Room(number,type,price, status) value (?,?,?,?)";
            
            PreparedStatement p = c.prepareStatement(sql);
 
            p.setString(1,t.getNumber());
            p.setString(2,t.getType());
            p.setString(3,t.getPrice());
            p.setString(4,t.getStatus());
                    
            answer = p.executeUpdate();
            
            System.out.println("thuc hien cau lenh: " + sql);
            System.out.println("so dong thay doi: " + answer);
            
            JDBCUtil.closeConnection(c);

          
        } catch (SQLException ex) {
            Logger.getLogger(RoomDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return answer;
    }

    // Phuogn thuc update phong cho admin
    @Override
    public int update(Room t) {
       
        int answer = 0;
        try {
            Connection c = JDBCUtil.getConnection();
            
            String sql = "update room set type = ?, price = ?,status = ? where number = ?";
            
            PreparedStatement p = c.prepareStatement(sql);
            
            p.setString(1, t.getType());
            p.setString(2, t.getPrice());
            p.setString(3, t.getStatus());
            p.setString(4,t.getNumber());
            
            answer = p.executeUpdate();
            
            System.out.println("so dong thay doi: " + answer);
            System.out.println("thuc hien cau lenh: " + sql);
            
            JDBCUtil.closeConnection(c);
            
            
            
           
        } catch (SQLException ex) {
            Logger.getLogger(RoomDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         return answer;
    }
    
    
    // Phuong thuc tim phong cho user + admin
    @Override
    public ArrayList<Room> selectAll() {
        
        ArrayList<Room> list = new ArrayList<>();		
		try {
			Connection connection = JDBCUtil.getConnection();
			
			String sql = "select * from Room";
			
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
		
			ResultSet rs = preparedstatement.executeQuery();
			while(rs.next()) {
				int id = (int) rs.getLong("id");
				String number = rs.getString("number");
				String type = rs.getString("type");
				String price = rs.getString("price");
				String status = rs.getString("status");

				Room us = new Room(id, number, type, price, status);
				list.add(us);
			}
			
			System.out.println("thuc hien cau lenh: " + sql);
			
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
                return list;
    }

    
    // Phuong thuc xóa phòng (admin)
    @Override
    public int delete(Room t) {
      
         int answer = 0;
        try {
           
            
            Connection c = JDBCUtil.getConnection();
            
            String sql = "delete from Room where number = ?";
            
            PreparedStatement p = c.prepareStatement(sql);
            
            p.setString(1,t.getNumber());
            
            answer = p.executeUpdate();
            
            System.out.println("thuc hien cau lenh: " +sql);
            System.out.println("so dong thay doi: " + answer);
            
            JDBCUtil.closeConnection(c);

        } catch (SQLException ex) {
            Logger.getLogger(RoomDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return answer;
    }

    @Override
    public int updateStatus(String number, String status) {
        int answer = 0;
        try {
            
            
            Connection c = JDBCUtil.getConnection();
            
            String sql = "update room set status = ? where number = ?";
            
            PreparedStatement p = c.prepareStatement(sql);
            
            p.setString(1,status);
            p.setString(2,number);
            
            answer = p.executeUpdate();
            
            System.out.println("thuc hien cau lenh: " + sql);
            System.out.println("so dong thay doi: " + answer);
            
            JDBCUtil.closeConnection(c);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(RoomDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return answer;

    }
    
    public boolean checkRoomAvailability(String roomNumber) {
        boolean check = false;
        try {
            Connection c = JDBCUtil.getConnection();
            
            String sql = "SELECT status FROM Room WHERE number = ?";
        
            PreparedStatement p = c.prepareStatement(sql);
        
            p.setString(1, roomNumber);
        

            ResultSet rs = p.executeQuery();
        if (rs.next()) {
            String status = rs.getString("status");
            
            if(status.equals("Available"))
                check = true;    
        }
        
        System.out.println("thic hien cau lenh: " + sql);
        
        JDBCUtil.closeConnection(c);
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return check; // Mặc định không cho đặt nếu có lỗi
}
    
}
