class Stack
{
    int stack[]=new int[10];
    int top=-1;
    int min=4225712;

    boolean isEmpty()
    {
        return(top==-1);
    }

    void push(int item)
    {
      if(isEmpty())
        min=item;

      if(min>item)
        min=item;
      
      stack[++top]=item;
    }

    int pop()
    {
      int data;
      if(!isEmpty())
      {
        data=stack[top];
        top--;
        return data;
      }

      return -1;
    }

    int getMin()
    {
      return min;
    }
}

public class MinElement
{
  public static void main(String args[])
  {
    Stack s=new Stack();
    s.push(45);
    s.push(82);
    s.push(78);
    s.push(85);
    s.push(97);
    s.push(10);
    
    System.out.println("Min Element: "+s.getMin());
  }
}