package Model;

//bảng đánh giá (id, name, number, danh gia);

import java.time.LocalDateTime;


public class Comment {
    private int id;
    private String name;
    private String number;
     private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private String comment;

    public Comment(int id, String name, String number,LocalDateTime checkIn, LocalDateTime checkOut, String comment){
        this.id = id;
        this.name = name;
        this.number = number;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.comment = comment;
    }
    
    
    public Comment( String name, String number,LocalDateTime checkIn, LocalDateTime checkOut, String comment){      
        this.name = name;
        this.number = number;
         this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.comment = comment;
    }

    public Comment() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getComment() {
        return comment;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Comment" + "id=" + id + ", name=" + name + ", number=" + number + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", comment=" + comment;
    }

    
    
    public void display(){
        System.out.println(toString());
    }
    
  
    
}
