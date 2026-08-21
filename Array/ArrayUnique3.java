import java.util.*;
class ArrayUnique3
{
  public static void main(String... args)
  {
      
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value:");
    int n=sc.nextInt();
    int a[]=new int[n];
    boolean b=true;
    HashMap<Integer,Integer> res=new HashMap<>();
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
        if(res.containsKey(a[i]))
        {
          System.out.println("Array is not Unique");
          b=false;
          break;
         }
         else
         res.put(a[i],0);
    }
    if(b)
    System.out.println("Array is Unique");

 
   }
}