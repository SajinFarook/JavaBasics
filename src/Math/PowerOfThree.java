package Math;

public class PowerOfThree {
    static void main(String[] args) {
        int n=27;
        while(n%3==0){
            n=n/3;
        }
        if(n==1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
