import java.util.*;
class AvgofSubArr1
{
   public static int []  sumOfSubArray(int a[],int k,int n)
   {
      int ans[]=new int[n-k+1];
      int pos=0;
      for(int i=0;i<=n-k;i++)
      {
	int sum=0;
	for(int j=i;j<i+k;j++)
	{
	  sum+=a[j];
	}
       ans[pos++]=sum/k;
     }
     return ans;
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
     System.out.println(Arrays.toString(sumOfSubArray(a,k,n)));

   }
}