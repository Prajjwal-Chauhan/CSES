/* Takes 0.15 seconds on average. */
import java.io.*;
import java.util.StringTokenizer;

public class repetitions {

    public static int repetition(String str,int i,int count, int max){
        if(i == str.length()) return Math.max(count,max);
        if(str.charAt(i) == str.charAt(i-1)) count++;
        else {
            max = Math.max(count,max);
            count = 1;
        }
        return repetition(str, i+1, count, max);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        System.out.println(repetition(str,1,1,0));
    }
}
