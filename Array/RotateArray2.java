import java.util.*;
class RotateArray2
{
  public static void main(String... args)
  {
      
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value:");
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	a[i]=sc.nextInt(); 
    }
    int temp=a[a.length-1];
    for(int i=a.length-1;i>0;i--)
    {
       a[i]=a[i-1];
    }
   a[0]=temp;
  System.out.println("After Rotate the Array:");
  for(int i=0;i<a.length;i++)
     System.out.print(a[i]+" ");
 }
}
    