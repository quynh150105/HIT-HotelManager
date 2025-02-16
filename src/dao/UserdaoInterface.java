/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.ArrayList;
/**
 *
 * @author LeNhuQuynh
 */
public interface UserdaoInterface<T> {
	public int insert(T t);
	
	public int update(T t);
		
	public ArrayList<T> selectAll();
        
        public boolean ChangePassword(String usernameString, String oldPassword, String password);
	
  
	
}
