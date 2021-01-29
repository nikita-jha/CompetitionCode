import java.util.ArrayList;
import java.util.Scanner;

public class B2020 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            ArrayList<String> list = new ArrayList<>();
            int val = Integer.parseInt(input.nextLine());
            for(int i = 0; i<val; i++){
                list.add(input.nextLine());
            }
            for(int i = 0; i<list.size(); i++){
                String[] ar = list.get(i).split(" ");
                int size = ar.length;
                double answer = Double.parseDouble(ar[size-1]) / Double.parseDouble(ar[0]);
                System.out.printf("%.2f", answer);
                System.out.println(":1");
            }
        }
    }
}
