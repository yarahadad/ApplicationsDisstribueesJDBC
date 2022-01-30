/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exampleJDBC;




import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class ExampleJDBC {

    
    public static Connection connect() {
        Connection con=null;
        try{
         Class.forName("com.mysql.jdbc.Driver");
         con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_db?","root","");
         JOptionPane.showMessageDialog(null,"connected Successfully");
         
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Database not cnnected yet");
        
            
        }
       return con;
    }
    
}
