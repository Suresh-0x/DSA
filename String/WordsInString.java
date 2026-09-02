import java.util.*;
class WordsInString
{
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your String");
      String s=sc.nextLine();
      String arr[]=s.split(" ");
      System.out.println("Words in a String are:");
      for(String a:arr)
       System.out.println(a);
  }
}