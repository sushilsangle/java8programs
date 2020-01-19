/*To check Current time by using JodaORG API in Java 8*/
import java.time.*;
public class GetTime
{
   public static void main(String args[])
   {
	LocalTime time=LocalTime.now();
	System.out.println("System Default Time is "+time);//This will print default time...

	int h=time.getHour();
	int m=time.getMinute();
	int s=time.getSecond();
	int nano=time.getNano();

	System.out.println("Our own set format Time: ");
	System.out.printf("%d: %d: %d: %d: \n",h,m,s,nano);
   }
}

