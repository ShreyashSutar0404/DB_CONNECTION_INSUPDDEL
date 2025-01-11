package DatabaseOperations;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class databaseOperations {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/school_management";
		String userName = "root";
		String password = "S@ngl!#10@";
		
		Connection connection = DriverManager.getConnection(url,userName,password);
		
		Statement statement = connection.createStatement();
		
//		ResultSet result = statement.executeQuery("select*from student");
//		
//		while(result.next()) {
//			System.out.println(result.getString(1));
//			System.out.println(result.getString(2));
//			System.out.println(result.getString(3));
//			System.out.println(result.getString(4));
//			System.out.println(result.getString(5));
//			System.out.println("------------------------------");
//		}
		statement.execute("INSERT INTO `school_management`.`student` \n"
				+ "(`roll_no`, `first_name`, `last_name`, `email_id`, `mobile_number`)\n"
				+ "VALUES ('9', 'john', 'doe', 'jdoe@gmail.com', '789542642');");
		
				
		
	}
}





