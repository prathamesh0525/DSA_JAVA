package Array;
import java.util.*;
public class Duplicate_Element {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1, 1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        Arrays.sort(arr);
        System.out.print("Duplicate elements: ");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.print(arr[i] + " ");
                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
        }
    }
}
