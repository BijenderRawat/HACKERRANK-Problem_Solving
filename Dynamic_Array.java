import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Dynamic_Array {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.next());
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++) arr.add(new ArrayList<Integer>());
        int lastanswer = 0;
        int q = scn.nextInt();
        while(q-- > 0){
            int t = Integer.parseInt(scn.next());
            if(t == 1){
                int x = Integer.parseInt(scn.next());
                int y = scn.nextInt();
                int idx = ((x ^ lastanswer) % n);
                arr.get(idx).add(y);
            }else if(t == 2){
                int x = Integer.parseInt(scn.next());
                int y = scn.nextInt();
                int idx = ((x ^ lastanswer) % n);
                lastanswer = arr.get(idx).get(y % arr.get(idx).size());
                System.out.println(lastanswer);
            }
        }
		scn.close();
    }
}