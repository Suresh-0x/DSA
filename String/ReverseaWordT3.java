import java.util.*;
class ReverseaWordT3
{
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
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
       System.out.println("Reverse of a String is: "+new String(ans));    
  }
}