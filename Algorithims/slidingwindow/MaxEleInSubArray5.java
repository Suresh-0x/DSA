import java.util.*;
class MaxEleInSubArray5
{
   public static int findMaxEleInSubArr(int a[],int n,int k)
   {
	
	TreeMap<Integer,Integer> tm=new TreeMap<>();
	int max=Integer.MIN_VALUE;
	for(int i=0;i<k;i++)
	{
	  tm.put(a[i],i);
	}
	max=tm.lastKey();
	for(int i=k;i<n;i++)
	{
	  tm.remove(a[i-k]);
	  tm.put(a[i],i);
	 if(tm.lastKey()>max)
	   max=tm.lastKey();
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