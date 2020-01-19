/*To Get Time and Date by using single class*/
import java.time.*;
public class GetTimeDate
{
   public static void main(String args[])
   {
	LocalDate date = LocalDate.now();
	LocalTime time = LocalTime.now();

	System.out.println("Current Date in default format: "+date);
	System.out.println("Current Time in default format "+time);

	int dd=date.getDayOfMonth();
	int mm=date.getMonthValue();	
	int yy=date.getYear();

	System.out.println("Current date in our own format");
	System.out.printf("%d-%d-%d \n",dd,mm,yy);

	int h=time.getHour();
	int m=time.getMinute();
	int s=time.getSecond();
	int nano=time.getNano();
	System.out.println("Current Time in our own format : ");
	System.out.printf("%d:%d:%d:%d \n",h,m,s,nano);
   }
}
