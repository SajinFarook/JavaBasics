package LoopProblem.forloop;

public class Divisibleby5 {
    static void main(String[] args) {
        for(int i=1;i<=50;i++){
            if(i%5==0){
                System.out.println(i);
            }
            else{
                continue;

            }
        }
    }
}
