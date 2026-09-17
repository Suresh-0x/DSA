import java.util.*;
class SmallestEleInArr2
{ 
public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value: ");
      int n=sc.nextInt();
      int a[]=new int[n];
       int min=Integer.MAX_VALUE;
	for(int i=0;i<n;i++)
	{
          a[i]=sc.nextInt();
          if(a[i]<min)
            min=a[i];
    
      	}       
        System.out.print("Smallest Element is: "+min);
      
   }
}
