import java.util.*;
class IsPalindrome2
{
 public static void main(String... args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a String:");
   String s=sc.next().toLowerCase();
   Stack<Character> st=new Stack<>();
   for(int i=0;i<s.length();i++)
   {
       st.push(s.charAt(i));
   }
  boolean b=true;
   for(int i=0;i<s.length();i++)
   {
     if(st.pop()!=s.charAt(i))
      {
         b=false;
         break;
       }
   }
    if(b)
  System.out.println("Given String is Palindorme");
  else
  System.out.println("Given String is not a Palindrome");
  }
}

   
