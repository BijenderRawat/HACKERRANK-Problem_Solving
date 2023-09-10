import java.util.Scanner;
public class Array_Manipulation{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long [] array = new long[n];
		n = scn.nextInt();
		for(int i = 0; i < n; i++){
			int a = scn.nextInt()-1;
			int b = scn.nextInt()-1;
			int k = scn.nextInt();
			array[a] += k;
			if(b+1 < array.length) array[b+1] -= k;
		}
		long max = array[0];
		for(int i = 1; i < array.length; i++){
			array[i] += array[i-1];
			if(max < array[i]) max = array[i];
		}
		System.out.print(max);
	}
}