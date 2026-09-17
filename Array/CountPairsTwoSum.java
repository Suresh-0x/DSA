import java.util.*;
class CountPairsTwoSum
{
   static int countPairs(int a[],int target)
  {
    int count=0;
      for(int i=0;i<a.length;i++)
	{
	  for(int j=i+1;j<a.length;j++)
	   {
		if(a[i]+a[j]==target)
		   count++;
	   }
	}
     return  count;
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
       