package com.testproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private Connection get_Db_Connection() {
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
            System.out.println("Authorized");
        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        } catch (SQLException se) {
            se.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        //1. COnnection
        //2. Statement
        //3. Resultset
        //4. Close
        Main m = new Main();
        Connection con = m.get_Db_Connection();
        try {
            con.close();
        } catch (Exception e){
            e.printStackTrace();
        }



        }
}
