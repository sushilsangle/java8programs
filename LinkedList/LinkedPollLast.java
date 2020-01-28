import java.util.*;
public class LinkedPollLast
{
   public static void main(String args[])
   {
	LinkedList list = new LinkedList();
	list.add("sushil");
	list.add(3);
	list.add("Java");
	list.add(12);

	System.out.println("The linitial list is : "+list);

	System.out.println("By using pollLast() methid list is : "+list.pollLast());
	
	System.out.println("After executig pollLast() methid lis is : "+list);
   }
}
