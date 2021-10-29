package com.gaussic;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @program: springdemo-list
 * @description:
 * @author: soulx
 * @create: 2021-10-29 09:27
 **/
public class DiceBoardDispatcher extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RequestDispatcher view = request.getRequestDispatcher("diceBoardPage.jsp");
		/**
		 * https://stackoverflow.com/questions/48549551/tomcat-infinte-loop-on-requestdispatcherforward-stackoverflowerror
		 * stackoverflow
		 * 解决方式1： RequestDispatcher view = request.getRequestDispatcher("/diceBoardPage.jsp");
		 */
		view.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("diceBoardPage.jsp");
		view.forward(request, response);
	}
}
