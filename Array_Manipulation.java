import java.util.Scanner;
public class Array_Manipulation {
    public static void main(String [] args)  {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long [] array = new long[n];
        int m = scn.nextInt();
        for(int i = 0; i < m; i++){
            int a = scn.nextInt()-1;
            int b = scn.nextInt()-1;
            int k = scn.nextInt();
            array[a] += k;
            if(b+1 < n) array[b+1] -= k;
        }
        scn.close();
        Long max = array[0];
        for(int i = 1; i < n ; i++){
            array[i] += array[i-1];
            max = Math.max(max, array[i]);
        }
        System.out.println(max);
    }
}
