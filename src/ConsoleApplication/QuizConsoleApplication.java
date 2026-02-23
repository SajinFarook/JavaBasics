package ConsoleApplication;

import java.util.Scanner;

public class QuizConsoleApplication {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String og_name="SajinFarook";
        String og_password="sajin123";
        int attempt=1;
        int pass_attempt=1;
        while(attempt<=3){
            System.out.println("Enter Username:");
            String name=sc.nextLine();
            if(name.equals(og_name)){
                while(pass_attempt<=3){
                    System.out.println("Enter Password:");
                    String pass=sc.nextLine();
                    if(pass.equals(og_password)){
                        System.out.println("1) Java Quiz\n2) Logical Reasoning\n3) Exit");
                        System.out.println("Enter a Option:");
                        int opt=sc.nextInt();
                        int mark=0;
                        switch (opt){
                            case 1:
                                //1
                                System.out.println("1)What happens if an abstract class does not have any abstract methods?\n a)It will not compile.\n b)The class can still be abstract.\n c)Java will automatically provide an abstract method.\n d)It becomes a concrete class.");
                                sc.nextLine();
                                System.out.println("Enter an option: ");
                                char ans1=sc.nextLine().charAt(0);
                                if(ans1=='b'||ans1=='B'){
                                    mark+=1;
                                }
                                //2
                                System.out.println("2)What is the size of float and double in java?\n a)32 and 64.\n b)32 and 32.\n c)64 and 64.\n d)64 and 32.");
                                sc.nextLine();
                                System.out.println("Enter an option: ");
                                char ans2=sc.nextLine().charAt(0);
                                if(ans2=='a'||ans2=='A'){
                                    mark+=1;
                                }
                                //3
                                System.out.println("3)Number of primitive data types in Java are?\n a)6.\n b)7.\n c)8.\n d)9.");
                                sc.nextLine();
                                System.out.println("Enter an option: ");
                                char ans3=sc.nextLine().charAt(0);
                                if(ans3=='c'||ans3=='C'){
                                    mark+=1;
                                }
                                //4
                                System.out.println("4)Automatic type conversion is possible in which of the possible cases?\n a)Byte to int .\n b)Int to long.\n c)Long to int.\n d)Short to int.");
                                sc.nextLine();
                                System.out.println("Enter an option: ");
                                char ans4=sc.nextLine().charAt(0);
                                if(ans4=='b'||ans4=='B'){
                                    mark+=1;
                                }
                                //5
                                System.out.println("5)Select the valid statement?\n a)char[] ch=new char(5).\n b)char[] ch=new char().\n c)char[] ch=new char[].\n d)char[] ch=new char[5].");
                                sc.nextLine();
                                System.out.println("Enter an option: ");
                                char ans5=sc.nextLine().charAt(0);
                                if(ans5=='d'||ans5=='D'){
                                    mark+=1;
                                }
                                //6
                                System.out.println("6)Select the valid statement to declare and initialize an array?\n a)int[] arr={1,2,3}.\n b)int[] arr={}.\n c)int[][]arr={1,2,3}.\n d)int[] arr=(1,2,3)");
                                sc.nextLine();
                                System.out.println("Enter an option: ");
                                char ans6=sc.nextLine().charAt(0);
                                if(ans6=='a'||ans6=='A'){
                                    mark+=1;
                                }
                                //7
                                System.out.println("7)What is the default value of an int instance variable in Java?\n a)0.\n b)Null.\n c)Undefined.\n d)Garbage Value.");
                                sc.nextLine();
                                System.out.println("Enter an option: ");
                                char ans7=sc.nextLine().charAt(0);
                                if(ans7=='a'||ans7=='A'){
                                    mark+=1;
                                }
                                //8
                                System.out.println("8)Arrays in java are-?\n a)Object.\n b)Object Reference.\n c)Primitive.\n d)None.");
                                sc.nextLine();
                                System.out.println("Enter an option: ");
                                char ans8=sc.nextLine().charAt(0);
                                if(ans8=='a'||ans8=='A'){
                                    mark+=1;
                                }
                                //9
                                System.out.println("9)Which of the following comparisons is correct for comparing two strings in Java?\n a)str1==str2.\n b)str1.compare(str2).\n c)str1.equals(str2).\n d)str1=str2.");
                                sc.nextLine();
                                System.out.println("Enter an option: ");
                                char ans9=sc.nextLine().charAt(0);
                                if(ans9=='c'||ans9=='C'){
                                    mark+=1;
                                }
                                //10
                                System.out.println("10)Which symbol is used to end a statement in Java?\n a):\n b);\n c).\n d),");
                                sc.nextLine();
                                System.out.println("Enter an option: ");
                                char ans10=sc.nextLine().charAt(0);
                                if(ans10=='b'||ans10=='B'){
                                    mark+=1;
                                }
                                break;
                            case 2:
                                //1
                                System.out.println("1)Find the next number:\n2, 6, 12, 20,?\n a)28.\n b)30.\n c)28.\n d)32.");
                                sc.nextLine();
                                System.out.println("Enter an option: ");
                                char ans_1=sc.nextLine().charAt(0);
                                if(ans_1=='b'||ans_1=='B'){
                                    mark+=1;
                                }
                                //2
                                System.out.println("2)Which word does not belong to the group?\n a)Apple.\n b)Mongo.\n c)Potato.\n d)Banana.");
                                System.out.println("Enter an option: ");
                                char ans_2=sc.nextLine().charAt(0);
                                if(ans_2=='c'||ans_2=='C'){
                                    mark+=1;
                                }
                                //3
                                System.out.println("3)What comes next?\nA, C, F, J, O, ?\n a)T.\n b)U.\n c)V.\n d)W.");
                                System.out.println("Enter an option: ");
                                char ans_3=sc.nextLine().charAt(0);
                                if(ans_3=='a'||ans_3=='A'){
                                    mark+=1;
                                }
                                //4
                                System.out.println("4)Pen : Write :: Knife : ?\n a)Weapon .\n b)Sharp.\n c)Steel.\n d)Cut.");
                                System.out.println("Enter an option: ");
                                char ans_4=sc.nextLine().charAt(0);
                                if(ans_4=='d'||ans_4=='D'){
                                    mark+=1;
                                }
                                //5
                                System.out.println("5)If CAT is written as DBU, how is DOG written?\n a)EPH.\n b)EOG.\n c)FPH.\n d)DOH.");
                                System.out.println("Enter an option: ");
                                char ans_5=sc.nextLine().charAt(0);
                                if(ans_5=='a'||ans_5=='A'){
                                    mark+=1;
                                }
                                //6
                                System.out.println("6)A person walks 10 m north, then 10 m east, then 10 m south.How far is he from the starting point?\n a)0 m.\n b)10 m.\n c)20 m.\n d)30 m");
                                System.out.println("Enter an option: ");
                                char ans_6=sc.nextLine().charAt(0);
                                if(ans_6=='b'||ans_6=='B'){
                                    mark+=1;
                                }
                                //7
                                System.out.println("7)Pointing to a man, a woman says, “He is the son of my grandfather.How is the man related to the woman?\n a)Uncle.\n b)Cousin.\n c)Brother.\n d)Father.");
                                System.out.println("Enter an option: ");
                                char ans_7=sc.nextLine().charAt(0);
                                if(ans_7=='a'||ans_7=='A'){
                                    mark+=1;
                                }
                                //8
                                System.out.println("8)Statement:\nAll cats are animals.\n" +
                                        "Some animals are black.Conclusion:\n" +
                                        "Some cats are black.\n a)True.\n b)False.\n c)Contradiction.\n d)Not Determined.");
                                System.out.println("Enter an option: ");
                                char ans_8=sc.nextLine().charAt(0);
                                if(ans_8=='c'||ans_8=='C'){
                                    mark+=1;
                                }
                                //9
                                System.out.println("9)Which number does not belong?\n a)121.\n b)144.\n c)169.\n d)196.");
                                System.out.println("Enter an option: ");
                                char ans_9=sc.nextLine().charAt(0);
                                if(ans_9=='a'||ans_9=='A'){
                                    mark+=1;
                                }
                                //10
                                System.out.println("10)How many times do the hands of a clock overlap in a day?\n a)12.\n b)24\n c)22.\n d)11.");
                                System.out.println("Enter an option: ");
                                char ans_10=sc.nextLine().charAt(0);
                                if(ans_10=='c'||ans_10=='C'){
                                    mark+=1;
                                }
                                break;
                            case 3:
                                break;
                            default:
                                System.out.printf("enter a valid input");
                        }
                        System.out.println("This is a console based application quiz:");
                        System.out.println("Your total marks: "+mark);
                        if (mark==0){
                            System.out.println("Very Poor Performance");
                        }
                        else if (mark>=1&&mark<=3) {
                            System.out.println("Poor Performance");
                        }
                        else if (mark>=4&&mark<=6) {
                            System.out.println("Average Performance");
                        }
                        else if (mark>=7&&mark<=9) {
                            System.out.println("Good Performance");
                        }
                        else {
                            System.out.println("Excellent Perfomance");
                        }
                    }
                    else{
                        System.out.println("Invalid Password");
                    }
                    pass_attempt+=1;
                }
                System.out.println("Try again later,Thank You :)");
                break;
            }
            else{
                System.out.println("Invalid Username");
            }
            attempt+=1;
        }
        System.out.println("Your total attempt has been exceeded,Try again later :)");
    }
}
