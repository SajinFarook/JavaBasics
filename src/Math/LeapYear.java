package Math;

import java.util.Scanner;

public class LeapYear {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year:");
        int year=sc.nextInt();
        boolean n=true;
        if(year%4==0){
            n=true;
            if(year%100==0){
                if(year%400==0){
                    n=true;
                }
                else{
                    n=false;
                }
            }
        }
        if(n==true){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }
}
