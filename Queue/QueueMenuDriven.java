import java.util.*;
class QueueMenuDriven
{
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      Queue<Integer> ans=new LinkedList<>();
      while(true)
      {
         System.out.println("1.Insert\t2.Delete\t3.Display\t4.PeakElement\t5.size\t6.ISEmpty\t7.Exit\n");
	 int ch=sc.nextInt();
         switch(ch)
	{
	  case 1:System.out.println("Enter your element:");        
		 int ele=sc.nextInt();	
	         ans.add(ele);
                 System.out.println(ans);break;
         case 2:int elem=ans.poll();
		System.out.println("Poped element is: "+ elem);
                break;
	case 3:System.out.println("Elements in Queue are: ");
	       for(int element:ans)
	        System.out.print(element+"  ");
                System.out.println();
               break;
        case 4:int value=ans.peek();
	       System.out.println("Element present at peak is: "+value);
		break;
        case 5:int s=ans.size();
                System.out.println("Queue of stack is: "+ s);
		break;
	case 6:boolean b=ans.isEmpty();
               System.out.println("Queue is Empty: "+b);
	       break;
        default:System.exit(0);
        }
}
  }
}   
