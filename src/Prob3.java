import java.util.ArrayList;
import java.util.Scanner;
public class Prob3 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            int numVal = Integer.parseInt(scan.nextLine());

            for(int i = 0; i<numVal; i++)
            {
                String text = scan.nextLine();
                String[] ar = text.split(" ");


                if(Boolean.parseBoolean(ar[0]) == Boolean.parseBoolean(ar[1])) {
                    System.out.println("true");
                }
                else {
                    System.out.println("false");
                }
            }


        }catch(Exception e){
            System.out.println("Invalid Entry");
        }
    }
}
