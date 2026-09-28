import java.util.*;
class BinarSearch1
{
  public static boolean binarySearch(int a[],int ele,int l,int r)
  {
      if(l>r)
      return false;
      while(l<=r)
      {
	int m=l+(r-l)/2;
	if(a[m]==ele)
	return true;
	else if(a[m]>ele)
	return binarySearch(a,ele,l,m-1);
	else
	return binarySearch(a,ele,m+1,r);
      }
       return false;
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
    System.out.println(binarySearch(a,x,0,a.length-1));
    }
}