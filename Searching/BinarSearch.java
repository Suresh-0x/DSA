import java.util.*;
class BinarSearch
{
  public static int binarySearch(int a[],int ele)
  {
      int l=0,r=a.length-1;
      while(l<=r)
      {
	int m=l+(r-l)/2;
	if(a[m]==ele)
	return m;
	else if(a[m]>ele)
	r=m-1;
	else
	l=m+1;
      }
       return -1;
   }
  public static void main(String... args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value:");
    int  n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    System.out.println("Enter searching Element");
    int x=sc.nextInt();
    System.out.println(binarySearch(a,x));
    }
}