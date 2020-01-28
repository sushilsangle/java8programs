import java.util.*;
public class LinkedGetLast
{
    public static void main(String args[])
    {
	LinkedList list = new LinkedList();
	list.add("java");
	list.add(1);
	list.add("Sushil");
	list.add(3);

	System.out.println("Initial list is  : "+list);
	System.out.println("By using getLast() method list is  : "+list.getLast());
	//System.out.println(list);
    }
}

/*
 If the list is empty then we will get exception at runtime for getFirst() and getLast() method::java.util.NoSuchElementException

*/
