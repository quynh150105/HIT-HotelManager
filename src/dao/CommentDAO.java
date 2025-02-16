package dao;

import Model.Comment;
import db.JDBCUtil;
import java.util.ArrayList;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CommentDAO implements CommentDaoInterface<Comment> {

    public static CommentDAO getInstance(){
        return new CommentDAO();
    }
     
    // bảng đánh giá (id, name, number, comment); 
    // Phuong thuc danh gia sau khi dat phong
    @Override
    public int insert(Comment t) {
        int answer = 0;
        try {
            Connection c = JDBCUtil.getConnection();
            
            String sql = "insert into comment value(?,?,?,?,?,?)";
            
            PreparedStatement p = c.prepareStatement(sql);
            
            p.setInt(1,t.getId());
            p.setString(2,t.getName());
            p.setString(3,t.getNumber());
            p.setObject(4,t.getCheckIn());
            p.setObject(5,t.getCheckOut());
            p.setString(6,t.getComment());
            
            answer = p.executeUpdate();
            
            System.out.println("thuc hien cau lenh: " + sql);
            System.out.println("so dong thay doi: " + answer);
            
            JDBCUtil.closeConnection(c);

        } catch (SQLException ex) {
            Logger.getLogger(CommentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return answer;
    }

    
    // phuong thuc xem comment cua 1 doi tuong
    @Override
    public Comment selectById(Comment t) {
        Comment cm = null;
        try {
            
            
            Connection c = JDBCUtil.getConnection();
            
            String sql = "select * from comment where number = ?";
            
            PreparedStatement p = c.prepareStatement(sql);
            
            p.setString(1,t.getNumber());
            
            ResultSet rs = p.executeQuery();
            
            if(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String number = rs.getString("number");
                LocalDateTime checkin = rs.getObject("checkin",LocalDateTime.class);
                LocalDateTime checkout = rs.getObject("checkout",LocalDateTime.class);
                String comment = rs.getString("comment");
                cm = new Comment(id,name,number,checkin, checkout,comment);
            }
            
            System.out.println("thuc hien cau lenh: " + sql);
            
            JDBCUtil.closeConnection(c);
        } catch (SQLException ex) {
            Logger.getLogger(CommentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cm;
    
    }
    
    
    

    // Phuog thuc xem tat ca cac danh gia (admin)
    @Override
    public ArrayList<Comment> selectAll() {
        
        ArrayList<Comment> list = new ArrayList<>();
        try {
          
            Connection c = JDBCUtil.getConnection();
            
            String sql = "select * from comment";
            
            PreparedStatement p = c.prepareStatement(sql);
            
            ResultSet rs = p.executeQuery();
            // bảng đánh giá (id, name, number, comment);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String number = rs.getString("number");
                LocalDateTime checkin = rs.getObject("checkin",LocalDateTime.class);
                LocalDateTime checkout = rs.getObject("checkout",LocalDateTime.class);
                String comment = rs.getString("comment");
                
                Comment cm = new Comment(id,name,number,checkin, checkout,comment);
                
                list.add(cm);
            }
            
            System.out.println("thuc hien cau lenh: " + sql);
            
            JDBCUtil.closeConnection(c);
  
        } catch (SQLException ex) {
            Logger.getLogger(CommentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    
    // phuong thuc xoa comment (admin)
    @Override
    public int delete(String number) {
        int answer = 0;
        try {
            Connection c = JDBCUtil.getConnection();
            
            String sql = "delete from comment where number = ?";
            
            PreparedStatement p = c.prepareStatement(sql);
            
            p.setString(1,number);
            
            answer = p.executeUpdate();
            
            System.out.println("thuc hien cau lenh: " + sql);
            System.out.println("so dong thay doi: " + answer);
            
            JDBCUtil.closeConnection(c);
  
        } catch (SQLException ex) {
            Logger.getLogger(CommentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return answer;
    }
    
}
