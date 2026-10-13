import java.util.*;
class MoveZeros1
{ 
   public static void moveZerosLeft(int a[],int n)
   {
         int l=n-1,r=n-1;
	 while(r>=0)
	 {
	   if(a[r]!=0)
           {
		int t=a[r];
		a[r]=a[l];
		a[l]=t;
                l--;
	   }
          r--;
         }

   }
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value:");
 	int n=sc.nextInt();
	int a[]=new int[n];
    for(int i=0;i<n;i++)
	 a[i]=sc.nextInt();
       System.out.println("Answer Array is :  ");
        moveZerosLeft(a,n);
       for(int value:a)
      System.out.print(value+"  ");
   }
}