/* Takes 0.38 seconds on average depends on testcase. */
package JAVA.Sorting_and_Searching;
import java.io.*;
import java.util.*;

public class distinct_numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        HashSet<Integer> set = new HashSet<>();
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        
        System.out.println(set.size());
        br.close();
    }
}
