package emailapp;

import java.util.Scanner;

public class email {
	
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int mailboxcapacity;
	private String email;
	
	
	public email(String firstname, String lastname, String department, int mailBoxcapacity) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.department=department;
		this.password=setpassword(10);
		this.mailboxcapacity=mailBoxcapacity;
		
		this.email=firstname+"."+lastname+"@"+department+".com";
		
	}
	
	private String setpassword(int length) {
		
	String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$";
	char password[]=new char[length];
	for(int i=0;i<length;i++)
	{
		int rd= (int)(Math.random() * passwordset.length());
		password[i]= passwordset.charAt(rd);
	}
	
	return new String (password);
	
	}

	public String getName() {
		return firstname+lastname;
	}
    
	public String getEmail() {
		return email;
	}
	
	public int getMailboxcapacity() {
		return mailboxcapacity;
	}

	
	
	
	
	
	
	
}
