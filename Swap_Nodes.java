import java.util.*;
class Tree{
	int data;
	Tree leftTree;
	Tree rightTree;
}
public class Swap_Nodes{
	private static void inorder(Tree tree){
		if(tree == null) return;
		inorder(tree.leftTree);
		System.out.print(tree.data + " ");
		inorder(tree.rightTree);
	}
	private static void swapNodes(Tree tree, int k, int curr, int mul){
		
/* 1> */ 		
		/*if(tree == null) return;
		curr++;
		if(curr == (mul*k)){
			Tree temp = tree.leftTree;
			tree.leftTree = tree.rightTree;
			tree.rightTree = temp;
			mul++;
			swapNodes(tree.leftTree, k, curr, mul);
			swapNodes(tree.rightTree, k, curr, mul);
		}else{
			swapNodes(tree.leftTree, k, curr, mul);
			swapNodes(tree.rightTree, k, curr, mul);
		}*/
		
/* 2> */		
		if(tree == null) return;
		if(curr == (mul*k)){
			Tree temp = tree.leftTree;
			tree.leftTree = tree.rightTree;
			tree.rightTree = temp;
			curr++;
			mul++;
			swapNodes(tree.leftTree, k, curr, mul);
			swapNodes(tree.rightTree, k, curr, mul);
		}else{
			curr++;
			swapNodes(tree.leftTree, k, curr, mul);
			swapNodes(tree.rightTree, k, curr, mul);
		}
	}
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		Tree tree = new Tree();
		tree.data = 1;
		Queue<Tree> queue = new LinkedList<Tree>();
		queue.add(tree);
		while(!queue.isEmpty()){
			Tree temp = queue.remove();
			int value = scn.nextInt();
			if(value != -1){
				Tree left = new Tree();
				left.data = value;
				temp.leftTree = left;
				queue.add(left);
			}else{
				temp.leftTree = null;
			}
			value = scn.nextInt();
			if(value != -1){
				Tree right = new Tree();
				right.data = value;
				temp.rightTree = right;
				queue.add(right);
			}else{
				temp.rightTree = null;
			}
		}
		int t = scn.nextInt();
		for(int i = 0; i < t; i++){
			int k = scn.nextInt();
			
//          swapNodes function can be implement in 2 ways with a very light change in implementation
/* 1> */ // swapNodes(tree, k, 0, 1)
//                 OR			
/* 2> */	swapNodes(tree, k, 1, 1);
			inorder(tree);
			System.out.println();
		}
	}
}