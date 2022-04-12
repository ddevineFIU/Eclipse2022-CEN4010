package com.example.demo.ShoppingCart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class cartController
{
    final String DB_URL = "jdbc:mysql://localhost:3306/book";
    final String USER = "root";
    final String PASS = "7896Rocker360*";


    @GetMapping(path = "/UpdateEntry")
    public @ResponseBody String update(String user, int isbn, String bookname, int quantity)
    {
        return updater(user, isbn, bookname, quantity);
    }

    @GetMapping(path = "/deleteEntry")
    public @ResponseBody String delete(String user,int isbn, String bookname)
    {
        return deleteInput(user,isbn, bookname);
    }

    @GetMapping(path = "/addToCart")
    public @ResponseBody String addCart(String user , int isbn, String bookname) {

        return shoppingCart(user,isbn,bookname);

    }

    @GetMapping(path = "/createUserCart")
    public @ResponseBody String createCart(String user) {

        return createTable(user);

    }
    private String updater(String user, int isbn, String bookname, int quantity)
    {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            //Update INTO USER (id)
            String sql = "UPDATE "+ user + "  WHERE(id) VALUES(" + isbn + bookname + quantity+")";

            stmt.executeUpdate(sql);

            return "Book Quantity was updated to Cart";

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return "Book was not updated";

    }

    private String deleteInput(String user, int isbn, String bookname)
    {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            //DELETE FROM USER (id)
            String sql = "DELETE FROM "+ user + "  WHERE(id) VALUES(" + isbn + bookname +")";

            stmt.executeUpdate(sql);

            return "Book was removed from Cart";

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return "Book was not removed";

    }


    private String shoppingCart(String user, int isbn, String bookname) {



        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            //INSERT INTO USER (id)
            String sql = "INSERT INTO "+ user + " (id) VALUES(" + isbn + bookname +")";

            stmt.executeUpdate(sql);

            return "Shopping Cart was created";

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return "Cart was not created";


    }

    private String createTable(String user) {


        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

        ) {

            if(	conn.getMetaData().getTables(null, null, user, null) != null    ) {




                String sql = "CREATE TABLE "+ user+ " " +
                        "(id INTEGER not NULL);";

                stmt.executeUpdate(sql);
                return "User was created";
            }
            return "User was already created";
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "USer was not created error";
    }
}
