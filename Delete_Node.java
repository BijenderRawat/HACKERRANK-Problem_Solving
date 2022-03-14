import java.util.*;
public class Delete_Node{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        while(n-- > 0) list.add(scn.nextInt());
        int p = scn.nextInt();
        scn.close();
        for(int i = 0 ; i < list.size(); i++) {
            if(i == p) list.remove(i);
        }
        for(int i : list) {
            System.out.print(i + " ");
        }
    }
}
