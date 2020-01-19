/*To read Data from CMD and check the Year is Leap or not using java 8*/
import java.time.*;
import java.util.*;
public class LeapYear
{
   public static void main(String args[])  
   {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Year and check if its leap or not");
	int n=sc.nextInt();
	Year y =Year.of(n);//This line convert the n values to Year format.
	if(y.isLeap())
	{
	   System.out.println("Entered Year is Leap Year");
	}
	else
	{
	   System.out.println("Entered Year is not Leap Year");
	}
   }
}
