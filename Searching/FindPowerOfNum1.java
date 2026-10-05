import java.util.*;
class FindPowerOfNum1
{ 
   public static int findPower(int x,int n)
   {
      int res=1;
      for(int i=0;i<n;i++)
	res=res*x;
   return res;
   }
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter x value:");
 	int x=sc.nextInt();
      System.out.println("Enter n value:");
 	int n=sc.nextInt();
       System.out.print("Power "+findPower(x,n));
    
}
}