package practice;

import collections.DLL;

public class DLMain {
    
    public static void main(String[] args) {
        DLL obj= new DLL();
        obj.display();
        obj.addFirst(239);
        obj.addFirst(2398);
        obj.addLast(744 );
      
       obj.addPosition(22, 4);
       obj.display();
       System.out.println(obj.removePos(2));
       System.out.println(obj.removeFirst());
       System.out.println(obj.removeLast());
      // System.out.println(obj.removeFirst());

        obj.display();
    }
}


