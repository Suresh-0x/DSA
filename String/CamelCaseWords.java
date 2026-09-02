import java.util.*;
class CamelCaseWords
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                count++;
            }
            
        }
        System.out.println(count+1);
    }
}
