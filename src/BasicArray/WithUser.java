package BasicArray;

import java.util.Scanner;

public class WithUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int n=arr.length;
        for (int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
    }
}
