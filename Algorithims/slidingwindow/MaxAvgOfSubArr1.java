import java.util.*;
class MaxAvgOfSubArr1
{
   public static int maxAverage(int a[],int k,int n)
   {
      
      int pos=0,maxAvg=0;
      for(int i=0;i<=n-k;i++)
      {
	int sum=0;
	for(int j=i;j<i+k;j++)
	{
	  sum+=a[j];
	}
	int avg=sum/k;
       maxAvg=Math.max(avg,maxAvg);
     }
return maxAvg;
     
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
    System.out.println("Maximum Average is: "+ maxAverage(a,k,n));

   }
}