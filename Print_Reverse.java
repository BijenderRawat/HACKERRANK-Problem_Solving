import java.util.*;
public class Print_Reverse{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0; i < n; i++){
            LinkedList ll = new LinkedList();
            int s = scn.nextInt();
            for(int j = 0; j < s; j++){
                ll.add(scn.nextInt());
            } 
            Iterator it = ll.descendingIterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }  
        }
    }
}
