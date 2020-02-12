import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import javax.swing.JOptionPane;


public class JavaConnect {
    
    Connection conn;
    
    public static Connection connectDb()
    {
        try{
           
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/library","root", "1234");

            return conn;
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
          return null;
        }
        
    }
 public static void main(String[] args) throws IOException{

     //updating roll no. from file
     BufferedReader in;
     String read;
    in = new BufferedReader(new FileReader("/F:/Projects/Project JDBC/roll.txt"));
   read = in.readLine();
   int num=Integer.parseInt(read);
   in.close();
    BufferedWriter out;
    out = new BufferedWriter(new FileWriter("/F:/Projects/Project JDBC/roll.txt"));
    out.write(Integer.toString(num+1));
    out.close();

  }
    
    
    
}
