/*To calculate the age between day today and birthday or any date by using joda.ord API in java 8*/
import java.time.*;
public class CalculateAge
{
   public static void main(String args[])
   {
	LocalDate birthday =LocalDate.of(1992,06,12);
	LocalDate today = LocalDate.now();

	Period p =Period.between(birthday,today);
	System.out.printf("Age = Years %d: Months %d \n",p.getYears(),p.getMonths(),p.getDays());
   }
}
