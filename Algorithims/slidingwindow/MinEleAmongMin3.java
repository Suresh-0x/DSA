import java.util.*;
class MinEleAmongMin3
{
   public static int findMinEleInSubArr(int a[],int n,int k)
   {
	
        Deque<Integer> dq=new ArrayDeque<>();
	int min=Integer.MAX_VALUE;
        for(int i=0;i<k;i++)
        {
            while(!dq.isEmpty()&&a[i]<=a[dq.peekLast()])
            {
                dq.pollLast();
            }
            dq.addLast(i);
        }

        min=a[dq.peekFirst()];
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