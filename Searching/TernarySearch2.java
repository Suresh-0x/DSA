import java.util.*;
class TernarySearch2
{
  public static int ternarySearch(int a[],int ele,int l,int r)
  {
	if(l>r)
	return -1;
      while(l<=r)
      {
	int m1=l+(r-l)/3;
	int m2=r-(r-l)/3;
	if(a[m1]==ele||a[m2]==ele)
	return m1;
	else if(ele<a[m1])
	return ternarySearch(a,ele,l,m1-1);
	else if(ele>a[m2])
	return ternarySearch(a,ele,m2+1,r);
	else
	{
	 return ternarySearch(a,ele,m1+1,m2-1);
        }
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
    System.out.println(ternarySearch(a,x,0,a.length-1));
    }
}