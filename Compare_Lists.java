import java.util.LinkedList;
import java.util.Scanner;
public class Compare_Lists{
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
            if(list1.size() == list2.size()) {
                boolean e = true;
                for(int i = 0; i < list1.size(); i++) {
                    if(list1.get(i) != list2.get(i)) {
                        System.out.println("0");
                        e = false;
                        break;
                    }
                }
                if(e) {
                    System.out.println("1");
                }
            }
            else {
                System.out.println("0");
            }
        }
        scn.close();
    }
}
