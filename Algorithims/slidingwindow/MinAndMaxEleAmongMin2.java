import java.util.*;
class MinAndMaxEleAmongMin2
{
  public static int[] findMinAndMaxEleInSubArr(int a[],int n,int k)
   {
	int min=Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;
	PriorityQueue<int []> pq=new PriorityQueue<>((x, y)->Integer.compare(x[0], y[0]));
	for(int i=0;i<k;i++)
	{
	  pq.add(new int[]{a[i],i});
	}
	min=pq.peek()[0];
	max=pq.peek()[0];
	for(int i=k;i<n;i++)
	{
	  pq.add(new int[]{a[i],i});
	  while(pq.peek()[1]<=i-k)
	  {
	    pq.poll();
	  }
	 min=Math.min(min,pq.peek()[0]);
	 max=Math.max(max,pq.peek()[0]);

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