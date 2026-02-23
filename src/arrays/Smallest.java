package arrays;

import java.util.Scanner;

public class Smallest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int smallest=arr[0];
        for (int i = 1; i < size; i++) {
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest in the array is: "+smallest);
    }
}
