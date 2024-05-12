package revise_DSA.Trees;

public class BinarySearchTree {
   public class Node{
        private int val;
        private int height;
        private Node right;
        private Node left;

        public Node(int val){
            this.val = val;
        }

       public int getVal() {
           return val;
       }
   }

   private Node root;

   public BinarySearchTree(){

   }

   public int height(Node node){
       if (node == null) return -1;
       return node.height;
   }

   public boolean isEmpty(){
       return root == null;
   }

   public void display(){
       display(root, "Root Node: ");
   }

   private void display(Node node, String details){
       if(node == null) return;
       System.out.println(details + node.getVal());

       display(node.left, "Left child of " + node.getVal() + " : ");
       display(node.right, "right child of " + node.getVal() + " : ");
   }

   public void populate(int[] arr){
       for(int i=0; i<arr.length; i++){
           insert(arr[i]);
       }
   }

   private void insert(int val){
        root = insert(val, root);
   }

   private Node insert(int val, Node node){
       if(node == null){
           node = new Node(val);
           return node;
       }

       if(val < node.val){
           node.left = insert(val, node.left);
       }

       if(val > node.val){
           node.right = insert(val, node.right);
       }

       node.height = Math.max(height(node.left), height(node.right)) + 1;

       return node;
   }

   public boolean balanced(){
       return balanced(root);
   }

   private boolean balanced(Node node){
       if(node == null){
           return true;
       }

       return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
   }

   public void populateSorted(int[] nums){
       populateSorted(nums, 0, nums.length);
   }

   private void populateSorted(int[] nums, int start, int end){
       if(start >= end){
           return;
       }

       int mid = (start + end) / 2;

       this.insert(nums[mid]);
       populateSorted(nums, start, mid);
       populateSorted(nums, mid+1, end);

   }

   public void preOrder(){
       preOrder(root);
   }

   private void preOrder(Node node){
       if (node == null){
           return ;
       }

       System.out.println(node.val);
       preOrder(node.left);
       preOrder(node.right);
   }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
        if (node == null){
            return ;
        }

        inOrder(node.left);
        System.out.println(node.val);
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node){
        if (node == null){
            return ;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.val);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
//        int[] arr = {10, 12, 20, 15, 30};
        int[] arr = {15, 10, 12, 5, 20};
        tree.populate(arr);
        tree.display();
//        System.out.println(tree.balanced());
//        tree.preOrder();
    }

}
