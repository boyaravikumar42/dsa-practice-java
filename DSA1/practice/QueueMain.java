package practice;

import collections.DynamicQue;
import collections.Que;

public class QueueMain {
    public static void main(String[] args) {
        Que<String> obj=new DynamicQue<>(3);
        obj.insert("ravi");
        obj.insert("alexa");
        obj.insert("neela");
        obj.insert("ai");
        obj.display();
        System.out.println(obj);
        System.out.println(obj.peek());
        System.out.println(obj.remove());
        System.out.println(obj.remove()); 
        System.out.println(obj.remove());
        

          //Stack <Integer> obj;
    }
}


