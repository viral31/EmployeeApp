import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
    static Connection con;
    public static Connection createDBConnetion(){


        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/employeeDB";
            String username="root";
            String password="vir11_ptx";
            con= DriverManager.getConnection(url,username,password);

        }catch (Exception e){
            e.printStackTrace();
        }
        return con;

    }
}


