public static int height(Node root) {
      	// Write your code here.
          if(root==null) return -1;
          else return Math.max(height(root.left)+1, height(root.right)+1 );
    }
