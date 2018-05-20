/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Classes.Assignment;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import util.DBConnection;


public class CourseDAO {
    private static CourseDAO instance;
    
    public static CourseDAO getInstance() {
        if (instance == null) {
            instance = new CourseDAO();
        }
        return instance;
    }
    public CourseDAO() {}
    
    DBConnection con = new DBConnection();
    public List<String> retrieveCoursesNames(int faculty) throws SQLException {
        
        String sql="SELECT cname FROM course WHERE faculty="+faculty+";";
        List<String> coursesNames = new ArrayList<>();
        java.sql.Statement instr = (java.sql.Statement) con.getConnection().createStatement();            
            ResultSet rs = instr.executeQuery(sql);
            while (rs.next()) {
                coursesNames.add(rs.getString("cname"));
            }
        
        return coursesNames;
}
    
    public void insertAssignment(String description,Date dueDate,String priority, String type, String title, Date notificationDate, String courseName) throws SQLException{
    
        String sql="INSERT INTO assignmnet (description,dueDate,priority,type,title,notificationDate,course) VALUES ('"+description+"','"+dueDate+"','"+priority+"','"+type+"','"+title+"','"+notificationDate+"','"+courseName+"');";
        java.sql.Statement instr = (java.sql.Statement) con.getConnection().createStatement(); 
            
        instr.executeUpdate(sql);
    }
    
    public List<String> retrieveAssignments() throws SQLException{
        LocalDate date =LocalDate.now();
        String sql="SELECT course, title, description FROM assignmnet WHERE YEAR(notificationDate)=YEAR(CURDATE()) \n" +
"                AND MONTH(notificationDate)=MONTH(CURDATE()) AND DAY(notificationDate)=DAY(CURDATE()) ORDER BY priority";
            List<String> assignments = new ArrayList<>();
            java.sql.Statement instr = (java.sql.Statement) con.getConnection().createStatement();            
            ResultSet rs = instr.executeQuery(sql);
            
            while (rs.next()) {
                Assignment assg=new Assignment(rs.getString("course"),rs.getString("title"),rs.getString("description"));
                assignments.add(assg.toString());
            }
        
        return assignments;
        
    }
}
    

