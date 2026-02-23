package LoopProblem.Switch;

import java.util.Scanner;

public class HotelMenu {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("MENU:");
        System.out.println("1:Poori -Rs.50");
        System.out.println("2:Dosa -Rs.60");
        System.out.println("3:Idly -Rs.40 ");
        System.out.println("4:Pongal -Rs.70");
        System.out.println("Enter a number from the menu:");
        int num=sc.nextInt();
        switch(num){
            case 1:
                System.out.println("Food Item:Poori ,Price=Rs.50");
                break;
            case 2:
                System.out.println("Food Item:Dosa,Price=Rs.60");
                break;
            case 3:
                System.out.println("Food Item:Idly ,Price=Rs.40");
                break;
            case 4:
                System.out.println("Food Item:Pongal ,Price=Rs.70");
                break;
            default:
                System.out.println("Enter a valid number from the menu");
        }
    }
}
