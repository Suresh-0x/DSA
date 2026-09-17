import java.util.*;
class SortBy012S
{
   static void sortNumbers(int a[])
  {
     int zc=0,oc=0,tc=0;
     for(int i=0;i<a.length;i++)
     {
	if(a[i]==0)
	zc++;
	else if(a[i]==1)
        oc++;
    	else
	tc++;
     }
    int m=0;
    int ans[]=new int[zc+oc+tc];
     for(int i=0;i<zc;i++)
     {
      ans[m]=0;
      m++;
     }
     for(int i=0;i<oc;i++)
     {
      ans[m]=1;
      m++;
     }
     for(int i=0;i<tc;i++)
     {
      ans[m]=2;
      m++;
     }
  for(int ele:ans)
     System.out.print(ele+"   ");

    
  }

   public static void main(String... args)
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter n value:");
          int n=sc.nextInt();
          int a[]=new int[n];
          for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
	 sortNumbers(a);
    }
}
       