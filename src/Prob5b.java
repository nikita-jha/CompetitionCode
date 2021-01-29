import java.util.Scanner;
public class Prob5b {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int entries = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < entries; i++) {
                int num = Integer.parseInt(scan.nextLine());
                int temp = num;

                int counter = 0;

                while (true) {
                    if (num == 1) {
                        counter++;
                        break;
                    } else if (num % 2 == 0) {
                        num /= 2;
                        counter++;
                    } else if (num % 2 == 1) {
                        num = (num * 3) + 1;
                        counter++;
                    }
                }
                System.out.println(temp + ":" + counter);
            }
        }
    }
}
