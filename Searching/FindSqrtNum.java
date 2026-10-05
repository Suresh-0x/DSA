import java.util.*;
class FindSqrtNum
{ 
   
   public static int findSqrt(int n)
   {
	int l=1,r=n/2;
	while(l<=r)
	{
	  int m=(l+r)/2;
	  if(m*m==n)
	   return m;
	 else if(m*m>n)
	   r=m-1;
	 else
	   l=m+1;
       }   
     return l-1;  

   }
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value:");
 	int n=sc.nextInt();
       System.out.print("Sqrt value of "+n+"is :"+findSqrt(n));
    }
}