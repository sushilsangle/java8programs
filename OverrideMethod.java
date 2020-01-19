interface Interf
{
   public void m1();
}
class OverrideMethod implements Interf
{
   public void m1()
   {
 	System.out.println("This is overriden method...");	
	//Interf.super.m1();
   }

   public static void main(String args[])
   {
	OverrideMethod o = new OverrideMethod();
	o.m1();
   }
}
