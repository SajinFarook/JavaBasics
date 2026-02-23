package arrays;

import java.util.Arrays;
import java.util.Scanner;
public class SquareofElement {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            arr[i]=arr[i]*arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
