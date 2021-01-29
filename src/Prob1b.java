import java.util.Scanner;
public class Prob1b {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            int val = Integer.parseInt(scan.nextLine());

            for(int i = 0; i<val; i++){
                int grade = Integer.parseInt(scan.nextLine());

                if(grade >= 70)
                    System.out.println("PASS");
                else
                    System.out.println("FAIL");
            }

        }catch (Exception e){
            System.out.println("Invalid Entry");
        }
    }
}
