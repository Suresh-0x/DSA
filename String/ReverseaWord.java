import java.util.*;
class ReverseaWord
{
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      String res=" ";
      for(int i=s.length()-1;i>=0;i--)
	res+=s.charAt(i).toString();
     System.out.println("Reverse of a String is: "+res); 

     
  }
}