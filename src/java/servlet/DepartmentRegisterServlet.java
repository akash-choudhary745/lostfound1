package servlet;

import dao.DepartmentDAO;
import model.Department;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;


@WebServlet("/department_register")
public class DepartmentRegisterServlet extends HttpServlet
{
protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
{
      String fullname = req.getParameter("fullname");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        
        try{
              Department exist=DepartmentDAO.findByusername(username); 
                 if (exist != null) {
                req.setAttribute("message", "username already registered.");
                req.getRequestDispatcher("index.jsp").forward(req, res);
                return;
            }
                 Department d=new Department();
                 d.setFullName(fullname);
                 d.setUserName(username);
                 d.setHashPassword(password);
                 
                  boolean ok = DepartmentDAO.registerUser(d);
            if (ok) {
                res.sendRedirect("department_login.jsp");
            } else {
                req.setAttribute("message", "Registration failed.");
                req.getRequestDispatcher("home.jsp").forward(req, res);
            }
        }
        catch(Exception e)
        {
            throw new ServletException(e);
        }
        }
        
}


