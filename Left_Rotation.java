import java.util.Scanner;
public class Left_Rotation {
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int [] array = new int[n];
        for(int i = 0; i < n; i++) array[i] = scn.nextInt();
        scn.close();
        while(d-- > 0) {
            int temp = array[0];
            for(int i = 0; i < n-1; i++) array[i] = array[i+1];
            array[n-1] = temp;
        }
        for(int i : array) System.out.print(i + " ");
    }
}