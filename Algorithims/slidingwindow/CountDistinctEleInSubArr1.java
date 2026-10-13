import java.util.*;
class CountDistinctEleInSubArr1
{
   public static int[] countDistEle(int a[],int n,int k)
   {
	HashMap<Integer,Integer> map=new HashMap<>();
	int ans[]=new int[n-k+1];
	int pos=0;
	for(int i=0;i<k;i++)
	{
	  map.put(a[i],map.getOrDefault(a[i],0)+1);
	}
	ans[pos++]=map.size();
	for(int i=k;i<n;i++)
	{
	  int v=map.get(a[i-k]);
	  if(v==1)
	  map.remove(a[i-k]);
	  else
	  map.put(a[i-k],v-1);
	map.put(a[i],map.getOrDefault(a[i],0)+1);
	ans[pos++]=map.size();	
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