import java.util.*;
class MinAndMaxEleAmongMin3
{
   public static int[] findMinAndMaxEleInSubArr(int a[],int n,int k)
   {
	
        Deque<Integer> dq=new ArrayDeque<>();
	int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++)
        {
            while(!dq.isEmpty()&&a[i]<=a[dq.peekLast()])
            {
                dq.pollLast();
            }
            dq.addLast(i);
        }

        min=a[dq.peekFirst()];
	max=a[dq.peekFirst()];
        for(int i=k;i<n;i++)
        {
            while(!dq.isEmpty()&&dq.peekFirst()<=i-k)
            {
                dq.pollFirst();
            }

            while(!dq.isEmpty()&&a[i]<=a[dq.peekLast()])
            {
                dq.pollLast();
            }

            dq.addLast(i);
            min=Math.min(min,a[dq.peekFirst()]);
	    max=Math.max(max,a[dq.peekFirst()]);

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