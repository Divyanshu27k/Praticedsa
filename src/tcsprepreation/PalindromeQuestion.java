package tcsprepreation;

public class PalindromeQuestion {
    public static void main(String[] args) {
        String str="kumar";
        String name= new StringBuilder(str).reverse().toString();
        if(str.equals(name)){
            System.out.println("This is Palindrome");
        }else{
            System.out.println("This not Palindrome");
        }
    }
}
