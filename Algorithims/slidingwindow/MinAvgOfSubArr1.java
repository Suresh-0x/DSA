import java.util.*;
class MinAvgOfSubArr1
{
   public static int minAverage(int a[],int k,int n)
   {
      
      int minAvg=Integer.MAX_VALUE;
      for(int i=0;i<=n-k;i++)
      {
	int sum=0;
	for(int j=i;j<i+k;j++)
	{
	  sum+=a[j];
	}
       minAvg=Math.min(sum/k,minAvg);
     }
return minAvg;
     
   }
   public static void main(String... args)
   {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value: ");
      int n=sc.nextInt();
      System.out.println("Enter k value: ");
      int k=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
    System.out.println("Minimum Sum is: "+ minAverage(a,k,n));

   }
}