package config;

//import com.mysql.cj.jdbc.Driver;
//import com.mysql.cj.MysqlConnection;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    
    public Conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/productodb","root","");
        
        }catch (Exception e){
            System.err.println("no se pudo establecer conexion. error:"+e);
        }
    }
    
    public Connection getConnection(){
            return con;
    }
}