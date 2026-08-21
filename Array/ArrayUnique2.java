import java.util.*;
class ArrayUnique2
{
  public static void main(String... args)
  {
      
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value:");
    int n=sc.nextInt();
    int a[]=new int[n];
    boolean b=true;
    HashSet<Integer> res=new HashSet<>();
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
        if(res.contains(a[i]))
        {
          System.out.println("Array is not Unique");
          b=false;
          break;
         }
         else
         res.add(a[i]);
    }
    if(b)
    System.out.println("Array is Unique");

 
   }
}