package com.servlet.operation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.servlet.db.DbUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/InsertDetails")
public class InsertDetails extends HttpServlet {
  
    private static final long serialVersionUID = 1L;
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
        // Jdbc Connection
        try {
            Class.forName(DbUtil.driver);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }
        try {
            Connection conn = DriverManager.getConnection(DbUtil.url, DbUtil.user, DbUtil.password);
            System.out.println("connection successful");
              
              // Query/statement to insert the values
            
            String insertQuery = "insert into tb_nandha_userdemo1(user_name,father_name,phone,email,city,state,pincode) values (?,?,?,?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(insertQuery);
            // set values into the query
//            st.setInt(1, Integer.valueOf(request.getParameter("id")));
            st.setString(1, request.getParameter("name"));
            st.setString(2, request.getParameter("fatherName"));
            st.setString(3, request.getParameter("phone"));
            st.setString(4, request.getParameter("email"));
            st.setString(5, request.getParameter("city"));
            st.setString(6, request.getParameter("state"));
            st.setString(7, request.getParameter("pincode"));
  
            // Execute the query
            st.executeUpdate();
  
            st.close();
            conn.close();
  
            // Redirect the response to success page
            response.sendRedirect("Success.jsp?msg=Insert");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}