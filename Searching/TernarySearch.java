import java.util.*;
class TernarySearch
{
  public static boolean ternarySearch(int a[],int ele)
  {
      int l=0,r=a.length-1;
      while(l<=r)
      {
	int m1=l+(r-l)/3;
	int m2=r-(r-l)/3;
	if(a[m1]==ele||a[m2]==ele)
	return true;
	else if(ele<a[m1])
	r=m1-1;
	else if(ele>a[m2])
	l=m2+1;
	else
	{
	 r=m2-1;
	 l=m1+1;
        }
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
    System.out.println(ternarySearch(a,x));
    }
}