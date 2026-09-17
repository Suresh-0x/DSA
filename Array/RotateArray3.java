import java.util.*;
class RotateArray3
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
    
    for(int i=0;i<k;i++)
   {
      int temp=a[a.length-1];
     for(int j=a.length-1;j>0;j--)
     {
        a[j]=a[j-1];
     }
     a[0]=temp;

   }
     System.out.println("After Rotate the Array:");
  for(int i=0;i<a.length;i++)
     System.out.print(a[i]+" ");
 }
}
    