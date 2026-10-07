import java.util.*;
class MinAndMaxInSubArr1
{
   public static int[] minAndMax(int a[],int k,int n)
   {
      
      int minSum=Integer.MAX_VALUE;
      int maxSum=Integer.MIN_VALUE;
      for(int i=0;i<=n-k;i++)
      {
	int sum=0;
	for(int j=i;j<i+k;j++)
	{
	  sum+=a[j];
	}
       minSum=Math.min(sum,minSum);
       maxSum=Math.max(sum,maxSum);
     }
return new int[]{minSum,maxSum};
     
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
    System.out.println(Arrays.toString(minAndMax(a,k,n)));

   }
}