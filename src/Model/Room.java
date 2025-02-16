
package Model;

import java.util.Scanner;

public class Room {
    private int id;
    // id number type price status #total(foreign key)
    private String number;
    private String type;
    private String price;
    private String status;
 
    
    public Room(String number){
        this.number = number;
    
    }

    public Room(int id, String number, String type, String price, String status) {
        this.id = id;
        this.number = number;
        this.type = type;
        this.price = price;
        this.status = status;
    
    }
    
    public Room( String number, String type, String price, String status) {
       // this.id = id;
        this.number = number;
        this.type = type;
        this.price = price;
        this.status = status;

    }

    public Room() {
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public String getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

 

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
       // return "%-15s %-15s %-15s %-15s %-15s \n" + id + number + type + price + status;
       return "id=" + id + " number=" + number + "\t type=" + type + "\t price=" + price + "\t status=" + status  ;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        number = sc.nextLine();
        System.out.print("type: ");
        type = sc.nextLine();
        System.out.print("price: ");
        price = sc.nextLine();
        System.out.print("status: ");
        status = sc.nextLine();
       
    }
    
    public void display(){
        System.out.println(toString());
    }
    
}
