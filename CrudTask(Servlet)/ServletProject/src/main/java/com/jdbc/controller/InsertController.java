package com.jdbc.controller;

import java.io.IOException;
import java.sql.SQLException;

import com.jdbc.dto.User;
import com.servlet.db.DbUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class InsertController
 */
@WebServlet("/InsertController")
public class InsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public InsertController() {
       super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String Name = request.getParameter("name");
		String  FatherName=request.getParameter("fatherName");
		String Email = request.getParameter("email");
		String Phone = request.getParameter("phone");
		String City=request.getParameter("city");
		String State=request.getParameter("state");
		String Pincode=request.getParameter("Pincode");
		
		

		User member =new User(Name, FatherName, Email, Phone, City, State, Pincode);
		DbUtil.saveUser(member);
			request.getRequestDispatcher("Success.jsp").include(request,response);

		
		}
	} 

	


