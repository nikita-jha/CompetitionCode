import java.util.ArrayList;
import java.util.Scanner;

public class Prob01 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            ArrayList<String> lol = new ArrayList<String>(testCases);


            for(int testcase = 0; testcase < testCases; testcase++) {
                lol.add(input.nextLine());
            }

            for(int i = 0; i<lol.size(); i++)
            {
                System.out.println(lol.get(i).toLowerCase());
            }
        }

    }

}