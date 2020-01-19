interface Interf
{
   public void m1(int a,int b);
}
class Addition
{
   public static void main(String args[])
   {
	Interf i=(a,b)->System.out.println(a+b);
	i.m1(10,20);
   }
}
