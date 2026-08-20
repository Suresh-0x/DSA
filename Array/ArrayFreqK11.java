import java.util.*;
class ArrayFreqK11
{
  public static void main(String... args)
  {
      
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value:");
    int n=sc.nextInt();
    System.out.println("Enter K value: ");
    int k=sc.nextInt();
    int a[]=new int[n];
    TreeMap<Integer,Integer> res=new TreeMap<>();
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
        res.put(a[i],res.getOrDefault(a[i],0)+1);
     }
   Set<Integer> s=res.keySet();
   for(int m:s)
   {
        if(res.get(m)<=k)
          System.out.print(m+"   ");
    }

    }
}