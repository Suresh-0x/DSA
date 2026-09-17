import java.util.*;
class CountPairsTwoSum2
{
   static int countPairs(int a[],int target)
  {
       int count=0;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<a.length;i++)
	{
	  int ele=target-a[i];
          if(map.containsKey(ele))
	    count+=map.get(ele);
         map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
     	  
           return count;
  }

   public static void main(String... args)
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter n value:");
          int n=sc.nextInt();
          int a[]=new int[n];
          for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
	  System.out.println("Enter target value:");
          int target=sc.nextInt();
        System.out.println("Total Pairs: "+countPairs(a,target));
    }
}
       