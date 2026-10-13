import java.util.*;
class CountDistinctEleInSubArr
{
   public static int[] countDistEle(int a[],int n,int k)
   {
	int ans[]=new int[n-k+1];
	int pos=0;
	for(int i=0;i<=n-k;i++)
	{
	  HashSet<Integer> set=new HashSet<>();
	  set.add(a[i]);
	  for(int j=i+1;j<i+k;j++)
	  {
	    set.add(a[j]);
	  }
 	ans[pos++]=set.size();
	}
  return ans;


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
     System.out.println(Arrays.toString(countDistEle(a,n,k)));
  }
}