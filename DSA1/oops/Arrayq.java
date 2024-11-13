package oops;


import java.util.Arrays;

@SuppressWarnings("hiding")
public class Arrayq <T extends Number>
{
    protected  int size;
    protected Object[] arr;
    private static int SIZE=10;
    
    public Arrayq()
    {
        this(SIZE);
    }
    
    public Arrayq(int size) {
        this.arr=new Object[size];
        this.size=0;
    }
    public void add(T ele)
    {
        arr[size++]=ele;
    }
    @SuppressWarnings("unchecked")
    public T remove(){
        return (T)arr[--size];
    }
    public boolean isEmpty()
    {
        return size==0;
    }

    @Override
    public String toString() {
        return ""+Arrays.toString(arr);
    }
    
}