package org.antwalk.classes;

import org.antwalk.interfaces.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cus")
public class Customer {
	
	private String name;
	private String username;
	private String password;
	private int age;
	private String ssn;
	private String address;
	private String email;
	private long phone;
	private float balance;
	
	private String typeOfAcc;
	
	
	@Autowired
	@Qualifier("current")
	Account acc1;
	
	@Autowired
	@Qualifier("saving")
	Account acc2;
	
	
	
	public Customer(String name, String username, String password, int age, String ssn, String address, String email,
			long phone, float balance, String typeOfAcc, Account acc1, Account acc2) {
		super();
		this.name = name;
		this.setUsername(username);
		this.setPassword(password);
		this.age = age;
		this.ssn = ssn;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.balance = balance;
		this.typeOfAcc = typeOfAcc;
		this.acc1 = acc1;
		this.acc2 = acc2;
	}
	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void login(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
		System.out.println("LOGGED IN SUCCESSFULLY\n");
	}
	
	public void viewProfile() {
		System.out.println("\n**********USER PROFILE********");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
		System.out.println("Email: " + email);
		System.out.println("Phone: " + phone);
		System.out.println("SSN No: " + ssn);
	}
	
	public void type(String s) {
		if(s.equals("c"))
			typeOfAcc = "current";
		else
			typeOfAcc = "saving";
	}
	
	public void deposit(float amt) {
		balance += amt;
		System.out.println("Amount deposited");
	}
	
	public void withdraw(float amt) {
		if(balance < amt)
			System.out.println("Not enough balance");
		else {
			balance -= amt;
			System.out.println("Amount withdrawn");
		}
		
	}
	
	public void getBalance() {
		System.out.println("\n-------------ACCOUNT DETAILS-----------");
		if(typeOfAcc.equals("current"))
			acc1.showAccount();
		else
			acc2.showAccount();
		
		System.out.println("Balance: " + balance);
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPhone(long phone) {
		this.phone = phone;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}
	
		
	
	
}

