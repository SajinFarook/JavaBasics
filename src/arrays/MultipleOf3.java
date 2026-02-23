package arrays;

import java.util.Scanner;

public class MultipleOf3 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Multiple of three in the array are");
        for(int i=0;i<size;i++){
            if(arr[i]%3==0){
                System.out.println(arr[i]);
            }
        }
    }
}
