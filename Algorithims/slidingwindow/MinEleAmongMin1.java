import java.util.*;
class MinEleAmongMin1
{
   public static int findMinEleInSubArr(int a[],int n,int k)
   {
	int min=Integer.MAX_VALUE;
	TreeMap<Integer,Integer> tm=new TreeMap<>();
	for(int i=0;i<k;i++)
	{
	  tm.put(a[i],i);
	}
	min=tm.firstKey();
	for(int i=k;i<n;i++)
	{
	  tm.remove(a[i-k]);
	  tm.put(a[i],i);
	 min=Math.min(min,tm.firstKey());
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