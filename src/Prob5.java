import java.util.Scanner;
public class Prob5 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            int iEntries = Integer.parseInt(scan.nextLine());

            for(int i = 0; i<iEntries; i++)
            {
                String text = scan.nextLine();
                String[] ar = text.split(" ");
                if(Integer.parseInt(ar[0]) + Integer.parseInt(ar[1])*5 >= Integer.parseInt(ar[2])){
                    System.out.println("true");
                }else{
                    System.out.println("false");
                }
            }

        }catch(Exception e){
            System.out.println("Invalid Entry");
        }
    }
}
