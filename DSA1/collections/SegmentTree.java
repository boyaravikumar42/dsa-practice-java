
public class SegmentTree {
     class Node 
    {
        int val;
        int si;
        int ei;
        Node left;
        Node right;
        public Node(int si, int ei) {
            this.si = si;
            this.ei = ei;
        }
    }
    Node root;
    public SegmentTree(int[] arr,int start,int end) {
        this.root = createTree(root,arr,start,end);
    }


    public Node createTree(Node root,int[] arr,int start,int end)
    {
        if(start==end)
        {
            Node node =new Node(start, end);
            node.val=arr[start];
            return node;
        }
        Node n=new Node(start, end);
        int mid=(start+end)/2;
        n.left=createTree(n.left, arr, start, mid);
        n.right=createTree(n.right, arr, mid+1, end);
        n.val=n.left.val+n.right.val;
        return n;
    }
    public void display()
    {
        display(root,"root node:");
    }


    private void display(Node node,String s)
    {
        if(node==null)
        {
            return;
        }
        System.out.println(s+node.val);
        display(node.left, "left value is:");
        display(node.right, "right value is:");

    }
    public int query(int start,int end)
    {
       return query(root,start, end);
    }
    //private query method
    private int query(Node node,int start,int end)
    {
        if(end<node.si ||start>node.ei)//condition for node is out side the query
        {
            return 0;
        }
        if(start<=node.si && end>=node.ei)//condition for node is inside the query
        {
            return node.val;
        }
        return query(node.left, start, end)+query(node.right, start, end);//partial query

    }
    public void update(int val,int i)
    {
        root=update(root, val,i);
    }

    private Node update(Node node,int val,int index)
    {
        if(node.si==index && node.ei==index)
        {
            node.val=val;
            return node;
        }
        if(index<node.si || index>node.ei)
        {
            return node;
        }
        node.val=update(node.left, val, index).val+update(node.right, val, index).val;
        return node;
    }
}//class end



