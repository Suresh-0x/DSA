import java.util.*;
class MaxAvgOfSubArr2
{
   public static int maxAverage(int a[],int k,int n)
   {
        int maxAvg=Integer.MIN_VALUE;
      int sum=0;
      for(int i=0;i<k;i++)
	sum+=a[i];
      maxAvg=sum/k;
      for(int i=k;i<n;i++)
      {
	sum=(sum-a[i-k])+a[i];  
	maxAvg=Math.max(sum/k,maxAvg);
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