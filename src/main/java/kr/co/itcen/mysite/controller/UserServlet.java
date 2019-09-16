package kr.co.itcen.mysite.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.itcen.web.WebUtils;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String action = request.getParameter("a");
		if("joinform".equals(action)) {
			WebUtils.forword(request, response, "/WEB-INF/views/user/joinform.jsp");
		} else if("joinsuccess".equals(action)) {
			WebUtils.forword(request, response, "/WEB-INF/views/user/joinsuccess.jsp");
		} else if("loginform".equals(action)) { 
			WebUtils.forword(request, response, "/WEB-INF/views/user/loginform.jsp");
		} else {
			WebUtils.redirect(request, response, request.getContextPath());
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
