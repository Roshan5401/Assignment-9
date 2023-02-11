package org.antwalk;

import java.io.*;

import org.antwalk.classes.Customer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Customer c = context.getBean("cus",Customer.class);
		
		System.out.println("Enter Login Details:- ");
		System.out.print("Username: ");
		String username = br.readLine();
		System.out.print("Password: ");
		String password = br.readLine();
		
		c.login(username, password);
		System.out.println();
 
		System.out.println("Enter Personal Details");
		System.out.print("Name: ");
		c.setName(br.readLine());
		
		System.out.print("Age: ");
		c.setAge(Integer.parseInt(br.readLine()));
		
		System.out.print("Address: ");
		c.setAddress(br.readLine());
		
		System.out.print("Email: ");
		c.setEmail(br.readLine());
		
		System.out.print("Phone: ");
		c.setPhone(Integer.parseInt(br.readLine()));
		
		System.out.print("SSN: ");
		c.setSsn(br.readLine());
		
		c.viewProfile();
		
		System.out.println("\nEnter the type of account you wanna open: ");
		System.out.print("Type c for current OR s for saving: ");
		
		c.type(br.readLine().toLowerCase());
		
		System.out.print("Enter the amount you wanna deposit: ");
		c.deposit(Float.parseFloat(br.readLine()));
	
		
		System.out.print("Enter the amount you wanna withdraw: ");
		c.withdraw(Float.parseFloat(br.readLine()));
		
		c.getBalance();
		System.out.println();
  		context.close();
		
	}

}
