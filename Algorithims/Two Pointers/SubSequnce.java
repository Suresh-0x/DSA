import java.util.*;
class SubSequnce
{ 
   public static boolean isSubSequence(String s1,String s2)
   {
       int n=s1.length();
       int m=s2.length();
       int l=0,r=0;
       while(l<n&&r<m)
       {
         if(s1.charAt(l)==s2.charAt(r))
         {
	   l++;
	   r++;
	}
        else
         r++;
       }
       if(l==n)
       return true;
       else 
	return false;
}
        
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter two Strings :");
      String s1=sc.next();
	String s2=sc.next();
       
        System.out.print("Largest common Element is :"+isSubSequence(s1,s2));
    }
}