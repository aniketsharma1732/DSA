import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int a[] = {5, 4, 3, 25, 2};
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {  // n-1 passes
            for (int j = 0; j < n - 1-i; j++) {  // compare till last unsorted element
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
