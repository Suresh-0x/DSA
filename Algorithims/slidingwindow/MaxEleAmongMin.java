import java.util.*;
class MaxEleAmongMin
{
   public static int findMaxEleInSubArr(int a[],int n,int k)
   {
	int max=Integer.MIN_VALUE;
	for(int i=0;i<=n-k;i++)
	{
	    int min=a[i];
	   for(int j=i+1;j<i+k;j++)
	   {
		if(a[j]<min)
		  min=a[j];
	   }
	  max=Math.max(min,max);
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