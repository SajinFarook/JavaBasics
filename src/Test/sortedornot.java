package Test;

import java.util.Arrays;
import java.util.Scanner;

public class sortedornot {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            arr2[i] =arr[i];
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n-1; j++) {
                if(arr[j] >arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        if(Arrays.equals(arr,arr2)){
            System.out.println("Sorted array");
        }
        else{
            System.out.println("Not sorted array");
        }
    }
}
