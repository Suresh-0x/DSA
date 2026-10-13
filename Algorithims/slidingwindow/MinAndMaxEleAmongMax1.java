import java.util.*;
class MinAndMaxEleAmongMax1
{
   public static int[] findMinAndMaxEleInSubArr(int a[],int n,int k)
   {
	
	TreeMap<Integer,Integer> tm=new TreeMap<>();
	int min=Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;
	for(int i=0;i<k;i++)
	{
	  tm.put(a[i],tm.getOrDefault(a[i], 0)+1);
	}
	min=tm.lastKey();
	max=tm.lastKey();
	for(int i=k;i<n;i++)
      	{
    	  if(tm.get(a[i-k]) == 1)
          tm.remove(a[i-k]);
    	 else
          tm.put(a[i-k], tm.get(a[i-k]) - 1);
   	 tm.put(a[i], tm.getOrDefault(a[i], 0) + 1);
    	min=Math.min(min, tm.lastKey());
    	max=Math.max(max, tm.lastKey());
     	}
return new int[]{min,max};

   }   public static void main(String... args)   
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