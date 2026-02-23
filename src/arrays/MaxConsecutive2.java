package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MaxConsecutive2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array element:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int count=0;
        int max=0;
        int k=2;
        int zero_count=0;
        for (int i = 0; i < size; i++) {
            for (int j = i; j <size ; j++) {
                if(arr[i]==0){
                    zero_count+=1;
                }
                if(zero_count>k){
                    break;
                }
            }
        }
        if(count>max){
            max=count;
        }
        System.out.println(max);
        System.out.println(Arrays.toString(arr));
    }
}
