import java.util.*;
class CountMajorityElements
{
   static int findMajority(int a[],int n)
    {
       LinkedHashMap<Integer,Integer> res=new LinkedHashMap<>();
       ArrayList<Integer> ans=new ArrayList<>();
       for(int i=0;i<n;i++)
       {
         res.put(a[i],res.getOrDefault(a[i],0)+1);
	}
        int k=(int)(Math.floor(n/3));
       for(int m:res.keySet())
       {
          if(res.get(m)>k)
            ans.add(m);
      }
      return ans.size();
    }

  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value: ");
      int n=sc.nextInt();
      int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
	 a[i]=sc.nextInt();
	}
       System.out.println("count of majority elements is :"+findMajority(a,n));
   }
}