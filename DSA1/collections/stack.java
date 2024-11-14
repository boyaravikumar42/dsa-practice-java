package collections;

public class stack {
    protected int[] arr;
    protected int top;
    private final static int SiZE=10;

    public stack(int size)
    {
        arr=new int[size];
        top=-1;
    }
    
     public stack()
     {
         this(SiZE);
     }
    
   
    public void push(int ele)
    {
        if(top==arr.length-1)
        {
            System.out.println("stack is full..!!!");
            return;
        }
        arr[++top]=ele;
    }
    
    public int pop()
    {
        if(top==-1){
            System.out.println("pop from the empty stack");
            return -1;
        }
        return arr[top--];
    }
    public int peek()
    {
        if(top==-1)
        {
            System.out.println("stack is empty...!!!");
            return -1;
        }
        return arr[top];
    }
    public void display()
    {
        if(top==-1)
        {
            System.out.println("stack is empty..!!!");
            return;
        }
       
        for (int i = 0; i <=top; i++) {
            System.out.print(arr[i]+" "); 
        }
        System.out.println("\n");

    }
}
