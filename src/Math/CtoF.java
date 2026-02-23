package Math;

import java.util.Scanner;

public class CtoF {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Celsius:");
        float c=sc.nextFloat();
        float f=c*((float) 9/5)+32;
        System.out.println(f+" Fahrenheit");
        System.out.println("Enter Fahrenheit:");
        float f1=sc.nextFloat();
        float c1=(f1-32)*((float) 5/9);
        System.out.println(c1+" Celsius");
    }
}
