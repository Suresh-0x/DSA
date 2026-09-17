import java.util.*;
class FindLeaders22
{
      public static void findLeaders(int a[])
     {
 	ArrayList<Integer> res=new ArrayList<>();
       
         for(int i=0;i<a.length;i++)
        {
           boolean b=true;
          for(int j=i+1;j<a.length;j++)
          {
             if(a[i]<a[j])
             {
                b=false;
                break;
              
              }
          }
          if(b)
          res.add(a[i]);
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
