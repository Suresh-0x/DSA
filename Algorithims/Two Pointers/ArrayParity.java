import java.util.*;
class ArrayParity
{ 
   public static void arrayParity(int a[],int n)
   {
         
       int l=0,r=n-1;
       while(l<r)
       {
	 if(a[l]%2==1&&a[r]%2==0)
	{
	   int t=a[l];
           a[l]=a[r];
	   a[r]=t;
	   l++;
	   r--;
	}
        else if(a[r]%2==0&&a[l]%2==0)
	{
          l++;
	}
	else
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
        arrayParity(a,n);
       for(int value:a)
      System.out.print(value+"  ");
   }
}