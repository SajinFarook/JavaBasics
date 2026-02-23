package Math;

import java.util.Scanner;

public class Fibonacci {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        int f1=0;
        int f2=1;
        int f3=0;
        if(n==1){
            System.out.println(f1);
        }
        else if(n==2){
            System.out.println(f1);
            System.out.println(f2);
        }
        else{
            System.out.println(f1);
            System.out.println(f2);
            for(int i=3;i<=n;i++){
                f3=f1+f2;
                System.out.println(f3);
                f1=f2;
                f2=f3;

            }
        }
    }
}
