import java.util.*;
class StackMenuDriven
{
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      Stack<Integer> ans=new Stack<>();
      while(true)
      {
         System.out.println("1.Push\t2.Pop\t3.Display\t4.PeakElement\t5.size\t6.ISEmpty\t7.Exit\n");
	 int ch=sc.nextInt();
         switch(ch)
	{
	  case 1:System.out.println("Enter your element:");        
		 int ele=sc.nextInt();	
	         ans.push(ele);
                 System.out.println(ans);break;
         case 2:int elem=ans.pop();
		System.out.println("Poped element is: "+ elem);
                break;
	case 3:System.out.println("Elements in stack are: ");
	       for(int element:ans)
	        System.out.print(element+"  ");
                System.out.println();
               break;
        case 4:int value=ans.peek();
	       System.out.println("Element present at peak is: "+value);
		break;
        case 5:int s=ans.size();
                System.out.println("Size of stack is: "+ s);
		break;
	case 6:boolean b=ans.isEmpty();
               System.out.println("Stack is Empty: "+b);
	       break;
        default:System.exit(0);
        }
}
  }
}   
