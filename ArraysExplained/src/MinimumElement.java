import java.util.*;
import java.lang.Math;
public class MinimumElement {

    private  static int readInteger() {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        sc.close();
        return val;
    }

    private  static int[] readElements(int size) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min,arr[i]);
        }
        return min;
    }
}
