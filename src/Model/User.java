/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Scanner;

public class User {
        private int id;
	private String name;
	private String email;
	private String phoneNumber;
	private String address;
	private String password;
	private String securityQuestion;
	private String answer;
		
        public User(){
        }
               
	public User( int id, String name, String email, String phoneNumber, String address, String password,
			String securityQuestion, String answer) {
            this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.password = password;
		this.securityQuestion = securityQuestion;
		this.answer = answer;
	
	}
        
        public User( String name, String email, String phoneNumber, String address, String password,
			String securityQuestion, String answer) {
           
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.password = password;
		this.securityQuestion = securityQuestion;
		this.answer = answer;
	
	}
	
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

    public User(String email, String securityQuestion, String answer, String password) {
        this.email = email;
        this.securityQuestion = securityQuestion;
        this.answer = answer;
        this.password  = password;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}


	@Override
	public String toString() {
		return "User id=" + id + ", name=" + name + ", email=" + email + ", phonumNuber=" + phoneNumber + ", address="
				+ address + ", password=" + password + ", securityQuestion=" + securityQuestion + ", answer=" + answer
				;
	}

        public void input(){
            Scanner sc= new Scanner(System.in);
            System.out.print("name: ");
            name = sc.nextLine();
            System.out.print("email: ");
            email = sc.nextLine();
            System.out.print("phoneNumber: ");
            phoneNumber = sc.nextLine();
            System.out.print("address");
            address = sc.nextLine();
            System.out.print("password: ");
            password = sc.nextLine();
            System.out.print("securityQuestion: ");
            securityQuestion = sc.nextLine();
            System.out.print("answer: ");
            answer = sc.nextLine();
        }
        
        public void display(){
            System.out.println(toString());
        }
}
