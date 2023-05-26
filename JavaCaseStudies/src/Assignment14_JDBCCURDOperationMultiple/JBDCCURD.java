package Assignment14_JDBCCURDOperationMultiple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JBDCCURD {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Orderid","root","MySQL@123");

		Statement stat = con.createStatement();

		//  String s = "Create database Orderid";

		String s = "use Orderid";

		String s1 = "CREATE TABLE ORDER_NEW"+ "(ORDER_ID int primary key,"
				+ "ORDER_DATE DATEtime NOT NULL,"
				+ "ORDER_MODE VARCHAR(8),"
				+ "CUSTOMER_ID int NOT NULl references cust_new,"
				+ "ORDER_TOTAL int)";

		String s2 = "Insert into ORDER_NEW (ORDER_ID,ORDER_DATE,ORDER_MODE,CUSTOMER_ID,ORDER_TOTAL) values "
				+ "(2364,'2007-08-29','online',145,37319.4),"
				+ "(2383,'2008-05-12','online',145,144054.8),"
				+ "(2366,'2007-08-29','online',145,60065),"
				+ "(2385,'2007-12-08','online',147,36374.7),"
				+ "(2425,'2007-11-17','direct',147,295892),"
				+ "(2406,'2007-06-29','direct',148,21116.9),"
				+ "(2367,'2008-06-28','online',148,2854.2),"
				+ "(2386,'2007-12-06','online',148,1500.8),"
				+ "(2451,'2007-12-18','direct',148,9055),"
				+ "(2434,'2007-09-13','direct',149,268651.8),"
				+ "(2368,'2008-07-27','online',149,10474.6),"
				+ "(2427,'2007-11-10','direct',149,14087.5)";


		int executeUpdate = stat.executeUpdate(s);
		System.out.println("<----Use database executed ---->");
		int executeUpdate1 = stat.executeUpdate(s1);
		System.out.println("<----Table Created ---->");
		int executeUpdate2 = stat.executeUpdate(s2);
		System.out.println("<----Query Created ---->");

		System.out.println(executeUpdate);
		System.out.println(executeUpdate1);
		System.out.println(executeUpdate2);
		System.out.println("<----Query Created ---->");
	}

}


