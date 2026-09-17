import java.util.*;
public class EquilibriumPoint1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
                int rsum=0;
                int lsum=0;
                for(int k=0;k<i;k++)   
                {
                    lsum=lsum+arr[k];
                }
                for(int k=i+1;k<n;k++)
                {
                    rsum=rsum+arr[k];
                }
                if(lsum==rsum)
                {
                    System.out.println("Equilibrium point is: "+i);
                    break;
                }
        }
    }
}