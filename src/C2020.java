import java.io.*;

public class C2020 {
    static BufferedReader br;
    static PrintWriter pw;

    public static void main(String[] args) throws IOException {
        setIO();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(br.readLine());
            Coord[] coords = new Coord[N];
            double xavg = 0, yavg = 0, zavg = 0;
            for (int i = 0; i < N; i++) {
                coords[i] = new Coord(br.readLine());
                xavg += coords[i].x;
                yavg += coords[i].y;
                zavg += coords[i].z;
            }
            xavg /= N;
            yavg /= N;
            zavg /= N;
            double minDist = coords[0].dist(xavg, yavg, zavg);
            int min = 0;
            for (int i = 1; i < N; i++) {
                double currDist = coords[i].dist(xavg, yavg, zavg);
                if (currDist < minDist) {
                    minDist = currDist;
                    min = i;
                }
            }
            System.out.printf("%s %.3f %.3f %.3f\n", coords[min].name, xavg, yavg, zavg);
        }
    }

    static class Coord {
        String name;
        int x, y, z;

        Coord(String s) {
            String[] tokens = s.split(" ");
            name = tokens[0];
            x = Integer.parseInt(tokens[1]);
            y = Integer.parseInt(tokens[2]);
            z = Integer.parseInt(tokens[3]);
        }

        double dist(double xAvg, double yAvg, double zAvg) {
            double xDiff = Math.abs(xAvg - (double) this.x);
            double yDiff = Math.abs(yAvg - (double) this.y);
            double zDiff = Math.abs(zAvg - (double) this.z);
            return Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff);
        }
    }

    public static void setIO() {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            pw = new PrintWriter(System.out);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void setIO(String s) {
        try {
            br = new BufferedReader(new FileReader(s + ".in"));
            pw = new PrintWriter(new BufferedWriter(new FileWriter(s + ".out")));
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}