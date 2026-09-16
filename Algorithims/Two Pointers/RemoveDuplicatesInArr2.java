import java.util.*;
class RemoveDuplicatesInArr2
{
       static int removeDuplicates(int a[])
       {
   
           int i=0,j=0;  
	   while(i<a.length-1)
	   {
	     if(a[i]==a[i+1])
		i++;
	     else 
	     {
		a[j]=a[i];
		i++;
		j++;
	      }
           }
          a[j]=a[i];
	return j+1;
      }
      public static void main(String... args)
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter n value:");
          int n=sc.nextInt();
          int a[]=new int[n];
          for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
          int k=removeDuplicates(a);
          System.out.println("Number of Unique elements is: "+k);
          for(int i=0;i<k;i++)
           System.out.print(a[i]+"  ");
    }
}
       