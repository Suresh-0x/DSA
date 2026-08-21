import java.util.*;
class ArrayUnique1
{
  public static void main(String... args)
  {
      
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value:");
    int n=sc.nextInt();
    int a[]=new int[n];
    HashSet<Integer> res=new HashSet<>();
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
        res.add(a[i]);
     }
  if(res.size()==n)
  System.out.println("Array is Unique");
  else
  System.out.println("Array is not Unique");
  }
}