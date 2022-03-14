import java.util.*;
class Node {
    Node left;
    Node right;
    int data;  
    Node(int data) {
        this.data = data;
    }
}
class BST_Insertion { 
  	public static void preOrder( Node root ) {  
    	if( root == null) return;  
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
	public static Node insert(Node root,int data) {
        if(root == null) return new Node(data);
        Node current = root;
        while(true){
            if(current.data >= data){
                if(current.left != null){
                    current = current.left;
                }else{
                    current.left = new Node(data);
                    break;
                }
            }else{
                if(current.right != null){
                    current = current.right;
                }else{
                    current.right = new Node(data);
                    break;
                }
            }
        }
        return root;      
    }
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
      	preOrder(root);
    }	
}