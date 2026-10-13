import java.util.*;
class MinEleInSubArray
{
   public static int[] findMinEleInSubArr(int a[],int n,int k)
   {
	int res[]=new int[n-k+1];
	int pos=0;
	for(int i=0;i<=n-k;i++)
	{
	    int min=a[i];
	   for(int j=i+1;j<i+k;j++)
	   {
		if(a[j]<min)
		  min=a[j];
	   }
	  res[pos++]=min;
	}
      return res;
   }
   public static void main(String... args)   
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter n value: ");
       int n=sc.nextInt();
       System.out.println("Enter sizeof subarray: ");
       int k=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
	  a[i]=sc.nextInt();
     System.out.println(Arrays.toString(findMinEleInSubArr(a,n,k)));
  }
}