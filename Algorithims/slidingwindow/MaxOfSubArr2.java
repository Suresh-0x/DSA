import java.util.*;
class MaxOfSubArr2
{
   public static int maxSum(int a[],int k,int n)
   {
      int maxSum=Integer.MIN_VALUE;
      int sum=0;
      for(int i=0;i<k;i++)
	sum+=a[i];
      maxSum=sum;
      for(int i=k;i<n;i++)
      {
	sum=(sum-a[i-k])+a[i];  
	maxSum=Math.max(sum,maxSum);
       }
  return maxSum; 
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
    System.out.println("Maximum Sum is: "+ maxSum(a,k,n));

   }
}