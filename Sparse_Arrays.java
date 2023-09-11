import java.util.Scanner;
public class Sparse_Arrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        String [] string = new String[n];
        for(int i = 0; i < n ; i++) string[i] = scn.nextLine();
        int q = Integer.parseInt(scn.nextLine());
        String [] query = new String[q];
        for(int i = 0; i < q ; i++) query[i] = scn.nextLine();
		scn.close();
        for(int i = 0 ; i < q; i++) {
            int times = 0;
            for(int j = 0; j < n; j++) if(query[i].compareTo(string[j]) == 0) times++;
            System.out.println(times);
        }
    }
}