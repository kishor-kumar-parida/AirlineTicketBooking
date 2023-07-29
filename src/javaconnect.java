import java.sql.*;
import javax.swing.*;

public class javaconnect {
    Connection conn;
    public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/Airline1","root","");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null; 
        }  
    }
}
