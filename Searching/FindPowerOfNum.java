import java.util.*;
class FindPowerOfNum
{ 
   public static int findPower(int x,int n)
   {
      int res=1;
      while(n>0)
     {
	if(n%2==0)
	x=x*x;
	else
	res*=x;
    n/=2;
    }
 return res*x;
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