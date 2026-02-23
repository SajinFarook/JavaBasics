package Math;

import java.util.Scanner;

public class CompoundInterest {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal amt:");
        int p= sc.nextInt();
        System.out.println("Enter Tensure Period:");
        int t=sc.nextInt();
        System.out.println("Enter Rate of Interest:");
        float r= (float)sc.nextInt()/100;
        System.out.println("Enter the number of time the amount is compounded per year:");
        int n= sc.nextInt();
        int nt=n*t;
        float A=1;
        for(int i=0;i<nt;i++){
            A*=1+(r/n);
        }
        A*=p;
        System.out.println("Principal amount: "+p);
        System.out.println("Total Compound Interest: "+(int)(A-p));
        System.out.println("Total Amount to be paid: "+(int)A);
    }
}
