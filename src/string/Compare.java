package string;

import java.util.Scanner;
public class Compare {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Object
        System.out.println("Enter a name:");
        String name=sc.nextLine();
        System.out.println("Enter a name2:");
        String name1=sc.nextLine();
        //camparitor
        if(name==name1){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
        //methods
        if(name.equals(name1)){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
        //Literal
        String name3="Abc";
        String name4=name3;
        if(name3==name4){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
    }

}
