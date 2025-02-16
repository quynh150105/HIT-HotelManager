package Model;

import java.time.LocalDateTime;

public class Bill {
    private int id;
    private LocalDateTime createDate;
    private String name;
    private String phoneNumber;
    private String number;
    private String type;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private String price;

    public Bill() {
    }

    public Bill(int id, LocalDateTime createDate, String name,String phoneNumber, String number, String type, LocalDateTime checkIn, LocalDateTime checkOut, String price) {
        this.id = id;
        this.createDate = createDate;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.number = number;
        this.type = type;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.price = price;
    }

    public Bill(LocalDateTime createDate, String name ,String phoneNumber, String number, String type, LocalDateTime checkIn, LocalDateTime checkOut, String price) {
        this.createDate = createDate;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.number = number;
        this.type = type;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.price = price;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
       
    public int getId() {
        return id;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
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

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
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
        return "Bill{" + "id=" + id + ", createDate=" + createDate + ", name=" + name +  ", phoneNumber=" + phoneNumber + ", number=" + number + ", type=" + type + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", price=" + price + '}';
    }
    
    public void display(){
        System.out.println(toString());
    }
    
}
