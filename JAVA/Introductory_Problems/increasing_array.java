/* Takes 0.17 seconds approx */
import java.util.*;
 class increasing_aaray {
     public static long increase(int[] arr, long count, int idx){
         if(arr.length == 1|| idx == arr.length) return count;
         if(arr[idx] < arr[idx-1]) {
             count += arr[idx-1] - arr[idx];
             arr[idx] = arr[idx-1];
         }
         
         return increase(arr,count,idx+1);
     }
     
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[] = new int[n];
         for(int i = 0 ; i < n ; i++){
             arr[i] = sc.nextInt();
         }
         System.out.println(increase(arr,0,1));
         sc.close();
     }
 }
