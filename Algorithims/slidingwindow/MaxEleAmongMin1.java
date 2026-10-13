import java.util.*;
class MaxEleAmongMin1
{
   public static int findMaxEleInSubArr(int a[],int n,int k)
   {
	int max=Integer.MIN_VALUE;
	TreeMap<Integer,Integer> tm=new TreeMap<>();
	for(int i=0;i<k;i++)
	{
	  tm.put(a[i],i);
	}
	max=tm.firstKey();
	for(int i=k;i<n;i++)
	{
	  tm.remove(a[i-k]);
	  tm.put(a[i],i);
	 max=Math.max(max,tm.firstKey());
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