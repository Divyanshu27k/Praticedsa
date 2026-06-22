package array;

public class FindingNumber {
    public static int findingLargest(int [] arr){
        int max= arr[0];//assume the first element

        for (int i = 0; i<arr.length; i++){
          if (arr[i]> max){
              max=arr[i];
            }
        }
        return max;
    }
    public static void main(String [] args){
        int[] array={10,20,30,40,50};
        int result = findingLargest(array);
        System.out.println("Largest Number: " + result);

    }
}
