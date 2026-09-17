import java.util.*;
class FindLeaders
{
      public static void findLeaders(int a[])
     {
 	ArrayList<Integer> res=new ArrayList<>();
        res.add(a[a.length-1]);
        int max=a[a.length-1];
        for(int i=a.length-2;i>=0;i--)
        {
           if(a[i]>=max)
           {
              max=a[i];
              res.add(0,a[i]);
 	    }
 	}
       System.out.println("Leaders in an Array is:\n"+ res);
      }
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
      findLeaders(arr);
   }
}
