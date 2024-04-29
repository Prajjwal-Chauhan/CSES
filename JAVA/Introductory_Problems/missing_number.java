/* There are two methods to solve this question. 
     1) Mathematical formula - 0.12 seconds on an average
     2) XOR operation - 
     */
    
import java.io.*;
import java.util.StringTokenizer;

public class missing_number {

    public static long mathematical_formula(long n,StringTokenizer st){
        long expected = n * (n + 1)/2;
        for(int i = 0 ; i < n-1 ; i++){
            expected -= Long.parseLong(st.nextToken());
        }
        return expected;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long result1 = mathematical_formula(n,st);
        // int result2 = xor(n,st);
        
        System.out.println(result1);
    }
}
