package tcsprepreation;

public class ReverseWords {
    public static void main(String[] args) {

//        String str="divyanshu kumar";
//
//        String[] words=str.split("");
//        for(int i= words.length-1;i>=0;--i){
//            System.out.print(words[i]+"");
//        }
        String str="divyanshu";
        String [] words=str.split("");
        for (int i= words.length-1;i>=0;--i){
            System.out.print(words[i]+"");
        }
    }
}
