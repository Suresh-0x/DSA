import java.util.*;
class LargestEleInArr2
{ 
public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value: ");
      int n=sc.nextInt();
      int a[]=new int[n];
       int max=0;
	for(int i=0;i<n;i++)
	{
          a[i]=sc.nextInt();
          if(a[i]>max)
          max=a[i];
    
      	}       
        System.out.print("Largest Element is: "+max);
      
   }
}
