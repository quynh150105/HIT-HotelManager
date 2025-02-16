package dao;

import java.util.ArrayList;

public interface RoomdaoInterface<T> {
    
    public int insert(T t);
	
    public int update(T t);
    
    public int updateStatus(String number, String status);
    
    public boolean checkRoomAvailability(String number);
		
    public ArrayList<T> selectAll();
    
    public int delete(T t);
    
    
}
