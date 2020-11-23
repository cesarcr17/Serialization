package net.codejava.io;

import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable{
	//this section creates all the files that are going to be input in the file 
	
	 
	    private String name;
	    private String email;
	    
	    private java.util.Date birthday;
	    private int age;
	 
	    //constructor
	    public User(String name, String email , java.util.Date birthDay2,
	            int age) {
	        this.name = name;
	        this.email = email;
	       
	        this.birthday = birthDay2;
	        this.age = age;
	    }
	 
	    public void printInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Email: " + email);
	       
	        System.out.println("Birthday: " + birthday);
	        System.out.println("Age: " + age);
	    }
	 
	    
	}


