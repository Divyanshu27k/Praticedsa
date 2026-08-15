package tcsprepreation;

public class LargestElement {
    public static void main(String[] args) {
//        int arr[]={12,32,45,65,34};
//        int max= arr[0];
//        for (int i=1;i< arr.length;i++){
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);
        int arr[]={1,2,3,4,5,6,7,8,9};
        int max=arr[0];
        for (int i=1;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
