package lovebobber;

import java.util.Scanner;

public class ArrayQuestion {
    public static void main(String[] args) {

        //1 find the min in array
//        int arr[] = {3, 2, -5, 21, 10};
//        int n = arr.length;
//
//        int minvalue = arr[0];
//
//        for (int i = 0; i < n - 1; i++) {
//            if (arr[i] < minvalue) {
//                minvalue = arr[i];
//            }
//        }
//        System.out.println(minvalue);

//        int arr[]={4,3,6,7,-9,-4,10};
//        int n = arr.length;
//
//        int minv=arr[0];
//        for(int i=0;i<n-1;i++){
//            if (arr[i]< minv){
//                minv =arr[i];
//            }
//        }
//        System.out.println(minv);

        //max value
//        int arr[]={3,2,-5,21,10};
//        int n=arr.length;
//        int maxvalue=arr[0];
//
//        for (int i=0;i<=n-1;i++){
//            if(arr[i] > maxvalue){
//                maxvalue=arr[i];
//            }
//        }
//        System.out.println(maxvalue);
//        int arr[]={2,35,6,86,00023};
//        int n= arr.length;
//        int maxvaluve=arr[0];
//
//        for (int i=0;i<=n-1;i++){
//            if(arr[i] > maxvaluve){
//                maxvaluve=arr[i];
//            }
//        }
//        System.out.println(maxvaluve);
//         int arr[]={23,56,56,34,24,23};
//         int n=arr.length;
//         int max=arr[0];
//         for (int i=0;i<=n-1;i++){
//             if(arr[i] > max){
//                 max=arr[i];
//             }
//         }
//        System.out.println(max);



        //printing the all number to multiple
//        int arr[]={2,3,10,20};
//        int mul=1;
//        int n=arr.length;
//        for (int i=0;i<=n-1;i++){
//            int value =arr[i];
//            mul= mul*value;
//
//        }
//        System.out.println(mul);

        //printing the all number to add
//        int arr[]={10,20,30,40,50};
//        int sum=0;
//        int n=arr.length;
//
//        for (int i=0;i<=n-1;i++){
//            int value =arr[i];
//            sum =sum+ value;
//        }
//        System.out.println(sum);

        //printing the
//        int arr[] = {12,14,1245};
//        int n=arr.length;
//
//        for(int i=0;i<=n-1;i++){
//            System.out.println(arr[i]);
////            System.out.println(arr[0]);
////            System.out.println(arr[1]);
////            System.out.println(arr[2]);
//
//        }


//        int arr[]=new int[5];
//        Scanner sc=new Scanner(System.in);
//        int n= arr.length;
//        for (int i =-0;i<=n-1;i++){
//            System.out.println("Provide input for index  " + i);
//            arr[i]=sc.nextInt();
//        }
//        //print
//        for(int val: arr){
//            System.out.println(val);
//
//        }
//        int arr[] =new int[11];
//        Scanner sc=new Scanner(System.in);
//        int n= arr.length;
//        for(int i=0;i<=n-1;i++){
//            System.out.println("Give me your number : " + i);
//            arr[i]= sc.nextInt();
//
//        }
//        //printing the no.
//        for(int val : arr){
//            System.out.println(val);
//        }


        //        int arr[];
//        arr=new int[5];
//        int brr[]=  {1,2,3};
//        int n=brr.length;

//        for (int val :brr){
//            System.out.println(val);
//        }
//        for (int index=0;index<=n-1;index++){
//            System.out.println(brr[index]);
//        }
//        System.out.println("value of 0 index :" + brr[0]);
//        System.out.println("value of 1 index :" + brr[1]);
//        System.out.println("value of 2 index :" + brr[2]);

        //multiple by 2D array
//        int arr[] []={{1,2,3},{4,6,7}};
//        int sum=0;
//        int ans=1;
//        for(int i=0;i<arr.length;i++){
//            for (int j =0;j<arr[i].length;j++){
//                int val=arr[i][j];
//                ans=ans*val;
//            }
//            System.out.println(ans);
//        }
        //2D array mai max value how to find
        int arr[] []={{1,2,3},{4,6,7}};
        int maxValue=arr[0][0];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                if (arr[i][j] > maxValue){
                    maxValue =arr[i][j];
                }
            }
        }
        System.out.println(maxValue);
    }
}
