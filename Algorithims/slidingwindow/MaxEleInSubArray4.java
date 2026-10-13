import java.util.*;
class MaxEleInSubArray4
{
   public static int findMaxEleInSubArr(int a[],int n,int k)
   {
	int max=Integer.MIN_VALUE;
	for(int i=0;i<=n-k;i++)
	{
	    int cMax=a[i];
	   for(int j=i+1;j<i+k;j++)
	   {
		if(a[j]>Cmax)
		  cMax=a[j];
	   }
	   max=Math.max(max,cMax);
	}
      return max;
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
     System.out.println(findMaxEleInSubArr(a,n,k));
  }
}