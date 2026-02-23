package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeOrPositive {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        boolean n=true;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if (n==true){
                if(arr[i]>=0){
                    n=true;
                }
                else{
                    n=false;
                }
            }
        }
        if (n==true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
