package arrays;

import java.util.Scanner;

public class PrintBelow10 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Numbers less then 10 in the array are:");
        for(int i=0;i<size;i++){
            if(arr[i]<10){
                System.out.println(arr[i]);
            }
        }
    }
}