import java.util.*;
class UpperandLowerCases
{
 public static void main(String... args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a String:");
   String s=sc.nextLine();
   System.out.print("Upper Case:");
   System.out.println(s.toUpperCase());
   System.out.print("Lower Case:");
   System.out.print(s.toLowerCase());
  }
}