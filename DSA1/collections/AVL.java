public class AVL extends BST{
    
   
    @Override
    public void insert(int val) {
        root=insert(root,val);

    }
    public Node insert(Node node,int val)
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
        return rotate(node);

    }
    private Node rotate(Node node)
    {
        if(height(node.left)-height(node.right)>1)//left tree heavy
        {
            if(height(node.left.left)-height(node.left.right)>0)//left-left heavy
            {
                return rightRotate(node);
            }
            if(height(node.left.left)-height(node.left.right)<0)//left-right heavy
            {
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
            
        }
        if(height(node.left)-height(node.right)<-1)//right tree heavy
        {
            if(height(node.right.left)-height(node.right.right)<0)// right - left
            {
                return leftRotate(node);
            }
            if(height(node.right.left)-height(node.right.right)>0)
            {
                node.right=rightRotate(node.left);
                return leftRotate(node);
            }
            
        }
        return node;
    }
    private Node leftRotate(Node p)
    {
        Node c=p.right;
        p.right=c.left;
        c.left=p;
        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
        return c;

    }
    private Node rightRotate(Node p)
    {
        Node c=p.left;
        p.left=c.right;
        c.right=p;
        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
        return c;
    }
    //main method 
    public static void main(String[] args) {
        AVL obj=new AVL();
        for (int i = 1; i < 1000; i++) {
            obj.insert(i);
            
        }
        obj.display();
        System.out.println(obj.root);
    }

}
