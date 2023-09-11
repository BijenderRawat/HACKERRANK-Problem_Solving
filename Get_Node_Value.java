import java.util.*;
public class Get_Node_Value{
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            LinkedList<Integer> list = new LinkedList<Integer>();
            while(n-- > 0) {
                list.add(scn.nextInt());
            }
            int pfl = scn.nextInt();
            System.out.println(list.get(list.size()-pfl-1));
        }
        scn.close();
    }
}
