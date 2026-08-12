package tcsprepreation;

import java.util.Scanner;

public class AddingTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first value : ");
        int a=sc.nextInt();
        System.out.println("These is a first value is : "+a);
        System.out.println("================================");
        System.out.println("Enter the Second value : ");
        int b= sc.nextInt();
        System.out.println("These is second value is  :"+b);
        System.out.println("================================");
        int sum=a+b;
        System.out.println("These is the Answer :"+sum);
        sc.close();
    }
}
