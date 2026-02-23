package Task.Arrays;

import java.util.Scanner;

public class Min_Max {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            else{
                max=arr[i];
            }
        }
        System.out.println("The minimum number is: "+min);
        System.out.println("The maximum number is: "+max);
    }
}
