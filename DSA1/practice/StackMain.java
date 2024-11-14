package practice;

import collections.DynamicStack;
import collections.stack;

public class StackMain {
    public static void main(String[] args) {
        stack obj=new DynamicStack(5);
        obj.push(10);
        obj.push(21);
        obj.push(23);
        obj.push(87);
        obj.push(45);
        obj.push(47);
        obj.push(10);
        obj.push(21);
        obj.push(23);
        obj.push(87);
        obj.push(45);
        obj.push(47);
        obj.display();

        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        obj.display();

        

        
    }
}
