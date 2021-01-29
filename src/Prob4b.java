import java.util.Scanner;
public class Prob4b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entries = Integer.parseInt(scan.nextLine());
        for(int i = 0; i<entries; i++){
            String text = scan.nextLine();
            String[] lol = text.split("");
            int countRock = 0;
            int countPaper = 0;
            int countScissor = 0;

            for(int j = 0; j<lol.length; j++){
                if(lol[j].equals("R"))
                    countRock++;
                else if(lol[j].equals("P"))
                    countPaper++;
                else if(lol[j].equals("S"))
                    countScissor++;
            }

            if(countRock > 0 && countPaper == 0 && countScissor != 0)
                System.out.println("ROCK");
            else if(countScissor > 0 && countRock == 0 && countPaper != 0)
                System.out.println("SCISSOR");
            else if(countPaper > 0 && countScissor == 0 && countRock != 0)
                System.out.println("PAPER");
            else
                System.out.println("NO WINNER");
        }
    }
}
