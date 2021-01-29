import java.util.Scanner;
public class Prob6 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){

            int val = Integer.parseInt(scan.nextLine());

            for(int i = 0; i<val; i++)
            {
                int altitude = Integer.parseInt(scan.nextLine());
                double earthRad = 40075/2.0 / Math.PI;
                double totalRad = earthRad + altitude;
                double orbitLength = 2.0 * Math.PI * totalRad;
                orbitLength = Math.round(orbitLength * 10.0) / 10.0;
                System.out.println(orbitLength);
            }
        }catch(Exception e){
            System.out.println("Invalid Entry");
        }
    }
}
