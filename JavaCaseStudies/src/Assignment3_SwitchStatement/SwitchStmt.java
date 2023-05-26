package Assignment3_SwitchStatement;

import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;

public class SwitchStmt {

public static void main(String[] args) {
 LocalDate d = LocalDate.now();
Month currentMonth = d.getMonth();
 Scanner keyboard = new Scanner(System.in);
 System.out.println("please enter month as suggested (currentmonth / nextmonth / previousmonth ): ");
 String showmonth = keyboard.nextLine();
 switch (showmonth) {
 case "currentmonth":
 System.out.println("Current month: "+currentMonth);
 break;
case "nextmonth":
System.out.println("Next month: June");
break;
case "previousmonth":
System.out.println("previous month: April");
 break;}


}
}