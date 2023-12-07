

import java.util.Arrays;
public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {237, 78,-6,-47,0,876575, 82, 29};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
