import java.util.*;
class CountGreaterElemnet
{
   static int countGreaterElements(int a[],int n)
   {
       int max=a[0],count=1;
       for(int i=1;i<n;i++)
       {
         if(a[i]>max)
	{
         count++;
         max=Math.max(max,a[i]);
        }
      }
    return count;
   }
      
   public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value: ");
      int n=sc.nextInt();
      int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
	 a[i]=sc.nextInt();
	}
       System.out.println("count greater elements is :"+countGreaterElements(a,n));
   }
}