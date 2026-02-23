package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class EqualorNot {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int size = sc.nextInt();
        System.out.println("Enter Size of array:");
        int size1 = sc.nextInt();
        int[] arr = new int[size];
        int[] arr1 = new int[size1];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        boolean Equal=true;
        if(arr.length==arr1.length){
            for (int i = 0; i < size; i++) {
                if(arr[i]==arr1[i]){
                    Equal=true;
                }
                else{
                    Equal=false;
                }
            }
        }
        else{
            Equal=false;
        }
        System.out.println(Equal);
    }
}
