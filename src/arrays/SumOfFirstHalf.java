package arrays;

import java.util.Scanner;

public class SumOfFirstHalf {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int sum_of_first_half=0;
        int sum_of_sec_half=0;
        int half=arr.length/2;
        for(int i=0;i<half;i++){
            sum_of_first_half+=arr[i];
        }
        for(int i=half;i<arr.length;i++){
            sum_of_sec_half+=arr[i];
        }
        System.out.println("Sum of first half: "+sum_of_first_half);
        System.out.println("Sum of second half: "+sum_of_sec_half);
        if(sum_of_first_half>sum_of_sec_half){
            System.out.println("The difference between first and second half is: "+(sum_of_first_half-sum_of_sec_half));
        }
        else{
            System.out.println("The difference between first and second half is: "+(sum_of_sec_half-sum_of_first_half));
        }
    }
}
