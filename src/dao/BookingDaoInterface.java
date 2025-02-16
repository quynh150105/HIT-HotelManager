package dao;

import java.util.ArrayList;

public interface BookingDaoInterface<T> {
    // insert, select 1  + select all: dao, impl Admin: 
    // user + admin
    public int insert(T t);
    
    public ArrayList<T> selectById(String username);
    
    public int delete(String number); // huy phong
    
    // admin
    public ArrayList<T> selectAll(); // quan ly phong dat

    
}
