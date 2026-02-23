package Math;

import java.util.Scanner;

public class Reverse {
    static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        num=Math.abs(num);
        int temp=num;
        int rev=0;
        while(num>0){
            int remin=num%10;
            rev=rev*10+remin;
            num/=10;
        }
        System.out.println("original number is:"+temp);
        System.out.println("Reverse number is:"+rev);
    }
}
