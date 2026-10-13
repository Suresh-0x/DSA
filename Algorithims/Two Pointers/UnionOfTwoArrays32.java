import java.util.*;
 class UnionOfTwoArrays32
{
    static ArrayList<Integer> union(int a[],int n,int b[],int m)
    {
        ArrayList<Integer> res=new ArrayList<>();
        int i=0,j=0;
       Arrays.sort(a);
       Arrays.sort(b);
        while(i<n && j<m){
            while(i>0 && i<n && a[i-1]==a[i])  
		i++;
            while(j>0 && j<m && b[j-1]==b[j])  
		j++;
            if(i>=n || j>=m)
                break;
            if(a[i]<b[j])
                res.add(a[i++]);
            else if(a[i]>b[j])
                res.add(b[j++]);
            else{
                res.add(a[i++]);   
		 j++;
            }
        }
        while(i<n){
            if(i==0||a[i]!=a[i-1])
                res.add(a[i]);
            i++;
        }
        while(j<m){
            if(j==0||b[j]!=b[j-1])
                res.add(b[j]);
            j++;
        }
        return res;


    }
    public static void main(String[] args) 
  {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter m&n values:");
        int n=sc.nextInt();
	int m=sc.nextInt();
        int a[]=new int[n];
	int b[]=new int[m];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<m;i++)
            b[i]=sc.nextInt();
        System.out.println("Union Of Two Arrays:"+union(a,n,b,m));
    }
}