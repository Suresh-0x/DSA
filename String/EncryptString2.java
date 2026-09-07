import java.util.*;
class EncryptString2
{
    public static String encode(String s) 
    {
       char ch[]=s.toCharArray();
       int count=0;
       StringBuilder st=new StringBuilder();
       for(int i=1;i<ch.length;i++)
       {
           if(ch[i]==ch[i-1])
           count++;
           else
           {
               st.append(count+1);
 	       st.append(ch[i-1]);
               count=0;
           }
       }
       st.append(count+1);
       st.append(ch[ch.length-1]);
       return st.toString();
    }
  public static void main(String... args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a String:");
   String s=sc.next();
   System.out.println(encode(s));
  }
}