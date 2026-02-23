package string;

import java.util.Arrays;
import java.util.Scanner;

public class Stringlen {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name:");
        String name=sc.nextLine();
        System.out.println(name.length());
        String [] name1=new String[]{name};
        System.out.println(Arrays.toString(name1));
    }
}
