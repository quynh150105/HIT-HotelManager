package Model;
// bảng booking (id, name, number, type, check in, check out, price);

import java.time.LocalDateTime;

public class Booking {
    private int id;
    private String name;
    private String number;
    private String type;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private String price;

    public Booking(int id, String name, String number, String type, LocalDateTime checkIn, LocalDateTime checkOut, String price) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.type = type;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.price = price;
    }
    
    
    public Booking( String name, String number, String type, LocalDateTime checkIn, LocalDateTime checkOut, String price) {
      
        this.name = name;
        this.number = number;
        this.type = type;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.price = price;
    }

    public Booking() {
    }

    public Booking(String name, String number) {
        //this.id = id;
        this.name = name;
        this.number = number;
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

    public String getType() {
        return type;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public String getPrice() {
        return price;
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

    public void setType(String type) {
        this.type = type;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Booking " + "id=" + id + ", name=" + name + ", number=" + number + ", type=" + type + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", price=" + price;
    }
    
    public void display(){
        System.out.println(toString());
    }
    
    
    
    
}
