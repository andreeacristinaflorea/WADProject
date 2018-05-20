/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import Classes.Assignment;
import dao.CourseDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.userDAO;

/**
 *
 * @author oana
 */
public class LoginController extends HttpServlet{
    //System.out.println("pula");
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
<<<<<<< HEAD
        response.setContentType("text/html;charset=UTF-8");

        CourseDAO crs=new CourseDAO();
        
        List<String> assignms=crs.retrieveAssignments();
        request.getSession().setAttribute("assignms", assignms);
        response.sendRedirect("content/assignmentView.jsp");
        
        
=======
                response.setContentType("text/html;charset=UTF-8");
                
                try {
            dao.UserDAO u=new dao.UserDAO();
            dao.CourseDAO c=new dao.CourseDAO();
            List<String> courseSchedule=null;
            String error="";
            String user=request.getParameter("username");
            String pass=request.getParameter("password");
            
                              
                    if(u.userExistsLogin(user, pass)==false ) {
                        error="Invalid user or password";
                        request.setAttribute("errors", error);
                        System.out.println("Error added");
                        request.getSession().setAttribute("users", "notvalid");
                        System.out.println();
                        //request.getRequestDispatcher("/content/login.jsp").forward(request, response);
                        response.sendRedirect("/WADProject/content/login.jsp");
                    }
                        
                else 
                    {
                        error="You are logged in!";
                        request.getSession().setAttribute("users", user);
                        int faculty=u.retrieveFaculty(user);
                        request.getSession().setAttribute("faculty",faculty);
                        courseSchedule=c.retrieveNextCourses(faculty);
                        request.getSession().setAttribute("courseSchedule", courseSchedule);
                        //request.getRequestDispatcher("../contents/schedule.jsp").forward(request, response);
                        response.sendRedirect("/WADProject/content/schedule.jsp");
                        List<String> assignms=c.retrieveAssignments();
        
			request.getSession().setAttribute("assignms", assignms);
        
			response.sendRedirect("content/assignmentView.jsp");
                       
                    }
		
  
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
                
>>>>>>> 590a17bd0956c49006703a9b3d5bd97302196457
            
           
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
             
                        
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
<<<<<<< HEAD
            userDAO checker=new userDAO();
            //List<String> l=new ArrayList<>();
            List<String > errors=new ArrayList<>();
            String user=request.getParameter("uname");
             String pass=request.getParameter("password");
                              
                    if(checker.userExists2(user, pass)==false ) {
                        errors.add("Invalid user or password");
                        request.setAttribute("errors", errors);
                        System.out.println("Error added");
                        request.getRequestDispatcher("LoginView.jsp").forward(request, response);
                    }
                        
                else 
                    {
                        errors.add("You are logged in!");
                        request.getSession().setAttribute("users", user);
                        request.getRequestDispatcher("ProductView.jsp").forward(request, response);
                        System.out.println(request.getSession().getAttribute("users"));
                    }
=======
>>>>>>> 590a17bd0956c49006703a9b3d5bd97302196457
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
