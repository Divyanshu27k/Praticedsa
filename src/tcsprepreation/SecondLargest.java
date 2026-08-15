package tcsprepreation;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr={78,12,34,56,7,65,32,23,};
        int largest =Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int num : arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            } else if (num >secondLargest && num != largest) {
                secondLargest=num;
            }
        }
        System.out.println("Largest "+largest );
        System.out.println("second Largest "+ secondLargest);
    }
}
