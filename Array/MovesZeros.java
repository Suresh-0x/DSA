import java.util.*;
class MovesZeros
{
    public static void main(String... args)
      {
 	Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:\t");
        int n=sc.nextInt();
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        int k=0;
       int b[]=new int[n];
      for(int i=0;i<arr.length;i++)
      {
           if(arr[i]!=0)
           {
             b[k]=arr[i];
             k++;
           }
       }
        for(int i=0;i<b.length;i++)
      	{
         System.out.print(b[i]+"  ");
      	}
        
   }
}