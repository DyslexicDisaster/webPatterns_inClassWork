package Week_1.app;

import Week_1.business.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class SelectProductsFromLine {
    public static void main(String[] args) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/classicmodels";
        String username = "root";
        String password = "EKfwmhqN";

        ArrayList<Product> products = new ArrayList<>();

        try{
            Class.forName(driver);
            System.out.println("Driver loaded successfully.");

            try(Connection con = DriverManager.getConnection(url,username,password)){
                System.out.println("Connected to database");

            } catch (SQLException e) {
                System.out.println(LocalDateTime.now() + ": An SQLException  occurred while trying to connect to the " + url +
                        "database.");
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            System.out.println(LocalDateTime.now() + ": A ClassNotFoundException occurred while trying to load the MySQL driver.");
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
