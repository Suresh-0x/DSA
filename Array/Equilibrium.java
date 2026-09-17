import java.util.*;
class Equilibrium
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
          sum+=arr[i];
        }
        int lsum=0;
        boolean b=false;
       for(int i=0;i<n;i++)
       {
          sum=sum-arr[i];
          if(sum==lsum)
          {
            System.out.println("Equilibrium point is: "+i);
            b=true;
            break;
      	  }
          lsum=lsum+arr[i];
       }
       if(b==false)
       System.out.println(-1);
    }
}

       