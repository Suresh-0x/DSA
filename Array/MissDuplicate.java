import java.util.*;
class MissDuplicate
{
public static void main(String... args)
      {
 	Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:\t");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        int b[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            b[arr[i]]++;
        }
       for(int i=1;i<=n;i++)
       {
           if(b[i]==0)
           System.out.println("Missing Element: "+i);
           if(b[i]==2)
           System.out.println("Duplicate Element: "+i);
        }
  }
}

       