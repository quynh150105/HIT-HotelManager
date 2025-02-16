package dao;

import java.util.ArrayList;

public interface BillDaoInterface<T> {
    
    public int insert(T t);
    
    public ArrayList<T> selectById(String username);
    
    public int delete(int id); // huy phong
    
    // admin
    public ArrayList<T> selectAll(); // quan ly phong dat
}
