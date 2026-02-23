package Math;

import java.util.Scanner;

public class GCD {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("Enter first number:");
        int num2= sc.nextInt();
        System.out.println("Enter second number:");
        while(num2!=0){
            int temp=num1%num2;
            num1=num2;
            num2=temp;
        }
        System.out.println(num1);
    }
}
