package com.servelts;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.dao.UserDao;
import com.models.User;

/**
 * Servlet implementation class SingUp
 */
@WebServlet("/singup")
public class SingUp extends HttpServlet {

  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	     String  userName = request.getParameter("name");
	     String userEmail = request.getParameter("email");
	     String userPassword = request.getParameter("password");
	     UserDao userDao = new UserDao();
	     User user= new User(userName,userEmail,userPassword);
	     userDao.saveUser(user);
	     
	     RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
	     requestDispatcher.forward(request, response);
	  
	}

	

}
