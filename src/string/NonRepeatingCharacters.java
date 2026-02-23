package string;

import java.util.Scanner;

public class NonRepeatingCharacters {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name:");
        String name= "swiss";
        char non_repeat=' ';
        for(int i=0;i<name.length();i++){
            for (int j = 0; j <name.length(); j++) {
                char ch=name.charAt(i);
                if(ch==(char)name.charAt(j)){
                    non_repeat=' ';
                }
                else{
                    non_repeat=name.charAt(i);
                }
            }
            if(non_repeat!=' '){
                System.out.println(non_repeat);
                break;
            }
        }
    }
}
