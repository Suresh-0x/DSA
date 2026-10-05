import java.util.*;
class FirstAndLastAndFreq1
{
   public static int firstOccurance(int a[],int n,int x)
   {
	for(int i=0;i<n;i++)
	{
	  if(a[i]==x)
	   return i;
        }
  return -1;
  }
public static int lastOccurance(int a[],int n,int x)
   {
	for(int i=n-1;i>=0;i--)
	{
	  if(a[i]==x)
	   return i;
        }
  return -1;
  }
  public static void main(String... args)
   {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
      System.out.println("Enter X value: ");
      int x=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
     int ans1=lastOccurance(a,n,x);
     int ans2=firstOccurance(a,n,x);
     int f=(ans1-ans2)+1;
    System.out.println("[ "+ans2+"  "+ans1+"  "+f+" ]");
   }
}