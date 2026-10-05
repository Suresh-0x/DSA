import java.util.*;
class FindNoOf1s1
{
   public static int countOnes(int a[],int n)
   {
     for(int i=0;i<n;i++)
     {
	if(a[i]==1)
	  return n-i;
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