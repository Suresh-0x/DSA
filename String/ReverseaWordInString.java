import java.util.*;
class ReverseaWordInString
{
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String ans[]=s.split(" ");
      int l=0,r=ans.length-1;
      while(l<r)
      {
           String t=ans[l];
           ans[l]=ans[r];
           ans[r]=t;
            l++;
            r--;
       }
       System.out.println("Reverse of a String is: "+String.join(" ",ans));    
  }
}