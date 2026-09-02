import java.util.*;
class ReverseaWordInString2
{
  public static String reverseOf(String s)
  {
     char ans[]=s.toCharArray();
      int l=0,r=s.length()-1;
      while(l<r)
      {
           char t=ans[l];
           ans[l]=ans[r];
           ans[r]=t;
            l++;
            r--;
       }
      return new String(ans); 
 }
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String ans[]=s.split(" ");
      int l=0,r=ans.length-1;
      for(int i=0;i<ans.length;i++)
      {
         ans[i]=reverseOf(ans[i]);
      }
     System.out.println("reverse each word in a String is: \n"+String.join(" ",ans));
  }
}