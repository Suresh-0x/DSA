import java.util.*;
class BinarySearchTree
{
    static void inorder(int a[],int i)
    {
         if(i>=a.length||a[i]==0)
           return;
        inorder(a,2*i+1);
        System.out.print(a[i]+" ");
        inorder(a,2*i+2);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter root Element:");
        int root=sc.nextInt();
        System.out.println("Enter no of Elements to Insert :");
        int n=sc.nextInt();
        int a[]=new int[100];

        a[0]=root;

        for(int i=1;i<n;i++)
        {
            int x=sc.nextInt();
            int p=0;

            while(true)
            {
                if(x<a[p])
                {
                    int l=2*p+1;
                    if(a[l]==0)
                    {
                        a[l]=x;
                        break;
                    }
                    p=l;
                }
                else
                {
                    int r=2*p+2;
                    if(a[r]==0)
                    {
                        a[r]=x;
                        break;
                    }
                    p=r;
                }
            }
        }

        System.out.println("Inorder:");
        inorder(a,0);
    }
}