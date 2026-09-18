import java.util.*;
class  ContainerWithMostWater
{
   public static void main(String... args)
   {
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	 a[i]=sc.nextInt();
       int l=0,r=n-1;
       int max=Integer.MIN_VALUE;
       while(l<r)
       {
	 int diff=r-l;
         int value=diff*Math.min(a[l],a[r]);
	if(value>max)
          max=value;
       if(a[l]<a[r])
          l++;
       else
        r--;
       }  
System.out.println(max);
}
}