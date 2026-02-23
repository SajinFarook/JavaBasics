package string;

import java.util.Locale;
import java.util.Scanner;

public class LowertoUpperUsingASCII {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s= sc.nextLine();
        String s1="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<97){
                s1=s1+(char)(s.charAt(i)+32);
            }
            else{
                s1=s1+(s.charAt(i));
            }
        }
        System.out.println("LowerCase");
        System.out.println(s1);
//      s=s.toLowerCase();
        String s2="";
        for(int i=0;i<s1.length();i++){
            s2=s2+(char)(s1.charAt(i)-32);
        }
        System.out.println("UpperCase");
        System.out.println(s2);

    }
}
