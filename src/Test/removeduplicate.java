package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class removeduplicate {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            boolean is_duplicate=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    is_duplicate=true;
                    break;
                }
            }
            if(!is_duplicate){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
