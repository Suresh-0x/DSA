import java.util.*;
class FirstLetter
{
 public static void main(String... args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a String:");
   String s=sc.nextLine();
   String st[]=s.split(" ");
   for(int i=0;i<st.length;i++)
   {
      char ch=st[i].charAt(0);
    System.out.print(ch);
   }
 }
}