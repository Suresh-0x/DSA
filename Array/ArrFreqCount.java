import java.util.*;
class ArrFreqCount
{
   public static void main(String... args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter n value:");
     int n=sc.nextInt();
     int a[]=new int[n];
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<n;i++)
     {
         a[i]=sc.nextInt();
     }
     for(int i=0;i<n;i++)
     {
         if(map.containsKey(a[i]))
          map.put(a[i],map.get(a[i])+1);
         else
         map.put(a[i],1);
     }
     Set<Integer> res=map.keySet();
     System.out.println("element  : frequency \n");
     for(int s:res)
     {
         System.out.println(s+"  :  "+map.get(s));
     }
   }
}