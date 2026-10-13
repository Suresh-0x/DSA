import java.util.*;
class MinAndMaxEleAmongMin
{
   public static int[] findMinAndMaxEleInSubArr(int a[],int n,int k)
   {
	int min=Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;
	for(int i=0;i<=n-k;i++)
	{
	    int cmin=a[i];
	   for(int j=i+1;j<i+k;j++)
	   {
		if(a[j]<cmin)
		  cmin=a[j];
	   }
	  min=Math.min(min,cmin);
	  max=Math.max(max,cmin);
	}
      return new int[]{min,max};
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
     System.out.println(Arrays.toString(findMinAndMaxEleInSubArr(a,n,k)));
  }
}