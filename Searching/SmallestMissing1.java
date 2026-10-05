import java.util.*;
class SmallestMissing1
{
   public static int sMissingEle(int a[],int n)
   {
	for(int i=0;i<n;i++)
	{
	  if(i!=a[i])
	  return i;
	}
	return -1;
   }
  public static void main(String... args)
   {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
    System.out.println(sMissingEle(a,n));
   }
}