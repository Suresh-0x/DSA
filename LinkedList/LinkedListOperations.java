import java.util.*;
class LinkedListOperations
{
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        List<Integer> li=new LinkedList<>();
        while(true)
        {
            System.out.println("1.Add\t2.Remove\t3.Display\t4.Search\t5.size\t6.Exit");
            System.out.println("Enter your choice:");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("1.Add\t2.Insert\t3.Addfirst\t4.Exit");
                    System.out.println("Enter your choice:");
                    while(true)
                    {
                        int ch1=sc.nextInt();
                        switch(ch1)
                        {
                            case 1:
                                System.out.println("Enter element:");
                                int ele5=sc.nextInt();
                                li.add(ele5);
                                System.out.println(li);
                                break;
                            case 2:
                                System.out.println("Enter Position:");
                                int pos=sc.nextInt();
                                System.out.println("Enter element:");
                                int ele6=sc.nextInt();
                                li.add(pos,ele6);
                                System.out.println(li);
                                break;
                            case 3:
                                System.out.println("Enter element:");
                                int ele4=sc.nextInt();
                                li.addFirst(ele4);
                                System.out.println(li);
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                        if(ch1==4)
                            break;
                        System.out.println("Enter your choice:");
                    }
                    break;
                case 2:
                    System.out.println("1.Remove\t2.RemoveFirst\t3.RemoveLast\t4.clear\t5.exit");
                    System.out.println("Enter your choice:");
                    while(true)
                    {
                        int ch2=sc.nextInt();
                        switch(ch2)
                        {
                            case 1:
                                System.out.println("Enter position:");
                                int pos=sc.nextInt();
                                li.remove(pos);
                                System.out.println(li);
                                break;
                            case 2:
                                li.removeFirst();
                                System.out.println(li);
                                break;
                            case 3:
                                li.removeLast();
                                System.out.println(li);
                                break;
                            case 4:
                                li.clear();
                                System.out.println(li);
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                        if(ch2==5)
                            break;
                        System.out.println("Enter your choice:");
                    }
                    break;
                case 3:
                    System.out.println("1.Get\t2.GetFirst\t3.GetLast\t4.exit");
                    System.out.println("Enter your choice:");
                    while(true)
                    {
                        int ch3=sc.nextInt();
                        switch(ch3)
                        {
                            case 1:
                                System.out.println("Enter position:");
                                int pos=sc.nextInt();
                                int ans=li.get(pos);
                                System.out.println("Element: "+ans);
                                break;
                            case 2:
                                int ans1=li.getFirst();
                                System.out.println("First element: "+ans1);
                                break;
                            case 3:
                                int ans2=li.getLast();
                                System.out.println("Last element: "+ans2);
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                        if(ch3==4)
                            break;
                        System.out.println("Enter your choice:");
                    }
                    break;
                case 4:
                    System.out.println("1.Contains\t2.IndexOf\t3.LastIndexOf\t4.exit");
                    System.out.println("Enter your choice:");
                    while(true)
                    {
                        int ch4=sc.nextInt();
                        switch(ch4)
                        {
                            case 1:
                                System.out.println("Enter element:");
                                int ele1=sc.nextInt();
                                boolean b=li.contains(ele1);
                                System.out.println("Contains: "+b);
                                break;
                            case 2:
                                System.out.println("Enter element:");
                                int ele2=sc.nextInt();
                                int ans=li.indexOf(ele2);
                                System.out.println("Index: "+ans);
                                break;
                            case 3:
                                System.out.println("Enter element:");
                                int ele3=sc.nextInt();
                                int ans3=li.lastIndexOf(ele3);
                                System.out.println("Last Index: "+ans3);
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                        if(ch4==4)
                            break;
                        System.out.println("Enter your choice:");
                    }
                    break;
                case 5:
                    System.out.println("LinkedList size is: "+li.size());
                    break;
                case 6:
                    System.out.println("Program exited.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}