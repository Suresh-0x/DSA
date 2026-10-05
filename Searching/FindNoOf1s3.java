import java.util.*;
class FindNoOf1s3
{
   public static int countOnes(int a[],int n)
   {
     for(int i=n-1;i>=0;i--)
     {
	if(a[i]==1)
	  return i+1;
     }
   return 0;
     	
   }
  public static void main(String... args)
   {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
      int a[]=new int[n];
     for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
    System.out.println(countOnes(a,n));
   }
}