import java.util.*;
class BinaryTree
{
    protected class Node
    {
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    private Node root;
    public void insert(int val)
    {
        Scanner scanner=new Scanner(System.in);
         root=new Node(val);
         insert(root,scanner);
    
    }

    public void insert(Node node,Scanner s)
    {
       
        System.out.println("do you want to insert left");
        boolean flag=s.nextBoolean();
        if(flag)
        {
            System.out.println("enter the left side value");
            int leftval=s.nextInt();
            Node left=new Node(leftval);
            node.left=left;
            insert(node.left,s);
        }
        System.out.println("do you want to insert right");
         flag=s.nextBoolean();
        if(flag)
        {
            System.out.println("enter the right side value");
            int rightVal=s.nextInt();
            Node right=new Node(rightVal);
            node.right=right;
            insert(node.right,s);
        }
    }
        public void display()
        {
            display(root);
            System.out.print("End");
        
        }
        public void display(Node node)
        {
            if(node!=null)
            {
                System.out.print(node.val+"-->");
                display(node.left);
                display(node.right);
            }
        }

    
    public static void main(String[] args) {
        BinaryTree obj=new BinaryTree();
        obj.insert(10);
        obj.display();
    }
}