package string;

import java.util.Scanner;

public class AddSpace {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        StringBuilder n=new StringBuilder();
        for(int i=0;i<sb.length();i++){
            n.append(sb.charAt(i));
            if(i<sb.length()-1){
                n.append("_");
            }
        }
        System.out.println("New String:");
        System.out.println(n);
    }
}