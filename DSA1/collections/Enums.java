package collections;



public class Enums {
    
    enum Ravi
{
    raju,ashok,mahesh,ravi,myself;
    Ravi()
    {
        System.out.println("constructor was created--"+this);
    }
    public void wish()
    {
     System.out.println("hi, "+this);
    }
}
    public static void main(String[] args) {
        {
            Ravi obj=Ravi.ashok;
            obj.wish();
            System.out.println(obj);
        }
    }
    
}
