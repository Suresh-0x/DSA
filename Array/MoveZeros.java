import java.util.*;
class MoveZeros
{
   public static void main(String... args)
   {
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	 a[i]=sc.nextInt();
	int f=0,r=0;
	for(int i=0;i<n;i++)
	{
	  if(a[r]!=0)
	  {
	    int t=a[r];
	    a[r]=a[f];
   	    a[f]=t;
	    f++;
	    r++;
	}
        else
         r++;
	}
      for(int num:a)
	System.out.print(num+"  ");
     }
}