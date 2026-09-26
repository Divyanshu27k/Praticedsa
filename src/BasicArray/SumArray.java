package BasicArray;

public class SumArray {
    public static void main(String[] args) {

    int arr[]={1,3,56,75,45};
    int sum=0;
    int n=arr.length;
    for(int i=0;i<=n-1;i++) {
       int value=arr[i];
       sum=sum+value;
    }
        System.out.println(sum);
    }
}
