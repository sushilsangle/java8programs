import java.util.*;
public class LinkedListGet
{
    public static void main(String args[])
    {
	LinkedList list = new LinkedList();
	list.add("sushil");
	list.add(2);
	list.add("java");
	System.out.println("Initlial List is  : "+list);

	System.out.println("Using get() methid element at index 2 is  : "+list.get(1));
    }
}
