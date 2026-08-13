package tcsprepreation;

public class ReverseNames {
    public static void main(String[] args) {
        String str="divyanshu";
//        String  reverse="";
//
//        for(int i=str.length()-1;i>=0;i--){
//            reverse=reverse+str.charAt(i);
//        }
//        System.out.println(reverse);
//
        String reverse=new StringBuilder(str).reverse().toString();
        System.out.println(reverse);
    }
}
