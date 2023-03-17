package com.servlet.operation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.servlet.db.DbUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SelectDetails")
public class SelectDetails extends HttpServlet {
  
    private static final long serialVersionUID = 1L;
  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
        try {
            Class.forName(DbUtil.driver);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }
        try {
  
            int id = 0;
            String name = "",fathername = "", email = "", ph = "", city = "",state = "",pincode="";
  
            Connection conn = DriverManager.getConnection(DbUtil.url, DbUtil.user, DbUtil.password);
            System.out.println("connection successful");
            PreparedStatement st = conn.prepareStatement("select * from  tb_nandha_userdemo1 where id=?");
  
            st.setInt(1, Integer.valueOf(request.getParameter("id")));
  
            ResultSet rs = st.executeQuery();
  
            while (rs.next()) {
  
                id = rs.getInt(1);
                name = rs.getString(2);
                fathername = rs.getString(3);
                ph = rs.getString(4);
                email = rs.getString(5);
                city = rs.getString(6);
                state = rs.getString(7);
                pincode = rs.getString(8);
                
  
            }
  
            rs.close();
            st.close();
            conn.close();
  
            response.sendRedirect("Result.jsp?id=" + id + "&name=" + name +"&fathername=" +fathername + "&email=" + email + "&phone=" + ph + "&city=" + state + "&pincode=" + pincode);
  
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  
}