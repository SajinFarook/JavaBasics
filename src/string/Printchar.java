package string;

import java.util.Scanner;

public class Printchar {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name:");
        String name=sc.nextLine();
        for (int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
}
