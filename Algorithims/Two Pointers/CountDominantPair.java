import java.util.*;
class CountDominantPair 
{ 
   public static int dominantPair(int a[],int n)
   {
         Arrays.sort(a,0,n/2);
	 Arrays.sort(a,n/2,n);
         int l=0,r=n/2,count=0;
	 while(l<n/2&&r<n)
         {
	    if(a[l]>=5*a[r])
	    {
	      count+=(n/2-l);
	      r++;
            }
            else 
	    l++;
         }
        return count;     
   }
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value:");
 	int n=sc.nextInt();
	int a[]=new int[n];
      for(int i=0;i<n;i++)
	 a[i]=sc.nextInt();
      System.out.println("No of Pairs is: "+dominantPair(a,n));
   }
}