import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class A2020 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            ArrayList<String> lol = new ArrayList<>();
            int val = Integer.parseInt(input.nextLine());
            for(int i = 0; i<val; i++) {
                lol.add(input.nextLine());
            }
                for(int j = 0; j<lol.size(); j++){
                    double answer = 0;
                    String [] ar = lol.get(j).split(" ");

                    double alCans = (Double.parseDouble(ar[0]) * 31) * 0.05;
                    double plasticBottles = (Double.parseDouble(ar[1]) * 15)*0.10;
                    double glassBottles = (Double.parseDouble(ar[2]) / 2) * 0.20;

                    answer += alCans + plasticBottles + glassBottles;

                    System.out.printf("$%.2f %n", answer);

                    /*
                    or
                       System.out.println(NumberFormat.getCurrencyInstance(new Locale("en", "US"))
                            .format(answer));
                     */

            }
        }catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }
}

/*
public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int val = Integer.parseInt(input.nextLine());
            for(int i = 0; i<val; i++) {
                    double answer = 0;
                    String [] ar = lol.get(j).split(" ");

                    double alCans = (Double.parseDouble(ar[0]) * 31) * 0.05;
                    double plasticBottles = (Double.parseDouble(ar[1]) * 15)*0.10;
                    double glassBottles = (Double.parseDouble(ar[2]) / 2) * 0.20;

                    answer += alCans + plasticBottles + glassBottles;

                    System.out.println(NumberFormat.getCurrencyInstance(new Locale("en", "US"))
                            .format(answer));
            }

        }catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }
 */