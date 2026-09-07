import java.util.*;
class LongestWordInArray
{
 public static void main(String... args)
 {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   String s[]=new String[n];
   for(int i=0;i<n;i++)
   {
      String m=sc.next();
      s[i]=m;
   }
   String ans="";
   int max=Integer.MIN_VALUE;
   for(int i=0;i<s.length;i++)
   {
      if(s[i].length()>max)
      {
         ans=s[i];
         max=s[i].length();
      }
   }
   System.out.println("Longest Word in an Array is: "+ ans);
 }
}