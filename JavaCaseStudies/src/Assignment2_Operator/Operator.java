package Assignment2_Operator;

public class Operator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =40;
		int b=20;
		int res= a+b;
		int d=a;
		boolean bl=false;
		String str1="abc";
		String str2="abc";
		System.out.println("ArithmeticOperator "+res);
		System.out.println("ArithmeticOperator " + (a-b));
		System.out.println("ArithmeticOperator " + (a*b));
		System.out.println("ArithmeticOperator " + (a/b));
		System.out.println("ArithmeticOperator " + (a%3));
		System.out.println("AssignmentOperator " + (d));
		System.out.println("AssignmentOperator " + (b+=a));
		System.out.println("AssignmentOperator " + (b*=a));
		System.out.println("BitwiseOperator " + (b<<2));
		System.out.println("LogicalOperator "+((5>3)&& (8>5)));
		System.out.println("LogicalOperator "+((5>3)&&(8<5)) );
		System.out.println("LogicalOperator "+((5>3)|| (8>5)));
		System.out.println("LogicalOperator "+((5>3)));
		System.out.println("LogicalOperator "+((5<3)|| (8<5)));
		System.out.println("LogicalOperator "+(!(5==3)));
		System.out.println("LogicalOperator "+(!(5>3)));
		System.out.println("RelationalOperator "+(a==b));
		System.out.println("RelationalOperator "+(a!=b));
		System.out.println("RelationalOperator "+(a>b));
		System.out.println("RelationalOperator "+(a>=b));
		System.out.println("RelationalOperator "+(a<b));
		System.out.println("RelationalOperator "+(a<=b));
		System.out.println("UnaryOperator "+(+a));
		System.out.println("UnaryOperator "+(-a));
		System.out.println("UnaryOperator "+(++a));
		System.out.println("UnaryOperator "+(--a));
		System.out.println("UnaryOperator "+(!bl));
		System.out.println("TernaryOperator "+((str1==str2)?"both are Equal" : "both are not equal"));
		
		}

}

	
	

