package string;

import java.util.Scanner;

public class CountofUpper {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name");
        String name=sc.nextLine();
        int count=0;
        for(int i=0;i<name.length();i++){
            if(Character.isUpperCase(name.charAt(i))){
                count+=1;
            }
        }
        System.out.println("count of upper characters is: "+count);
    }
}
