import java.util.Scanner;
public class Array_2D_DS{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int [][] array = new int[6][6];
        for(int i = 0; i < 6; i++){
			for(int j = 0; j < 6; j++) array[i][j] = scn.nextInt();
		}
		scn.close();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int sum = array[i][j] + array[i][j+1] + array[i][j+2] + array[i+1][j+1] + array[i+2][j] + array[i+2][j+1] + array[i+2][j+2];
                max = Integer.max(max, sum);
            }
        }
        System.out.println(max);
    }
}
