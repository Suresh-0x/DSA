import java.util.*;
class LargestEleInArr3
{ 
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
	Arrays.sort(a);       
        System.out.print("Largest Element is: "+a[n-1]);
      
   }
}
