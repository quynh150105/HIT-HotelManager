package dao;

import java.util.ArrayList;

public interface CommentDaoInterface<T> {
        // insert, select 1  + select all: dao, impl Admin: 
    // user + admin
    public int insert(T t);
    
    public T selectById(T t);

    // admin
    public ArrayList<T> selectAll();
    
     public int delete(String number);
}
