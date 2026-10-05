import java.util.*;
class FirstOcuurance1
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
  public static void main(String... args)
   {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
      System.out.println("Enter X value: ");
      int x=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
     System.out.println(firstOccurance(a,n,x));
   }
}