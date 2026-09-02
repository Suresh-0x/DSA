import java.util.*;
class NoOfWordsInString
{
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your String");
      String s=sc.nextLine();
      String arr[]=s.split(" ");
      System.out.println("Number of words in a String is: "+arr.length);
  }
}