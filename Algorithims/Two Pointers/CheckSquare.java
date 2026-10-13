import java.util.*;
class CheckSquare
{ 
   public static boolean checkSquare(int n)
   {
         int l=0,r=(int)Math.sqrt(n);
	 while(l<r)
	 {
	   int value=l*l+r*r;
           if(value==n)
           {
              return true;
	 
	   }
           else if(value>n)
	     r--;
           else
	    l++;
         }
  return false;
   }w
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value:");
 	int n=sc.nextInt();
        System.out.println(checkSquare(n));
   }
}