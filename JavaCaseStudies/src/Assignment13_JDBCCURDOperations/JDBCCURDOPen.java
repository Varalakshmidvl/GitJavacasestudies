package Assignment13_JDBCCURDOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCURDOPen {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Orderid","root","MySQL@123");
		Statement stat = con.createStatement();

		String Insertquery = "Insert into ORDER_NEW (ORDER_ID,ORDER_DATE,ORDER_MODE,CUSTOMER_ID,ORDER_TOTAL) values (2361,'2007-08-29','online',145,37319.4),";

		stat.executeUpdate(Insertquery);
		System.out.println("<-----Insert Query successfull----->");

		String updateQuery = "SELECT SUM(ORDER_TOTAL) FROM ORDERID.ORDER_NEW";


		ResultSet executeQuery = stat.executeQuery(updateQuery);


		while (executeQuery.next()) {
			String string = executeQuery.getString("SUM(ORDER_TOTAL)");

			System.out.println(string);

		}
		System.out.println("<-----Retrived Query successfull----->");


		String DeleteQuery = "DELETE FROM order_new WHERE ORDER_ID = 2451";

		ResultSet executeQuery2 = stat.executeQuery(DeleteQuery);

		System.out.println("<-----Record Deleted----->");

		String UpdateQuery = "UPDATE ORDER_NEW SET CUSTOMER_ID = 170 WHERE ORDER_ID = 2364";

		ResultSet executeQuery3 = stat.executeQuery(UpdateQuery);

		while (executeQuery.next()) {
			String order = executeQuery.getString("OrderID");
			String cusId = executeQuery.getString("CUSTOMER_ID");


			System.out.println("After updated--->" + "OrderId is : " + order + "Customer ID is" + cusId);


		}

	}
}
