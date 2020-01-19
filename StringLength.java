interface Interf
{
   public int getLength(String s);

}
class StringLength
{
   public static void main(String args[])
   {
	Interf i = s->s.length();
	System.out.println(i.getLength("Hello Lambda"));
	System.out.println(i.getLength("with lambda expression"));
   }
}
