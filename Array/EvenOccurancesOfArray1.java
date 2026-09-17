import java.util.*;
class EvenOccurancesOfArray
{
   static ArrayList<Integer> evenOcuuarance(int a[],int n)
    {
       LinkedHashMap<Integer,Integer> res=new LinkedHashMap<>();
       ArrayList<Integer> ans=new ArrayList<>();
       for(int i=0;i<n;i++)
       {
         res.put(a[i],res.getOrDefault(a[i],0)+1);
	}
       for(int m:res.keySet())
       {
          if(res.get(m)%2==0)
           ans.add(m);
       }
      if(ans.size()>0)
      return ans;
      else
       return new ArrayList<>(Arrays.asList(-1));
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
       System.out.println("Elements of even occrances are  :"+evenOcuuarance(a,n));
   }
}