import java.util.*;
class MaxEleAmongMin2
{
  public static int findMaxEleInSubArr(int a[],int n,int k)
   {
	int max=Integer.MIN_VALUE;
	PriorityQueue<int []> pq=new PriorityQueue<>((x, y)->Integer.compare(x[0], y[0]));
	for(int i=0;i<k;i++)
	{
	  pq.add(new int[]{a[i],i});
	}
	max=pq.peek()[0];
	for(int i=k;i<n;i++)
	{
	  pq.add(new int[]{a[i],i});
	  while(pq.peek()[1]<=i-k)
	  {
	    pq.poll();
	  }
	 max=Math.max(max,pq.peek()[0]);
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