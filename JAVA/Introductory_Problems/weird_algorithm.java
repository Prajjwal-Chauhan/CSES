/* Takes 0.17 seconds on average. */
package JAVA.Introductory_Problems;
import java.util.*;

public class weird_algorithm {

    public static void weird_algo(Long n, ArrayList<Long> arr, HashSet<Long> hash) {
        if(n == 1) return;
        if (n % 2 == 0)
            n /= 2;
        else
            n = n * 3 + 1;
        if (!hash.contains(n)) {
            arr.add(n);
            hash.add(n);
            weird_algo(n, arr, hash);
        }
        return;
    }

    public static void main(String args[]) {
        Scanner io = new Scanner(System.in);
        Long n = io.nextLong();
        HashSet<Long> hash = new HashSet<>();
        ArrayList<Long> arr = new ArrayList<>();
        arr.add(n);
        hash.add(n);
        weird_algo(n, arr, hash);
        for (Long i : arr) {
            System.out.print(i+" ");
            
        }
        io.close();
    }
}