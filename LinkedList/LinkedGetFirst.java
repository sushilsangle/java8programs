import java.util.*;
public class LinkedGetFirst
{
   public static void main(String args[])
   {
	LinkedList list = new LinkedList();
	list.add("sushil");
	list.add(1);
	list.add("java");
	list.add(2);
	list.add(3);
	list.add(4);

	System.out.println("The inlitial list is  : "+list);
	System.out.println("Using getFirst() methid list is  : "+list.getFirst());
	System.out.println("after executing grtFirst() method list is  : "+list);
   }
}
