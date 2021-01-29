import java.util.Scanner;
public class Prob4 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            int iEntries = Integer.parseInt(scan.nextLine());
            for(int i =0; i<iEntries; i++)
            {
                String text = scan.nextLine();
                String[] ar = text.split(" ");

                int val = Integer.parseInt(ar[0]);
                if(ar[1].equals("true")){
                    if(val <= 65){
                        System.out.println("No ticket");
                    }else if(val >= 66 && val <= 85){
                        System.out.println("small ticket");
                    }else if(val >= 86){
                        System.out.println("big ticket");
                    }
                }else if(ar[1].equals("false")){
                    if(val <= 60){
                        System.out.println("No ticket");
                    }else if(val >= 61 && val <= 80){
                        System.out.println("small ticket");
                    }else if(val >= 81){
                        System.out.println("big ticket");
                    }

                }
            }

        }catch(Exception e){
            System.out.println("Invalid Entry");
        }
    }
}
