package arrays;

import java.util.Scanner;

public class MaxConsecutive {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int count=0;
        int max=0;
        for (int i = 0; i < size; i++) {
            if(arr[i]==1){
                count+=1;
            }
            else{
                if(count>max){
                    max=count;
                }
                count=0;
            }
        }
        if(count>max){
            max=count;
        }
        System.out.println(max);
    }
}
