import java.util.*;
class MinAvgAndMaxAvgInSubArr1
{
   public static int[] minAndMaxAvg(int a[],int k,int n)
   {
      
      int minAvg=Integer.MAX_VALUE;
      int maxAvg=Integer.MIN_VALUE;
      for(int i=0;i<=n-k;i++)
      {
	int sum=0;
	for(int j=i;j<i+k;j++)
	{
	  sum+=a[j];
	}
       minAvg=Math.min(sum/k,minAvg);
       maxAvg=Math.max(sum/k,maxAvg);
     }
return new int[]{minAvg,maxAvg};
     
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
    System.out.println(Arrays.toString(minAndMaxAvg(a,k,n)));

   }
}