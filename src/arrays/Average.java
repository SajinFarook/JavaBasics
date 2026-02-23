package arrays;

import java.util.Scanner;

public class Average {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int count=0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < size; i++) {
            sum+=arr[i];
        }
        int average=sum/ arr.length;
        for (int i = 0; i < size; i++) {
            if(arr[i]>average){
                count+=1;
            }
        }
        System.out.println("The count of number greater than average "+average+" is "+count);
    }
}
