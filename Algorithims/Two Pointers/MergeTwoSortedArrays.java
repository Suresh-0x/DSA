import java.util.*;
class MergeTwoSortedArrays
{
   public static void main(String... args)
   {
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
	int m=sc.nextInt();
	int a[]=new int[n+m];
	int b[]=new int[m];
	for(int i=0;i<n;i++)
	 a[i]=sc.nextInt();
        for(int i=0;i<m;i++)
	  b[i]=sc.nextInt();
        int p1=n-1;
	int p2=m-1;
	int p3=m+n-1;
	while(p1>=0&&p2>=0)
	{
	   if(a[p1]>b[p2])
	   {
	     a[p3]=a[p1];
	      p1--;
	   }
	  else
	  {
	    a[p3]=b[p2];
	    p2--;
	  }
         p3--;
        }
        while(p2>=0)
	{
           a[p3]=b[p2];
           p2--;
	   p3--;
	}
        for(int ele:a)
       System.out.print(ele+"  ");
    }
}
