import java.util.*;
public class Main {
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        Integer a[]=new Integer[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Original Array is:\n");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        Arrays.sort(a);
        System.out.println("\nSorted Array is:\n");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");

    }
}
