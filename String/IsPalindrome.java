import java.util.*;
class IsPalindrome
{
 public static void main(String... args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a String:");
   String s=sc.next().toLowerCase();
   int l=0,r=s.length()-1;
   boolean b=true;
   while(l<r)
   {
     if(s.charAt(l)!=s.charAt(r))
     {
       b=false;
       break;
     }
     l++;
     r--;
   }
  if(b)
  System.out.println("Given String is Palindorme");
  else
  System.out.println("Given String is not a Palindrome");
  }
}

   
