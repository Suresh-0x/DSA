import java.util.*;
class MinEleAmongMax
{
   public static int findMinEleInSubArr(int a[],int n,int k)
   {
	int min=Integer.MAX_VALUE;
	for(int i=0;i<=n-k;i++)
	{
	    int cMax=a[i];
	   for(int j=i+1;j<i+k;j++)
	   {
		if(a[j]>cMax)
		  cMax=a[j];
	   }
	   min=Math.min(min,cMax);
	}
      return min;
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
     System.out.println(findMinEleInSubArr(a,n,k));
  }
}