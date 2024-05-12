package revise_DSA.Trees;

public class SegmentTree {
    private class Node{
        int val;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        Node(int startInterval, int endInterval){
            this.startInterval = startInterval;
            this. endInterval = endInterval;
        }
    }

    Node root;

    SegmentTree(int[] arr){
        //we need to create a tree using this array
        this.root = constructTree(arr, 0, arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end){
        if(start == end){
            //leaf node
            Node leaf = new Node(start, end);
            leaf.val = arr[start];
            return leaf;
        }

        //create new node with the index
        Node node = new Node(start, end);

        int mid = (start + end) / 2;

        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid+1, end);

        node.val = node.left.val + node.right.val;
        return node;
    }

    public void display(){
        display(this.root);
    }

    private void display(Node node){
        String str = "";

        if(node.left != null) {
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.val + " => ";
        }
        else {
            str = str + "No left child";
        }

        // for current node
        str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.val + " <= ";

        if(node.right != null) {
            str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.val;
        }
        else {
            str = str + "No right child";
        }

        System.out.println(str + '\n');

        // call recursion
        if(node.left != null) {
            display(node.left);
        }

        if(node.right != null) {
            display(node.right);
        }
    }

    public int query(int qsi, int qei){
       return this.query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei){
        if(node.startInterval >= qsi && node.endInterval <= qei){
            //node is completely lying inside query
            return node.val;
        }
        else if(node.startInterval > qei || node.endInterval < qsi){
            //Completely outside
            return 0;
        }
        else{
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

    public void update(int index, int value){
        this.root.val = this.updateHelper(this.root, index, value);
    }

    private int updateHelper(Node node, int index, int value){
        if(index >= node.startInterval && index <= node.endInterval){
            if(index == node.startInterval && index == node.endInterval){
                node.val = value;
                return node.val;
            }
            else {
                int leftSum = updateHelper(node.left, index, value);
                int rightSum = updateHelper(node.right, index, value);

                node.val = leftSum + rightSum;
                return node.val;
            }
        }

        return node.val;
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        SegmentTree tree = new SegmentTree(arr);
//        tree.display();

//        System.out.println(tree.query(1, 6));

        tree.update(2, 14);
        tree.display();
    }
}
