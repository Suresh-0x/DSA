import java.util.*;
class CountPairsTwoSum1
{
   static int countPairs(int a[],int target)
  {
       int count=0;
       Arrays.sort(a);
       int l=0,r=a.length-1;
       while(l<r)
	{
           int sum=a[l]+a[r];
	   if(sum>target)
           r--;
          else if(sum<target)
            l++;
          else
          {
	    int c1=0,c2=0,x1=a[l],x2=a[r];
	    while(l<=r&&x1==a[l])
            {
		l++;
		c1++;
	    }
	    while(l<=r&&x2==a[r])
	    {
              r--;
              c2++;
	     }
           if(x1==x2)
 		count=count+(c1*(c1-1))/2;
           else
            count=count+(c1*c2);
         }
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
       