package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class LeaderArray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size= sc.nextInt();
        int[]arr= new int[size];
        System.out.println("Enter array element:");
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }
        boolean is_leader =true;
        ArrayList<Integer> Leader_array =new ArrayList<>();
        for (int i = 0; i <size ; i++) {
            for (int j = i+1; j <size ; j++) {
                if(arr[i]<arr[j]){
                    is_leader =false;
                    break;
                }
                else{
                    is_leader=true;
                }
            }
            if(is_leader !=false){
                Leader_array.add(arr[i]);
            }
        }
        if(is_leader==false){
            Leader_array.add(arr[size-1]);
        }
        System.out.println(Leader_array);
//        for (int i = size-1; i >=0 ; i--) {
//            for (int j = i-1; j >=0 ; j--) {
//                if(arr[i]<arr[j]){
//                    is_leader =false;
//                    break;
//                }
//            }
//            if(is_leader !=false){
//                Leader_array.add(arr[i]);
//            }
//        }
//        if(is_leader==false){
//            Leader_array.add(arr[0]);
//        }
//        System.out.println(Leader_array);
    }
}
