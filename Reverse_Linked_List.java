import java.util.*;
public class Reverse_Linked_List{
    public static void main(String[] args)  {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int j = 0; j < t; j++){
            int n = scn.nextInt();
            LinkedList<Integer> list = new LinkedList<Integer>();
            for(int i = 0; i < n; i++){
                list.add(scn.nextInt());
            }
            Collections.reverse(list);
            for(int i = 0; i < n; i++){
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
        scn.close();
    }
}
