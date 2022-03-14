import java.util.*;
class Node{
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class Top_View {
    static class Pair{
        int hd;
        Node node;
        public Pair(int hd, Node node){
            this.hd = hd;
            this.node = node;
        }
    }
    static void topView(Node root) {
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();
        q.add(new Pair(0, root));
        while(!q.isEmpty()){
            Pair cur = q.poll();
            if(!map.containsKey(cur.hd)) map.put(cur.hd, cur.node.data);
            if(cur.node.left != null) q.add(new Pair(cur.hd-1, cur.node.left));
            if(cur.node.right != null) q.add(new Pair(cur.hd+1, cur.node.right));
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) System.out.print(entry.getValue() + " ");
    }
	public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }else{
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scn.nextInt();
            root = insert(root, data);
        }
        scn.close();
        topView(root);
    }	
}