import java.io.IOException;

public class ACSL {
    public static void main(String[] args) throws IOException {
        System.out.println(f(3,18));
    }

    static int f(int x, int y) {
        if(x > y){
            return f(x-2, y+3) + 3;
        }else if(x < y){
            return f(y-1, x+1)-5;
        }else{
            return x*y;
        }
    }
}
