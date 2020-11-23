package net.codejava.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
 

/*
 * using Serialization write and synthesize the
presenter’s program. Use and collect the following information:
 Name
 Phone Number
 Date of birth
 Email Address
 */

public class Info {
    static final String filePath = "user.txt"; //it creates the file 
     
    
    //it will open the file a create it to input the data in it.
    static void serialize(User user) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream outputStream = new ObjectOutputStream(fos);
            outputStream.writeObject(user);
            outputStream.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
     
    static User deserialize() {
        User savedUser = null;
         
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream inputStream = new ObjectInputStream(fis);
            savedUser = (User) inputStream.readObject();
            inputStream.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
        }
         
        return savedUser;
    }
     
    public static void main(String[] args) {
        String name = "Cesar Martinez";
        String email = "cesarmartinez1@lewisu.edu";
        Date birthDay = new Date();
        int age = 24;
         
        User newUser = new User(name, email, birthDay, age);
         
        serialize(newUser);
 
        User savedUser = deserialize();
         
        if (savedUser != null) {
            savedUser.printInfo();
        }
    }
}