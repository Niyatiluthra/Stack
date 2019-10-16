import java.util.*;
public class BracketValidation
{
  static boolean checkBracket(String s)
  {
    char stack[]=new char[s.length()];
    int top = -1;
    for (int  i = 0; i < s.length(); i++)
    {
        if(s.charAt(i)=='[' || s.charAt(i) =='(' || s.charAt(i)=='{')
            stack[++top] = s.charAt(i);

        else if(s.charAt(i)==']' || s.charAt(i) ==')' || s.charAt(i)=='}')
        { 
            if((stack[top] == '(' && s.charAt(i) == ')') || (stack[top] == '[' && s.charAt(i) == ']') ||( stack[top] == '{' && s.charAt(i) == '}'))
                top--;
        }
    }

    if(top==-1)
        return true;

    return false;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();

    boolean c = checkBracket(s);
    
    if(c == true)
     System.out.println("String is Balanced");
    else
     System.out.println("String is Not Balanced");
  }
}