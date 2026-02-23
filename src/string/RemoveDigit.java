package string;

import java.util.Scanner;

public class RemoveDigit {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name:");
        String name=sc.nextLine();
        StringBuilder name2=new StringBuilder();
        for(int i=0;i<name.length();i++){
            if(!Character.isDigit(name.charAt(i))){
                name2.append(name.charAt(i));
            }
        }
        System.out.println("String with Digits:");
        System.out.println(name);
        System.out.println("String without Digits:");
        System.out.println(name2);

//        String name3=name.replace("//d","");
//        System.out.println(name3);
    }
}
