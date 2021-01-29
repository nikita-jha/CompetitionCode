import java.io.*;

public class template {
    static BufferedReader br;
    static PrintWriter pw;

    public static void main(String[] args) throws Exception {
        setIO(); //standard I/O
        setIO("Input"); // file reading I/O
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
