package connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {
private static 	Connection con;

static {
	try {
     
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/gestioncabinet","root","");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		 System.out.println("un probléme au niveau de pilote");
		e.printStackTrace();
	}catch (SQLException e1) {
	     System.out.println("un probléme au niveau de la base de données");
	}

}	

public static Connection getCon() {
	return con;   
}
}
