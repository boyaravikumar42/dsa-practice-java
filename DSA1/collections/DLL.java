package collections;

public class DLL {

    private class Node
    {
        private int val;
        private Node next;
        private Node prev;
        public Node(){}
       
        public Node(int a)
        {
            this.val=a;
        }

        public Node(int val,Node prev, Node next) {
            this.val = val;
            this.next = next;
            this.prev=prev;
        }

        @Override
        public String toString() {
          
            return ""+val;
        }
       
        
    }
     private Node front;
     private int size;
    public DLL(){
        front=null;
        this.size=0;
    }
    //insertion at the first position
    public void addFirst(int a){
        Node temp=new Node(a);
        if(front==null)
        {
            front=temp;

        }
        else {
            temp.next=front;
            front.prev=temp;
            front=temp;
        }
        size++;
    }
    //dispaly function
    public void display()
    {
       Node temp=front;
       while(temp!=null)
       {
        System.out.print(temp.val+"<-->");
        temp=temp.next;
       }
       System.out.println("END");
    }
    //insertion at the last 
    public void addLast(int a)
    {  Node temp=new Node(a);
        if(front==null)
        {
            front=temp;
        }
        else
        {
            Node node = getNode(size-1);
            node.next=temp;
            temp.prev=node;

        }
        size++;
    }
    //adding at the position
    public void addPosition(int val ,int index)
    {
        if(index<=0)
       {
        addFirst(val);
        return;
       }
        if(index>=size)
        {
            addLast(val);
            return ;
        }
        Node temp=getNode(index-1);
        Node node=new Node(val);
       
        node.next=temp.next;
        temp.next=node;
        temp.next.prev=temp;
        node.next.prev=node;
        size++;


    }
    // function to return the node at position
    public Node getNode(int index)
    { 
        Node temp=front;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;

    }


    public int size()
    {
        return size;
    }


    // method delete the node at the first;


 public Node  removeFirst()
    {
        if(front==null)
        {
            System.err.println("LL does not exist");
            return null;
        }
        Node res=front;
        front=front.next;
        res.next=null;
        front.prev=null;
        size--;
        return res;
        
    }

    //method remove at the end of the linkedlist
    public Node removeLast()
    {
        if(front==null)
       { System.out.println("LL does not exist to delete at the end");
        return null;
      }

        if(size==1)
        {
            return removeFirst();
        }
        Node temp=getNode(size-2);
        Node res=temp.next;
        temp.next=null;
        res.prev=null;
        return res;
        


    }
    //method to remove at the position
    //it will take index as input and remove the element at the positon
    public Node removePos(int index)
    {   
        if(front==null || index<0 ||index>=size)
        return null;
        if(index==0)
        return removeFirst();
        if(index==size-1)
        return removeLast();
        Node node =getNode(index-1);
        Node temp=node.next;
        node.next=temp.next;
       node.next.prev=node;
       temp.next=temp.prev=null;
        size--;
        return temp;
    } 

}
