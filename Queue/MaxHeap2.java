import java.util.*;
class MaxHeap2
{ 
public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value: ");
      int n=sc.nextInt();
       PriorityQueue<String> pq=new PriorityQueue<>(Collections.reverseOrder());
	for(int i=0;i<n;i++)
	{
	   int x=sc.nextInt();
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
