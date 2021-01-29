import java.io.*;

public class D2020 {
    static BufferedReader br;
    static PrintWriter pw;

    public static void main(String[] args) throws Exception {
            setIO();
            int t = Integer.parseInt(br.readLine());
            while(t-- > 0){
                String[] text = br.readLine().split(" ");
                int N = Integer.parseInt(text[0]);
                String answerkey = text[1];

                for(int i = 0; i<N; i++){
                    String [] student = br.readLine().split(" ");
                    String name = student[0];
                    String response = student[1];
                    double correct = 0, score;
                    for(int q = 0; q<response.length(); q++){
                        if(answerkey.charAt(q) == response.charAt(q))
                            correct++;
                    }
                    score = (correct/response.length()) * 100;

                    String letter;
                    if(score >= 90)
                        letter = "A";
                    else if(score >= 80)
                        letter = "B";
                    else if(score >= 70)
                        letter = "C";
                    else if(score >= 60)
                        letter = "D";
                    else
                        letter = "F";
                    System.out.printf("%s %.1f%% %s\n", name,score,letter);
                }
            }
    }
    public static void setIO(){
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            pw = new PrintWriter(System.out);
        }catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
    public static void setIO(String s) {
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\nikit\\CompetitionCode\\src\\"
                    + s + ".in"));
            pw = new PrintWriter(new BufferedWriter(new FileWriter(s + ".out")));
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

}
