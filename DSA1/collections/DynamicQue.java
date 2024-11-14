package collections;

public class DynamicQue<T> extends Que<T>{

    public DynamicQue()
    {
        super();
    }
    public DynamicQue(int size)            
    {
        super(size);
    }
    @Override
    public boolean insert(T ele)
    {
        if(s==arr.length)
        {
            Object temp[]=new Object[arr.length*2];
            for(int i=0;i<s;i++)
            {
                temp[i]=(T)arr[i];
            }
            arr=temp;
            front=0;
            end=s;
           
        }
        return super.insert(ele);

    }
}
  
