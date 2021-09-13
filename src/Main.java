import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main
{
    static BufferedReader br;
    static StringTokenizer tok;
    static PrintWriter out;
    static void solve() throws IOException{
        int n = nextInt();
        out.println(n * 10);
    }
    static int nextInt() throws IOException{
        return Integer.parseInt(next());
    }
    static long nextLong() throws IOException{
        return Long.parseLong(next());
    }
    static String next() throws IOException {
        while(tok == null || !tok.hasMoreTokens())
        {
            tok = new StringTokenizer(br.readLine());
        }
        return tok.nextToken();
    }
    public static void main(String[] args) {
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            int tt = nextInt();
            while(tt-- > 0)
            {
                solve();
            }
            br.close();
            out.close();
        }
        catch(Throwable e)
        {
            e.printStackTrace();
            System.exit(1);
        }
    }
}