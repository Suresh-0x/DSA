import java.util.*;
class RotateArray6
{
  public static void main(String... args)
  {
      
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value:");
    int n=sc.nextInt();
    System.out.println("Enter k value:");
    int k=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	a[i]=sc.nextInt(); 
    }
    
    for(int j=0;j<k;j++)
   {
      int temp=a[0];
    for(int i=0;i<a.length-1;i++)
    {
       a[i]=a[i+1];
    }
   a[n-1]=temp;

   }
     System.out.println("After Rotate the Array:");
  for(int i=0;i<a.length;i++)
     System.out.print(a[i]+" ");
 }
}
    