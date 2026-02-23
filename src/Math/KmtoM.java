package Math;

import java.util.Scanner;

public class KmtoM {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Km to M");
        System.out.println("Enter Kilometer:");
        int km=sc.nextInt();
        int m=km*1000;
        System.out.println(m+" meters");
        System.out.println("M to Km");
        System.out.println("Enter Meter:");
        int m1=sc.nextInt();
        float km1=(float) m1/1000;
        System.out.println(km1+" Kilometer");
    }
}
