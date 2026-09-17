import java.util.*;
class RotateArray
{
  public static void main(String... args)
  {
      
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value:");
    int n=sc.nextInt();
    ArrayList<Integer> a=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
    	a.add(sc.nextInt()); 
    }
    a.add(0,a.get(a.size()-1));
    a.remove(a.size()-1);
  System.out.println("After Rotate the Array:");
  System.out.println(a);
}
}
    