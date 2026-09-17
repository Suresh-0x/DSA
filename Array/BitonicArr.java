import java.util.*;
class BitonicArr
{
  static String checkIsBitonic(int a[],int n)
  {
     int l=0,r=n-1;
     while(l<r)
     {
        int m=(l+r)/2;
 	if(a[m]<a[m+1])
        l=m+1;
        else
        r=m;
      }
      int peakIndex=l;
      for(int i=1;i<=peakIndex;i++)
       {
         if(a[i]<=a[i-1])
          return "NO";
       }
      for(int i=peakIndex+1;i<n;i++)
      {
	 if(a[i]>=a[i-1])
           return "NO";
      }
 return "YES";
}
  public static void main(String... args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("The Given array is:"+checkIsBitonic(a,n));
   }
}