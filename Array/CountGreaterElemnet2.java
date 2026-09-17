import java.util.*;
class CountGreaterElemnet2
{
   static ArrayList<Integer> countGreaterElements(int a[],int n)
   {
       int max=a[0];
      ArrayList<Integer> res=new ArrayList<>();
      res.add(a[0]);
       for(int i=1;i<n;i++)
       {
         if(a[i]>max)
	{
         res.add(a[i]);
         max=Math.max(max,a[i]);
        }
      }
    return res;
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