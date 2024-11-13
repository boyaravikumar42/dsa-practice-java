


public class BST {
    protected class Node{
        int val;
        Node left;
        Node right;
        int height; 
        Node(int val)
        {
            this.val=val;
        }
        @Override
        public String toString() {
            return "Node [val=" + val + ", left=" + left.val + ", right=" + right.val + ", height=" + height + "]";
        }
        
    }
    Node root ;
    public void insert(int val)
    {
        if(root==null)
         {
            root=new Node(val);
            return;
         }
        insert(root,val);
    }
    //inserting element in the array
    private Node insert(Node node,int val)
    {
        if(node==null)
        return new Node(val);

        if(node.val > val)
        {
            node.left=insert(node.left,val);
        }
        if(node.val<val)
        {
            node.right=insert(node.right, val);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;


    }
    //height method 
    public int height(Node node)
    {
        if(node==null)
        {
            return -1;
        }
        return node.height;
    }
    //display method
    public void display()
    {
        display(root,0);
    }
    public void display(Node node,int level) {
        if(node==null)
        return ;
        
       display(node.right,level+1);
        if(level!=0)
        {
            for(int i=0;i<level-1;i++)
            {
                System.out.print("|\t");
            }
            System.out.println("|--->"+node.val);

        }
        else{
            System.out.println(node.val);
        }
        display(node.left, level+1);
    }
    //main method
    public static void main(String[] args) {
        BST obj=new BST();
        int[] arr={6,4,3,5,9,8,10};
        for (int i = 0; i < arr.length; i++) {
           obj.insert(arr[i]);
            
        }
        obj.display();
        System.out.println(obj.root);
    }
    



}
