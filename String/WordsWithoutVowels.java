import java.util.*;
class WordsWithoutVowels
{
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String arr[]=s.split(" ");
      for(int j=0;j<arr.length;j++)
      {
         boolean b=true;
         for(int i=0;i<arr[j].length();i++)
         {
           char ch=arr[j].charAt(i);
           if(ch=='a'||ch=='u'||ch=='e'||ch=='i'||ch=='o')
	   {
            b=false;
            break;
           }
         }
         if(b)
       System.out.print(arr[j]+"  ");

     }
  }
}