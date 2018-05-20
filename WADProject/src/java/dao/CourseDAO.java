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

	public List<String> retrieveNextCourses(Object fac) throws SQLException{
        int faculty=(int) fac;
        LocalDate date = LocalDate.now();
        String dayName;
        int hour=LocalDateTime.now().getHour();
        DayOfWeek dow = date.getDayOfWeek();
        dayName = dow.getDisplayName(TextStyle.NARROW_STANDALONE, Locale.ENGLISH);
        System.out.println(faculty+" "+dayName+" "+hour);
        String sql="SELECT cname,p.name,b.name,r.name,s.startHour,s.endHour FROM course "+
                    "inner join FACULTY as f ON course.faculty=f.idFaculty  " +
                    "inner join schedule as s on course.schedule=s.idSchedule " +
                    "inner join proffessor as p on course.proffessor=p.idProffessor " +
                    "inner join building as b on course.building=b.idbuilding " +
                    "inner join room as r on course.room=r.idroom " +
                    "WHERE course.faculty="+faculty+" and s.day="+1+" and "+hour+"<s.endHour;";
        List<String> sch=new ArrayList<>();
        
        
         Connection con = new DBConnection().getConnection();
        java.sql.Statement instr = (java.sql.Statement) con.createStatement();
          
        
            ResultSet rs=instr.executeQuery(sql);
            //rs.getI
           while (rs.next()) {
                Course c=new Course(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6));
                sch.add(c.toString());
            }
        
        
        return sch;
    }
}
    

