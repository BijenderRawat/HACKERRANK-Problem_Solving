import java.util.*;
public class Insert_into_Doubly_List{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int n = scn.nextInt();
            LinkedList<Integer> list = new LinkedList<Integer>();
            while(n-- > 0){
                list.add(scn.nextInt());
            }
            int d = scn.nextInt();
            for(int i = 0; i < list.size(); i++) {
                if(list.get(i) == d) {
                    list.add(i, d);
                    break;
                }
                if(d > list.getLast()) {
                    list.addLast(d);
                    break;
                }
                if(list.get(i) > d) {
                    if(i == 0) {
                        list.addFirst(d);
                        break;
                    }
                    else {
                        list.add(i, d);
                        break;
                    }
                }
            }
            for(int i : list){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        scn.close();
    }
}
