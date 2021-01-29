import java.util.Scanner;
public class Prob2b {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in);){
            int val = Integer.parseInt(scan.nextLine());
            for (int i = 0; i<val; i++){
                int count = 0;
                String text = scan.nextLine();
                String[] lol = text.split(" ");

                for(int j = 0; j<lol.length; j++){
                    for(int k = 0; k<lol[j].length(); k++){
                        if(lol[j].charAt(k)== 'a' || lol[j].charAt(k)== 'e' || lol[j].charAt(k)== 'i' || lol[j].charAt(k)== 'o'|| lol[j].charAt(k)== 'u'){
                            count++;
                        }
                    }
                    //System.out.println(count);
                }
                System.out.println(count);
            }
        }
    }
}
