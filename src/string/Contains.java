package string;

import java.util.Scanner;

public class Contains {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name:");
        String name = sc.nextLine();
        if(name.contains("i")){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
