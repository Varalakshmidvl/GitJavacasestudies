package Assignment5_loops;

public class Loops1 {

	public static void main(String[] args) {
		
		 		    for(int x = 25 ; x >=0; x -= 5)
		    {
		      System.out.println("Inside the loop");
		    }
		   int x = 0;
			System.out.println(x); //Accessing x after the loop body gives an error
		 

		//while loop

		{
		    long i = 0, fact = 1, num = 5 ;
		    i = num ;
		    while(num != 0)
		    {
		      fact = fact * num;
		      --num;
		    }
		    System.out.println("The factorial of " + i + " is: " +fact);
		  }

		//do while loop

		{
		    char ch = 'A' ;

		    do
		    {
		      System.out.println( ch + " " );
		      ch++;
		    } while(ch <= 'Z');
		  }

	}
}
