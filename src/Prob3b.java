import java.util.Scanner;
public class Prob3b {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            int entries = Integer.parseInt(scan.nextLine());

            for(int i = 0; i<entries; i++){
                String text = scan.nextLine();
                char[] lol = text.toCharArray();
                    if(lol.length == 3){
                        if(lol[0] == '1' )
                            System.out.println(lol[0] + "st");
                        else if(lol[0] == '2')
                            System.out.println(lol[0] + "nd");
                        else if(lol[0] == '3')
                            System.out.println(lol[0] + "rd");
                        else
                            System.out.println(lol[0] + "th");
                    }else if(lol[0] == '1'){

                        System.out.println(""+ lol[0] + lol[1] + "th");
                    }else {
                        if(lol[1] == '1' )
                            System.out.println(""+lol[0] + lol[1] + "st");
                        else if(lol[1] == '2')
                            System.out.println(""+lol[0] + lol[1] + "nd");
                        else if(lol[1] == '3')
                            System.out.println(""+lol[0]+ lol[1] + "rd");
                        else
                            System.out.println(""+lol[0]+ lol[1] + "th");
                    }




            }
        }
    }
}
