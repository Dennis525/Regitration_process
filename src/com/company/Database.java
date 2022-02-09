package com.company;
import java.sql.*;

public class Database {
    Connection con;
    PreparedStatement pst;
    Statement st;
    ResultSet rst;
    Database(){con = getCon();}

    public Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("DRIVER FOUND");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Registration","root","");
            System.out.println("Successfully connected to DataBase");

        }catch (SQLException e)
        {
            System.err.println(e);
        }
    return con;
    }

    public  void addID(registerDetails rD){
        String sql = "INSERT into info(name,ID,county,phone_no) VALUES(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, rD.getName());
            pst.setLong(2, rD.getID());
            pst.setString(3, rD.getCounty());
            pst.setLong(4, rD.getPhone_no());
            pst.execute();
            System.out.println("SUCCESSFULLY ADDED!");
        }
        catch (SQLException e){
            System.err.println(e);
            System.out.println("INFO NOT CREATED");
        }


    }






}



