import java.util.*;
class MinHeap2
{ 
public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value: ");
      int n=sc.nextInt();
       PriorityQueue<String> pq=new PriorityQueue<>();
	for(int i=0;i<n;i++)
	{
	   String  x=sc.next();
           pq.add(x);
	}
     Iterator it=pq.iterator();
     System.out.println("Output");
     while(it.hasNext())
     {
       
        System.out.print(it.next()+"  ");
      }
   }
}
