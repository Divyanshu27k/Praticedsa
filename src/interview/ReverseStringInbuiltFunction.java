package interview;

public class ReverseStringInbuiltFunction {
    public static String reverseString() {
        String input = new String();
        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;

        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseString());
    }
}
