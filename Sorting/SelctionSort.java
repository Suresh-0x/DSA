import java.util.*;
class SelctionSort
{
  public static void main(String... args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter Array Elements: ");
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    for(int i=0;i<n;i++)
    {
	int index=i;
       for(int j=i+1;j<n;j++)
       {
	 if(a[j]<a[index])
	 {
	   index=j;
	 }
	}
	int t=a[index];
	a[index]=a[i];
	a[i]=t;
		
   }
   for(int x:a)
    System.out.print(x+"  ");
 }
}