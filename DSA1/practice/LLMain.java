package practice;

import collections.LL;

public class LLMain {
    public static void main(String[] args) {
        
            LL obj= new LL();
             obj.addFirst(10);
            obj.addFirst(20);
            obj.addFirst(30);
            obj.addFirst(50);
            obj.addLast(30);
            obj.addLast(388);
            obj.addPosition(5, 10);
            obj.addPosition(35, 0); 
            obj.addPosition(675, 3);
            obj.display(); 
        
    }
    

}
