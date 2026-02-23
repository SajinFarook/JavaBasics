package Task.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_numeric_and_string_array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <n; j++) {
//                if(arr[i]<arr[j]){
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        System.out.println("The sorted array is:"+ Arrays.toString(arr));
//        System.out.println("Enter the size of the array:");
        int n1 = sc.nextInt();
        String[]arr1 = new String[n1];
        System.out.println("Enter String:");
        for (int i = 0; i < n1; i++) {
            arr1[i] =sc.next();
        }
        for (int i = 0; i < n1; i++) {
            for (int j = i+1; j <n1; j++) {
                if(arr1[i].compareToIgnoreCase(arr1[j])>0){
                    String temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
        System.out.println("The sorted array is:"+ Arrays.toString(arr1));
    }
}
