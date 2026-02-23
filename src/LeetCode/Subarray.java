package LeetCode;

import java.util.ArrayList;

public class Subarray {
    static void main(String[] args) {
        int[] arr= new int[]{1,2,3,4,5,6,7};
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        int sum_max=0;
        int max=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if(sum>max){
                    max=sum;
                    list.add(arr[j]);
                }
            }
            if(sum>sum_max){
                sum_max=sum;
            }
            sum=0;
        }
        System.out.println(list);
        System.out.println(sum_max);
    }
}
