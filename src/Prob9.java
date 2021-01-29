import java.util.Scanner;
public class Prob9 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            int val = Integer.parseInt(scan.nextLine());
            int sum = 0;

            for(int i = 0; i<val; i++){
                String text = scan.nextLine();
                String[] lol = text.split(" ");
                for(int j = 0; j<lol.length; j++) {
                    for (int k = 0; k < lol[j].length(); k++) {
                        char ch = lol[j].charAt(k);
                        // Check if ith character is a vowel
                        if (ch == 'a' || ch == 'e' || ch == 'i'
                                || ch == 'o' || ch == 'u')
                            sum++;
                    }
                }
            }
                System.out.println(sum);
            }catch (Exception e){
            System.out.println("Invalid entry");
        }
    }
}
