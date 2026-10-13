import java.util.*;
class MaxEleInSubArray7
{
   public static int findMaxEleInSubArr(int a[],int n,int k)
   {
	int max=Integer.MIN_VALUE;
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<k;i++)
        {
            while(!dq.isEmpty()&&a[i]>=a[dq.peekLast()])
            {
                dq.pollLast();
            }
            dq.addLast(i);
        }
        max=a[dq.peekFirst()];
        for(int i=k;i<n;i++)
        {
            while(!dq.isEmpty()&&dq.peekFirst()<=i-k)
            {
                dq.pollFirst();
            }

            while(!dq.isEmpty()&&a[i]>=a[dq.peekLast()])
            {
                dq.pollLast();
            }

            dq.addLast(i);
            if(a[dq.peekFirst()]>max)
	      max=a[dq.peekFirst()];
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