interface Interf
{
   default void m1()
   {
	System.out.println("This is default method initi");
   }
}
class DefaultD implements Interf
{
   public static void main(String args[])
   {
	DefaultD d = new DefaultD();
	d.m1();
   }
}
