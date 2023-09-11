import java.util.*;
public class Delete_Duplicate{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int n = scn.nextInt();
            LinkedList<Integer> list = new LinkedList<Integer>();
            while(n-- > 0){
                list.add(scn.nextInt());
            }
            for(int i = 0; i < list.size()-1; i++) {
                for(int j = i+1; j < list.size();) {
                    if(list.get(i) == list.get(j)) {
                        list.remove(j);
                    }
                    else {
                        j++;
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
