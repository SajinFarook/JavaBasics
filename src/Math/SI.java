package Math;

import java.util.Scanner;

public class SI {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal amt:");
        int p= sc.nextInt();
        System.out.println("Enter Tensure Period:");
        int t=sc.nextInt();
        System.out.println("Enter Interest Rate:");
        int r= sc.nextInt();
        int SI=(p*t*r)/100;
        System.out.println("Principal amount: "+p);
        System.out.println("Total Simple Interest: "+SI);
        System.out.println("Total Amount to be paid: "+ (p+SI));
    }
}
