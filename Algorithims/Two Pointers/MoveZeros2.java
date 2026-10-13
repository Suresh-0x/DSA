import java.util.*;
class MoveZeros2
{ 
   public static void moveZerosLeft(int a[],int n)
   {
         int l=0,r=0;
	 while(r<n)
	 {
	   if(a[r]!=0)
           {
		int t=a[r];
		a[r]=a[l];
		a[l]=t;
                l++;
	   }
          r++;
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