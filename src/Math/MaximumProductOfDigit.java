package Math;

import java.util.Scanner;

public class MaximumProductOfDigit {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int temp=num;
        int prod=1;
        int max=0;
        while(temp!=0){
            int last=temp%10;
            prod*=last;
            if(prod>max){
                max=prod;
                prod=1;
            }
            else{
                prod=1;
            }
            temp/=10;
        }
        System.out.println(max);

    }
}
