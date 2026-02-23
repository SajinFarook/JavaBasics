package OOPS;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {
    public static Scanner sc=new Scanner(System.in);
    ArrayList<Library> librabry=new ArrayList<>();
    public static void main(String[] args){
        System.out.println("1)ADD NEW BOOK\n2) VIEW ALL BOOKS\n3)SEARCH BOOKS\n4)ISSUE BOOK\n5) RETURN BOOKS\n6) VIEW AVAILABLE BOOKS\n7) EXIT THE SYSTEM");
        int opt=sc.nextInt();
        switch (opt){
            case 1:
                Library lib=new Library();
                System.out.println("Entre Id:");
                int id=sc.nextInt();
                System.out.println("Entre Name:");
                String name=sc.nextLine();
                System.out.println("Entre Author:");
                String author=sc.nextLine();
                System.out.println("Entre Genre:");
                String genre=sc.nextLine();
                System.out.println("Entre Price:");
                float price=sc.nextFloat();

        }
    }
}
