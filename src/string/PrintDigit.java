package string;

import java.util.Scanner;

public class PrintDigit {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name:");
        String name=sc.nextLine();
        StringBuilder name2=new StringBuilder();
        for(int i=0;i<name.length();i++){
            if(Character.isDigit(name.charAt(i))){
                name2.append(name.charAt(i));
            }
        }
        System.out.println(name2);
    }
}
