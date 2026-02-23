package Math;

import java.util.Scanner;

public class Power {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Base number:");
        int base= sc.nextInt();
        System.out.println("Enter power number:");
        int exp=sc.nextInt();
        int pow=1;
        while(exp>0){
            pow=pow*base;
            exp-=1;

        }
        System.out.println("Power of "+base+" and "+exp+" is "+pow);
    }
}
