import java.util.*;
public class Reverse_Doubly_List{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int n = scn.nextInt();
            LinkedList<Integer> list = new LinkedList<Integer>();
            while(n-- > 0){
                list.add(scn.nextInt());
            }
            Collections.reverse(list);
            for(int i : list){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        scn.close();
    }
}
