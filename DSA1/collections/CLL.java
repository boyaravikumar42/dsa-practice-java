package collections;

public class CLL {

    public class Node
    {
        int val;
        Node next;

        public Node() {
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
        public Node(int val){
            this.val=val;
        }
        
    }
    private Node head , tail ;
    public CLL()
    {
        head=tail=null;
    }

    public void add(int val)
    {
        Node node=new Node(val);
        if(head==null)
        {
            head=tail=node;
            tail.next=head;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void display()
    {
        Node temp=head;
        if(temp==null)
        return;
        do { 
            System.out.print(temp.val+"-->");
            temp=temp.next;
            
        } while (temp!=head);
        System.out.println("END");
    }
    //method to remove from the end
    public Node remove()
    {   
        Node temp=head;
        if(head==tail)
        {
            head=tail=null;
            return temp;

        }
        while(temp.next!=tail)
        {
            temp=temp.next;
        }
        Node res=temp.next;
        temp.next=head;
        tail=temp;
        return res;
    }


}
