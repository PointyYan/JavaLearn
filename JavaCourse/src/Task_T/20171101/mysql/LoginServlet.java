package mysql;
/*
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {	
		
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        
        UserMysql us = new UserMysql();
        String path = req.getContextPath();
        java.sql.Connection connection = us.getConnection(path);
        ResultSet rs=null;
      
        try {
			if(!connection.isClosed())
				rs = us.select(username,password);
			System.out.print(rs);
		
        
		while(rs.next()){			
			System.out.println(username+","+password);
			User u = new User(username,password);
			req.getSession().setAttribute("user", u);
			resp.sendRedirect("/index.jsp");
            
            return;
		}    
        
        //����û���������ƥ��ʧ�ܣ����¼ʧ��
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().print("��¼ʧ��");
       
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
}*/

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        
        String username = request.getParameter("username");

        String password = request.getParameter("password");
       
        UserDao userDao = new UserDao();

        User user = userDao.login(username,password);
        
        if(user != null){
           request.getRequestDispatcher("loginsuccess.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("loginfailed.jsp").forward(request, response);
        }
        }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}