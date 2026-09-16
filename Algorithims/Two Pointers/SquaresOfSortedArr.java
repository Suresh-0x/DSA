import java.util.*;
class SquaresOfSortedArr
{
       static void squareRoot(int a[])
       {
           int l=0,r=a.length-1,k=a.length-1;
           int b[]=new int[a.length];
           while(l<=r)
           {
             int ele1=a[l]*a[l];
             int ele2=a[r]*a[r];
	     if(ele1>ele2)
             {
 		b[k]=ele1;
		k--;
		l++;
	     }
 	    else 
	    {
   		b[k]=ele2;
                k--;
                r--;
	    }
         }
          for(int ele:b)
            System.out.print(ele+"   ");
     }
      public static void main(String... args)
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter n value:");
          int n=sc.nextInt();
          int a[]=new int[n];
          for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
          squareRoot(a);
    }
}
       