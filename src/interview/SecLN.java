package interview;

public class SecLN {
    public static void main(String[] args) {
        int arr[]={23,45,67,89,5,2,4};

        Integer largest=null;
        Integer secondLargest=null;
        for (int num : arr) {
            if (largest == null || num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num != largest &&(secondLargest == null || num > secondLargest)) {
                secondLargest = num;
            }
        }
        if (secondLargest == null) {
            System.out.println( "Second largest distinct number does not exist");
        } else {
            System.out.println(secondLargest);
        }
    }
}
