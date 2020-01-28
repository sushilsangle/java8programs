import java.util.*;
public class LinkedPollFirst
{
   public static void main(String args[])
   {
	LinkedList list = new LinkedList();
	list.add("sushil");
	list.add(3);
	list.add("Java");
	list.add(5);
	list.add("Love");

	System.out.println("The initial list is  "+list);

	System.out.println("By using pollFirst() methid list is  : "+list.pollFirst());

	System.out.println("After executing pollFirst() method list is : "+list);
   }
}
