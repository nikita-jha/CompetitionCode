import java.util.ArrayList;
import java.util.Scanner;
public class Prob7 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){

            int val = Integer.parseInt(scan.nextLine());
            ArrayList<Double> array = new ArrayList<>(val);

            for(int i = 0; i<val; i++){
                array.add(Double.parseDouble(scan.nextLine()));
            }

            double max = array.get(0);
            double min = array.get(0);
            for(int p = 1; p<array.size(); p++){
                if(array.get(p) > max)
                    max = array.get(p);
                else if(array.get(p) < min)
                    min = array.get(p);
                else;
            }

            for(int i = 0; i<array.size(); i++){
                double storedNum1 = array.get(i) - min;
                double storedNum2 = max-min;
                double storedNum3 = (storedNum1/storedNum2)*255;
                array.set(i, storedNum3);
            }

            for(int i = 0; i<array.size(); i++){
                System.out.println(Math.round(array.get(i)));
            }

        }catch(Exception c){
            System.out.println("Invalid Entry");
        }
    }

}
