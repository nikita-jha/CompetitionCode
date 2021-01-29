import java.util.ArrayList;
import java.util.Scanner;
public class Prob2 {
    public static void main(String[] args) {
        try ( Scanner scan = new Scanner(System.in)) {

            int val = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < val; i++) {
                String text = scan.nextLine();

                String[] ar = text.split(" ");

                if (ar[0].equals(ar[1]))
                    System.out.println(Integer.parseInt(ar[0]) * 4);
                else
                    System.out.println(Integer.parseInt(ar[0]) + Integer.parseInt(ar[1]));
            }
        }catch(Exception e){
            System.out.println("Invalid Entry");
        }
    }
}
