package collections;

public class DynamicStack extends stack {
   
    
    public DynamicStack(int size)
    {
        super(size);
    }
    

    public DynamicStack() 
    { 
        super();
    }
    @Override
    public void push(int ele)
    {
        if(top==arr.length-1)
        {
            int[] temp=new int[arr.length*2];
            for(int i=0;i<=top;i++)
            {
                temp[i]=arr[i];
            }
            arr=temp;
        }
        super.push(ele);
    }
}
