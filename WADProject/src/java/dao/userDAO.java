package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class userDAO {
    DBConnection con = new DBConnection();
     
    public boolean userExists(String username) throws SQLException, ClassNotFoundException{
        java.sql.Statement instr = (java.sql.Statement) con.getConnection().createStatement();
        String sql = "SELECT username FROM user";
        ResultSet rs = instr.executeQuery(sql);
        while(rs.next()){
            String name=rs.getString(1);
            if(username.equals(name)) return true;
        }
        return false;
   }
     
    public boolean userExistsLogin(String user,String pass) throws ClassNotFoundException, SQLException{
        Connection con = new DBConnection().getConnection();
        java.sql.Statement instr = (java.sql.Statement) con.createStatement();
        String sql = "SELECT username FROM user WHERE password='"+pass+"'";
        //String sql = "SELECT username FROM user WHERE password=PASSWORD('"+pass+"')";
        ResultSet rs = instr.executeQuery(sql);
        while(rs.next()){
            String username=rs.getString(1);
            if(user.equals(username)) 
                
                return true;
        }
        return false;
    }
    
    public void insertUser(String username,String password, String name, String email) throws ClassNotFoundException, SQLException{
         
        java.sql.Statement instr = (java.sql.Statement) con.getConnection().createStatement();
        String sql="INSERT INTO user (username, password,name,email) VALUES ('"+username+"',PASSWORD('"+password+"'),'"+name+"','"+email+"');";
        instr.executeUpdate(sql);
    }
    
    public List<String> retrieveFcultiesNames() throws SQLException {
        
        String sql="SELECT fname FROM faculty ;" ;
        List<String> facultiesNames = new ArrayList<>();
        java.sql.Statement instr = (java.sql.Statement) con.getConnection().createStatement();            
            ResultSet rs = instr.executeQuery(sql);
            while (rs.next()) {
                facultiesNames.add(rs.getString("fname"));
            }
        
        return facultiesNames;
}
   public int retrieveFaculty(Object user) throws SQLException {
        String username=(String) user;
        String sql="SELECT f.idfaculty FROM user "
                + "INNER JOIN faculty as f ON user.faculty=f.fname WHERE username='"+username+"';";
        int faculty=0;
        Connection con = new DBConnection().getConnection();
        java.sql.Statement instr = (java.sql.Statement) con.createStatement();          
        ResultSet rs = instr.executeQuery(sql);
        
        while(rs.next()){
            faculty=rs.getInt(1);
        }
        return faculty;
    } 
}
