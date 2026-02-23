package arrays;

import java.util.Scanner;

public class Search {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an element to search:");
        int element = sc.nextInt();
        System.out.println("Enter Size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if(arr[i]==element){
                System.out.println("Element found at index: "+i);
            }
        }
    }
}
