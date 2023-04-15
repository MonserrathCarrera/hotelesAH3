
package clases;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;


public class SQLconectar {
    Connection SQLConection;
    
    
    public SQLconectar (){
    String host= "localhost";
          String puerto= "3306";
            String nameDB= "evalti";
       String pass = " ";
     String usuario ="root";
          
          
          String  driver="com.mysql.cj.jdbc.Driver";
          
    String cadena = "jdbc:mysql://"+host+":"+puerto+"/"+nameDB+"?useSSL=false";
    
     try{
           
           Class.forName(driver);
      SQLConection = DriverManager.getConnection(cadena, usuario, pass);
                   JOptionPane.showMessageDialog(null, "Conexión correcta");

       }catch (Exception e) {
           JOptionPane.showMessageDialog(null, "problem en conexión"+ e.toString());
       }
    }
     public Connection  getConectarDB(){
       return  SQLConection;
    }
}
