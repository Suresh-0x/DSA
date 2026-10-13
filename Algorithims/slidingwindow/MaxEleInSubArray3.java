import java.util.*;
class MaxEleInSubArray3
{
   public static int[] findMaxEleInSubArr(int a[],int n,int k)
   {
	int res[]=new int[n-k+1];
	int p=0;
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<k;i++)
        {
            while(!dq.isEmpty()&&a[i]>=a[dq.peekLast()])
            {
                dq.pollLast();
            }
            dq.addLast(i);
        }

        res[p++]=a[dq.peekFirst()];

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
            res[p++]=a[dq.peekFirst()];
        }
        return res;
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
     System.out.println(Arrays.toString(findMaxEleInSubArr(a,n,k)));
  }
}