import java.util.*;
class RemoveConsecutiveChars
{
       static void removeConsChars(String s)
       {
   
           int i=0,j=1;
	StringBuilder sb=new StringBuilder();
	   while(j<s.length())
	   {
		if(s.charAt(j)==s.charAt(i))
		  j++;
               else
	       {
                sb.append(s.charAt(i));
                i=j;
                j++;
	       }
           }
           sb.append(s.charAt(j-1));
         System.out.println(sb);
       }
      public static void main(String... args)
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a String: ");
          String s=sc.next();
	  removeConsChars(s);
     }
}
       