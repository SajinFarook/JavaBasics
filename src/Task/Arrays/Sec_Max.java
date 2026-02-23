package Task.Arrays;

import java.util.Scanner;

public class Sec_Max {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max=arr[0];
        int sec_max=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                sec_max = max;
                max = arr[i];
            }
            else if (arr[i]>sec_max && arr[i]!=max) {
                sec_max=arr[i];
            }
        }
        System.out.println("The second maximum number is: "+sec_max);
    }
}
