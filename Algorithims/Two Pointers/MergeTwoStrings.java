import java.util.*;
class MergeTwoStrings
{
       static String merge(String s1,String s2)
       {
	  int n=s1.length();
	  int m=s2.length();
          int i=0,j=0;
           StringBuffer sb=new StringBuffer();
	  while(i<n&&j<m)
	  {
            sb.append(s1.charAt(i));
            i++;
	    sb.append(s2.charAt(j));
	    j++;
	  }
          while(i<n)
	 {
	   sb.append(s1.charAt(i));
           i++;
	 }
        while(j<m)
	 {
	   sb.append(s2.charAt(j));
           j++;
	 }
      
      return sb.toString();
		
       }
      public static void main(String... args)
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter two Strings :");
          String s1=sc.next();
	  String s2=sc.next();
          System.out.println(merge(s1,s2));
    }
}
        