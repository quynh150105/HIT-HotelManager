/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Model.User;
import db.JDBCUtil;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDAO implements UserdaoInterface<User> {

	public static UserDAO getInstance() {
		return new UserDAO();
	}

        // Phương thức insert
	@Override
	public int insert(User t) {
		int answer = 0;
		
		try {
			// B1: ket noi csdl
			Connection connection = JDBCUtil.getConnection();
			
			// B2: tao preparedstatament
			
			String sql = "insert into User(id,name,email,phoneNumber,address,password,securityQuestion,answer) value (?,?,?,?,?,?,?,?)" ; 
						
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			
			preparedstatement.setLong(1, t.getId());
			preparedstatement.setString(2, t.getName());
			preparedstatement.setString(3, t.getEmail());
			preparedstatement.setString(4, t.getPhoneNumber());
			preparedstatement.setString(5, t.getAddress());
			preparedstatement.setString(6, t.getPassword());
			preparedstatement.setString(7, t.getSecurityQuestion());
			preparedstatement.setString(8, t.getAnswer());

			answer = preparedstatement.executeUpdate();
			
			// B4: xu ly ket qua
			System.out.println("thuc hien cau lenh: " + sql);
			System.out.println("so dong thay doi: " + answer);
			
			// B5: ngat ket noi
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return answer;
	}
        
        // Phương thức update
	@Override
	public int update(User t) {
		int result = 0;
		
		try {
			Connection connection = JDBCUtil.getConnection();
			
			//User(id,name,email,phoneNumber,address,password,securityQuestion,answer) 
			String sql = "update User set password = ? where email = ? and securityQuestion = ? and answer = ?";
			
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			
			preparedstatement.setString(1, t.getPassword());
			preparedstatement.setString(2, t.getEmail());
			preparedstatement.setString(3, t.getSecurityQuestion());
			preparedstatement.setString(4, t.getAnswer());
			

			result = preparedstatement.executeUpdate();
			
			System.out.println("thuc hien cau lenh: " + sql);
			System.out.println("so dong thay doi: " + result);
			
                        preparedstatement.close();
                        
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return result;
	}
        
        // Phương thức lấy tất cả data
	@Override
	public ArrayList<User> selectAll() {
            
		ArrayList<User> list = new ArrayList<>();		
		try {
			Connection connection = JDBCUtil.getConnection();
			
			String sql = "select * from User";
			
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			
			
			ResultSet rs = preparedstatement.executeQuery();
			//User(id,name,email,phoneNumber,address,password,securityQuestion,answer) 
			while(rs.next()) {
				int id = (int) rs.getLong("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phoneNumber = rs.getString("phoneNumber");
				String address = rs.getString("address");
				String password = rs.getString("password");
				String securityQuestion = rs.getString("securityQuestion");
				String answer = rs.getString("answer");
				
				User us = new User(id,name,email,phoneNumber,address,password,securityQuestion,answer);
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


        @Override
        public boolean ChangePassword(String username, String password, String newPassword) {
             boolean change = false;
            try {
               
                
                int answer =0;
                
                Connection c = JDBCUtil.getConnection();
                
                String sql = "update User set password = ? where name = ?";
                
                PreparedStatement ps = c.prepareStatement(sql);
                
                ps.setString(1,newPassword);
                ps.setString(2,username);
                
                answer = ps.executeUpdate();
                
                JDBCUtil.closeConnection(c);
                change = true;
            } catch (SQLException ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            return change;
        }
}