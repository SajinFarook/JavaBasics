package arrays;

import java.util.Scanner;

public class PosAndNegCount {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int pos_count=0;
        int neg_count=0;
        for (int i = 0; i < size; i++) {
            if(arr[i]>=0){
                pos_count+=1;
            }
            else{
                neg_count+=1;
            }
        }
        System.out.println("No.Of positive count in the Array: "+pos_count);
        System.out.println("No.Of negative count in the Array: "+neg_count);
    }
}
