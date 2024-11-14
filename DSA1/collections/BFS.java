
import java.util.*;



public class BFS {
 
     public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){}           
        TreeNode (int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
           }
      
  }
 
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr=new ArrayList<>();
        if(root==null)
        {
            return arr;
        }
        Queue <TreeNode> que = new LinkedList<>(); 
        que.offer(root);
        while(!que.isEmpty())
        {
            List<Integer> in = new ArrayList<>();
            int n=que.size();
            for (int i = 0; i < n; i++) {         
                TreeNode temp=que.poll();
                if(temp.left!=null)
                que.offer(temp.left);
                if(temp.right!=null)
                que.offer(temp.right);
                in.add(temp.val);
  
            }
            arr.add(in);
        }
        return arr;
        
    }
    //level order traversal two
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> arr=new ArrayList<>();
        if(root==null)
        {
            return arr;
        }
        Queue <TreeNode> que = new LinkedList<>(); 
        que.offer(root);
        while(!que.isEmpty())
        {
            List<Integer> in = new ArrayList<>();
            int n=que.size();
            for (int i = 0; i < n; i++) {         
                TreeNode temp=que.poll();
                if(temp.left!=null)
                que.offer(temp.left);
                if(temp.right!=null)
                que.offer(temp.right);
                in.add(temp.val);
  
            }
            arr.add(0,in);
        }
        return arr;
        
    }

    }


