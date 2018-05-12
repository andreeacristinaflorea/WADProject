
package userExists;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SUPER
 */
public class check {
    String url = "jdbc:mysql://localhost:3306/wadproject";
    public boolean userExists(String username) throws SQLException, ClassNotFoundException{

        Class.forName("com.mysql.jdbc.Driver"); 
        Connection con = DriverManager.getConnection(url, "root","");
        java.sql.Statement instr = con.createStatement();
        String sql = "SELECT username FROM user";
        Statement statement2 = con.createStatement();
        ResultSet rs = instr.executeQuery(sql);
        while(rs.next()){
            String name=rs.getString(1);
            if(username.equals(name)) return true;
        }
        return false;
   }
   
   
    
    public boolean userExists2(String user,String pass) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection con = DriverManager.getConnection(url, "root","");
        java.sql.Statement instr = con.createStatement();
        String sql = "SELECT username,password FROM user WHERE password=PASSWORD('"+pass+"')";
        Statement statement2 = con.createStatement();
        ResultSet rs = instr.executeQuery(sql);
        while(rs.next()){
            String username=rs.getString(1);
            if(user.equals(username)) return true;
        }
        return false;
    }
}
