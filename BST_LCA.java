import java.util.*;
class Node {
    Node left;
    Node right;
    int data; 
    Node(int data) {
        this.data = data;
    }
}
class BST_LCA {
	public static Node lca(Node root, int d1, int d2) {
        if(root == null) return null;
        if(root.data == d1 || root.data == d2) return root;
        Node left = lca(root.left, d1, d2);
        Node right = lca(root.right, d1, d2);
        if(left == null) return right;
        if(right == null) return left;
        return root;
    }
	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
      	int v1 = scan.nextInt();
      	int v2 = scan.nextInt();
        scan.close();
        Node ans = lca(root,v1,v2);
        System.out.println(ans.data);
    }	
}