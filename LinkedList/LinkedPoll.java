import java.util.*;
public class LinkedPoll
{
   public static void main(String args[])
   {
	LinkedList list = new LinkedList();
	list.add("sushil");
	list.add(3);
	list.add("sus");
	list.add(5);

	System.out.println("The initial list is  : "+list);
	
	System.out.println("By using poll() methid list is : "+list.poll());
	System.out.println("After executing poll() method list is : "+list);
   }
}
