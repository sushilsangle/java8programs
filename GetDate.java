import java.time.*;
public class GetDate
{
   public static void main(String args[])
   {
	LocalDate date = LocalDate.now();
	System.out.println(date);

	int dd=date.getDayOfMonth();
	int mm=date.getMonthValue();
	int yy=date.getYear();

	System.out.println(dd+" "+mm+" "+yy);
   }
}
