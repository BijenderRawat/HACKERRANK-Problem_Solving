import java.util.*;
public class Insert_at_Tail{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for(int i = 0; i < n; i++) ll.add(scn.nextInt());
		Iterator it = ll.iterator();
		while(it.hasNext()) System.out.println(it.next());
	}
}