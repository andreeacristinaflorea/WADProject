/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author user
 */
public class CourseListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        dao.CourseDAO c=new  dao.CourseDAO();
        
        List<String> courses=null;
        try {
            
            courses = c.retrieveCoursesNames(1);
        } catch (SQLException ex) {
            Logger.getLogger(CourseListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        sce.getServletContext().setAttribute("courses", courses);
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
