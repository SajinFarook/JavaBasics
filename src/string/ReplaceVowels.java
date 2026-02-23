package string;

import java.util.Scanner;

public class ReplaceVowels {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name:");
        String name= sc.nextLine();
        name=name.toLowerCase();
        String vowels="aeiouAEIOU";
        StringBuilder name1=new StringBuilder();
        for(int i=0;i<name.length();i++){
            StringBuilder ch=new StringBuilder();
            ch.append(name.charAt(i));
            if(!vowels.contains(ch)){
                name1.append(name.charAt(i));
            }
            else{
                name1.append("#");
            }
        }
        System.out.println(name1);
    }
}
