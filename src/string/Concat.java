package string;

import java.util.Scanner;

public class Concat {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name:");
        String name=sc.nextLine();
        System.out.println("Enter a name2:");
        String name1=sc.nextLine();
        System.out.println("Concatination of "+name+" and "+name1+" is");
        System.out.println(name.concat(name1));
    }
}
