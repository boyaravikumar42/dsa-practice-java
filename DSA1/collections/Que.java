package collections;
import java.util.Arrays;

public class Que <T>{
    protected Object[] arr;
    protected int front ,end;
    protected int s=0;
    private final static int SIZE=10;

    public Que(int size)
    {
        arr=new Object[size];
        front=end=0;
    }
    
     public Que()
     {
         this(SIZE);
     }
    
   
    public boolean insert(T ele)
    {
        if(s==arr.length)
        {
            System.out.println("Queue is full..!!!");
            return false;
        }
       
        arr[end]=ele;
        end=(end+1)%arr.length;
        s++;
        return true;
    }
    
    public T remove()
    {
        if(s==0){
            System.out.println("remove from the empty Queue..");
            return null;
        }
        s--;
        T removed=(T)arr[front];
        front=(front+1)%arr.length;
        return removed;
    }
    @SuppressWarnings("unchecked")
    public T peek()
    {
        if(s==0)
        {
            System.out.println("Queue is empty...!!!");
            return null;
        }
        return (T)arr[front];
    }
    public void display()
    {
        if(s==0)
        {
            System.out.println("Queue is empty..!!!");
            return;
        }
       
        for (int i = 0; i < s; i++) {
            System.out.print(arr[(front+i)%arr.length]+"<--"); 
        }
        System.out.println("END");

    }
    @Override
    public String toString()
    {
        return "stack:"+(Arrays.toString(arr))+"size: "+s;
    }
}
