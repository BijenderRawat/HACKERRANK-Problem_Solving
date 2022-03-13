import java.util.Scanner;
public class Arrays_DS {
	private static void reverseArray(int [] array) {
		for(int i = array.length-1; i > -1; i--) System.out.print(array[i] + " ");
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] array = new int[n];
		for(int i = 0; i < n; i++) array[i] = scn.nextInt();
		reverseArray(array);
		scn.close();
		
    }
}