package com;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aanas
 */
public class Click {

    
    
    private static boolean checkRegesteredUser(String username) {
     
        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/project";

            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "root");

      // create a sql date object so we can use it in our INSERT statement
            // the mysql insert statement
            String query = "select count(id) AS total from users where name= ?";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, username);
        
            // execute the preparedstatement
            
           
           ResultSet rs=preparedStmt.executeQuery();
           int count=0; 
           
           while (rs.next())
                
            {
             count=rs.getInt("total");
            System.out.print(count);
            }
         
            conn.close();

           
            if (count>0)
            return true;
            else return  false;

        } catch (Exception e) {
            e.printStackTrace();
            return false;

        }
    }

    

    public Click() {

    }

    public static boolean savePattern(String pattern, String username) {

        try {
            
            
            if (checkUser(username)==true){return false;}
            
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/project";

            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "root");

      // create a sql date object so we can use it in our INSERT statement
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Calendar cal = Calendar.getInstance();

            // the mysql insert statement
            String query = "insert into reg_users (time,userName,pattern)  values (?, ?,?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, dateFormat.format(cal.getTime()));
            preparedStmt.setString(2, username);
            preparedStmt.setString(3, pattern);

            // execute the preparedstatement
            preparedStmt.execute();

            conn.close();

            System.out.println("new pattern inserted");

            return true;
            

        } catch (Exception e) {
            e.printStackTrace();
            return false;

        }
    }
    
    
      public static boolean saveUser( String username, String password) {

        try {
            
            if (checkRegesteredUser(username)==true){return false;}
            
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/project";

            Class.forName(myDriver);
            
            Connection conn = DriverManager.getConnection(myUrl, "root", "root");

             // create a sql date object so we can use it in our INSERT statement
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Calendar cal = Calendar.getInstance();

            // the mysql insert statement
            String query = "insert into users (name,password)  values (?,?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, username);
            preparedStmt.setString(2, password);

            // execute the preparedstatement
            preparedStmt.execute();

            conn.close();

            System.out.println("new user inserted");

            return true;
            

        } catch (Exception e) {
            e.printStackTrace();
            return false;

        }
    }
      
      
      
   public static boolean checkPattern(String pattern, String username) {

        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/project";

            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "root");

      // create a sql date object so we can use it in our INSERT statement
            // the mysql insert statement
            String query = "select count(id) AS total from reg_users where userName= ? and pattern=?";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, username);
            preparedStmt.setString(2, pattern);

            // execute the preparedstatement
            
           
            
            
           ResultSet rs=preparedStmt.executeQuery();
           int count=0; 
           
           while (rs.next())
                
            {
            count=rs.getInt("total");
            System.out.print(count);
            }
         
            conn.close();

           
            if (count>0)
            return true;
            else return  false;

        } catch (Exception e) {
            e.printStackTrace();
            return false;

        }
    }
   
   
    public static boolean validateUser(String user_name, String password) {

        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/project";

            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "root");

      
            String query = "select count(id) AS total from users where name= ? and password=?";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, user_name);
            preparedStmt.setString(2, password);

            // execute the preparedstatement
            
           
            
            
           ResultSet rs=preparedStmt.executeQuery();
           int count=0; 
           
           while (rs.next())
                
            {
            count=rs.getInt("total");
            System.out.print("count ------->"+count);
      
            }
         
            conn.close();

           
            if (count>0)
            return true;
            else return  false;

        } catch (Exception e) {
            e.printStackTrace();
            return false;

        }
    }
    public static boolean checkUser(String username) {

        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/project";

            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "root");

      // create a sql date object so we can use it in our INSERT statement
            // the mysql insert statement
            String query = "select count(id) AS total from reg_users where userName= ?";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, username);
        
            // execute the preparedstatement
            
           
            
            
           ResultSet rs=preparedStmt.executeQuery();
           int count=0; 
           
           while (rs.next())
                
            {
             count=rs.getInt("total");
            System.out.print(count);
            }
         
            conn.close();

           
            if (count>0)
            return true;
            else return  false;

        } catch (Exception e) {
            e.printStackTrace();
            return false;

        }
    }

    public static void clickIt() {
        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/project";

            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "root");

      // create a sql date object so we can use it in our INSERT statement
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Calendar cal = Calendar.getInstance();

            // the mysql insert statement
            String query = "insert into clicks (timeClicks,statusClick)  values (?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, dateFormat.format(cal.getTime()));
            preparedStmt.setString(2, "Clicked");

            // execute the preparedstatement
            preparedStmt.execute();

            conn.close();

            System.out.println("clicked");

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

}
