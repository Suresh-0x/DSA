import java.util.*;
class MissingElement44
{
      public static void main(String... args)
      {
 	Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:\t");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n-1;i++)
        {
          arr[i]=sc.nextInt();
        }
        boolean b[]=new boolean[n+1];
       for(int i=0;i<arr.length-1;i++)
       {
           b[arr[i]]=true;
       }
       for(int i=1;i<b.length;i++)
       {
         if(!b[i])
         {
            System.out.println("Missing element is: "+i);
         }
       }        
     }
}
    