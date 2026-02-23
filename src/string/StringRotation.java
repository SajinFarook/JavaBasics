package string;

public class StringRotation {
    static void main(String[] args) {
        String word1="AbCd";
        String word2="CdAb";
        word1=word1.toLowerCase();
        word2=word2.toLowerCase();
//        boolean same=false;
//        if(word1.length()==word2.length()){
//            for (int i = 0; i <word1.length()-1 ; i++) {
//                char w=word2.charAt(i);
//                if(word1.contains(String.valueOf(w))){
//                    same=true;
//                }
//                else{
//                    same=false;
//                }
//            }
//        }
//        if(!same){
//            System.out.println("Not Same");
//        }
//        else{
//            System.out.println("Same");
//        }
        String str=word1+word1;
        System.out.println(str.contains(word2));
    }
}
