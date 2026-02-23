package arrays;

import java.util.Scanner;

public class SecondLargest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max=arr[0];
        int sec_max=0;
        for (int i = 1; i < size; i++) {
            if(arr[i]>max){
                sec_max=max;
                max=arr[i];
            }
            else if (arr[i]>sec_max&&arr[i]!=max) {
                sec_max=arr[i];
            }
        }
        System.out.println("Largest in the array is: "+max);
    }
}
