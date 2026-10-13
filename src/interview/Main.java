package interview;

public class Main {
    public static void main(String[] args) {
//        String str="Divyanshu";
//        String reverse="";
//        for(int i=str.length()-1;i>=0;i--){
//            reverse += str.charAt(i);
//        }
//        System.out.println(reverse);
        String reversed = new StringBuilder("Divyanshu")
                .reverse()
                .toString();
        System.out.println(reversed);
    }

}
