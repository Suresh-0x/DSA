import java.util.*;
class SortByValue implements Comparator<int[]>
{
   public int compare(int a[],int b[])
   {
	return b[0]-a[0];
   }
}
class MinAndMaxEleAmongMax2
{
  
   public static int findMinEleInSubArr(int a[],int n,int k)
   {
	int min=Integer.MAX_VALUE;
	PriorityQueue<int []> pq=new PriorityQueue<>(new SortByValue());
	for(int i=0;i<k;i++)
	{
	  pq.add(new int[]{a[i],i});
	}
	min=pq.peek()[0];
	for(int i=k;i<n;i++)
	{
	  pq.add(new int[]{a[i],i});
	  while(pq.peek()[1]<=i-k)
	  {
	    pq.poll();
	  }
	    min=Math.min(min,pq.peek()[0]);
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