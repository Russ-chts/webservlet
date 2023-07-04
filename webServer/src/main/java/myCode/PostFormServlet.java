package myCode;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static java.lang.Class.forName;

@WebServlet(name = "PostFormServlet", value = "/PostFormServlet")
public class PostFormServlet extends HttpServlet {

    private PreparedStatement preparedStatement;
    PrintWriter out;

    @Override
    public void init() throws ServletException {
        initializeJDBC();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookId = request.getParameter("bookId");
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String author = request.getParameter("author");

        storeBook(Integer.parseInt(bookId), name, Integer.parseInt(price), author);
        out = response.getWriter();

        out.println("Book " + name + " has been stored in the database.");
        out.close();
    }

    private void initializeJDBC() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded...");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Video?useSSL=true","root", "Apollo845378");
            System.out.println("Database connect...");

            preparedStatement = connection.prepareStatement("insert into book " + "(bookId, name, price, author) values (?, ?, ?, ?)");
        }catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void storeBook(int id, String name, int price, String author) {
        try{
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setInt(3,price);
            preparedStatement.setString(4,author);
            preparedStatement.executeUpdate();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}