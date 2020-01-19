/*To calculate months between two dates*/
import java.time.*;
public class CountMonth
{
  public static void main(String args[])
  {
	LocalDate startDate=LocalDate.of(2016,04,06);
	LocalDate today =LocalDate.now();

	Period p = Period.between(startDate,today);
	int yy=p.getYears();
	int m=p.getMonths();

	System.out.println("Number of Years : "+yy);	
	System.out.println("Number of months: "+m);
	
  }
}
