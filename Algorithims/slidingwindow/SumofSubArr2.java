import java.util.*;
class SumofSubArr2
{
   public static int[]  sumOfSubArray(int a[],int k,int n)
   {
      int ans[]=new int[n-k+1];
      int pos=0,sum=0;
      for(int i=0;i<k;i++)
	sum+=a[i];
      ans[pos++]=sum;
     for(int i=k;i<n;i++)
     {
        sum=(sum+a[i])-a[i-k];
	ans[pos++]=sum;
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