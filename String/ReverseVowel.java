import java.util.*;
class ReverseVowel
{
  public static String reverse(String s)
  {
    int l=0,r=s.length()-1;
    char ch[]=s.toCharArray();
    String vowels="aeiouAEIOU";
    while(l<r)
    {
       while(l<r&&vowels.indexOf(ch[l])==-1)
       {
          l++;
       }
 	while(l<r&&vowels.indexOf(ch[r])==-1)
        {
          r--;
        }
       if(l<r)
       {
         char c=ch[l];
	 ch[l]=ch[r];
	 ch[r]=c;
        }
      l++;
      r--;
    }
  return new String(ch);
}
  public static void main(String... args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a String:");
   String s=sc.nextLine();
   System.out.println(reverse(s));
 }
}