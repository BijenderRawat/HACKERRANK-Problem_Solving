import java.util.*;
public class Merge_Linked_Lists{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            LinkedList<Integer> list1 = new LinkedList<Integer>();
            while(n-- > 0) {
                list1.add(scn.nextInt());
            }
            int m = scn.nextInt();
            LinkedList<Integer> list2 = new LinkedList<Integer>();
            while(m-- > 0) {
                list2.add(scn.nextInt());
            }
            LinkedList<Integer> ml = new LinkedList<Integer>();
            ml.addAll(list1);
            ml.addAll(list2);
            Collections.sort(ml);
            for(int i : ml) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        scn.close();
    }
}
