package Test;

import java.util.Arrays;
import java.util.Scanner;

public class revarray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter a array element:");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < size/2; i++){
            int temp=arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
