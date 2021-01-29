import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FibonacciInfinite {
    public static void main(String[] args) {
        ArrayList<Integer> seqence = new ArrayList<Integer>();
        seqence.add(0);
        seqence.add(1);
        int num = 6;
        for(int j = 2; j<num; j++){
            seqence.add((seqence.get(j-1)) + seqence.get(j-2));
        }
        for(int i = 0; i<seqence.size(); i++){
            System.out.print(seqence.get(i) + " ");
        }
        int size = 20;
        int[] sequence2 = new int[size];
        sequence2[0]= 0;
        sequence2[1] = 1;
        for(int i = 2; i<size; i++){
            sequence2[i] = sequence2[i-2] + sequence2[i-1];
        }
        System.out.println();
        System.out.println(Arrays.toString(sequence2));

    }
}
