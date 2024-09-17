package business;

import business.Product;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class SelectAllProducts {
    public static void main(String[] args) {
        ArrayList<Product> Products = new ArrayList<>();

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3306/classicmodels";
        String username = "root";
        String password = "EKfwmhqN";

        try{
            Class.forName(driver);

            try(Connection con = DriverManager.getConnection(url,username,password)){
                try(PreparedStatement ps = con.prepareStatement("SELECT * FROM Products")){
                    try(ResultSet rs = ps.executeQuery()){
                        while(rs.next()){
                            Product p = new Product(
                                    rs.getString("productCode"),
                                    rs.getString("productName"),
                                    rs.getString("productLine"),
                                    rs.getString("productScale"),
                                    rs.getString("productVendor"),
                                    rs.getString("productDescription"),
                                    rs.getInt("quantityInStock"),
                                    rs.getDouble("buyPrice"),
                                    rs.getDouble("MSRP")
                            );
                            Products.add(p);
                        }
                    }catch(SQLException e){
                        System.out.println(LocalDateTime.now() + ": An SQLException  occurred while running the query" +
                                " or processing the result.");
                        System.out.println("Error: " + e.getMessage());
                        e.printStackTrace();
                    }

                }catch(SQLException e){
                    System.out.println(LocalDateTime.now() + ": An SQLException  occurred while preparing the SQL " +
                            "statement.");
                    System.out.println("Error: " + e.getMessage());
                    e.printStackTrace();
                }

            }catch (SQLException e){
                System.out.println(LocalDateTime.now() + ": An SQLException  occurred while trying to connect to the " + url +
                        "database.");
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }

        } catch(ClassNotFoundException e){
            System.out.println(LocalDateTime.now() + ": A ClassNotFoundException occurred while trying to load the MySQL driver.");
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println(Products);
    }
}
