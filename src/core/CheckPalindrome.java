package core;

public class CheckPalindrome {
    public static  void main(String[] args){
        String s = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}
