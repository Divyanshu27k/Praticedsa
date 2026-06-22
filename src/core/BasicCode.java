package core;

import java.util.Scanner;

public class BasicCode {

    public static  void main(String[] args){
//        int a=56;
//        int b=78;
//        int c=a+b;
//        System.out.println("These is the result: " +c);
        Scanner sc=new Scanner(System.in);

        //first number
        System.out.print("Enter the first number: ");
        int num1= sc.nextInt();

        ///second number
        System.out.print("Enter the Second number: ");
        int num2 = sc.nextInt();

        //calculate sum
        int sum= num1+ num2;

        //final output is there
        System.out.println("Sum  : " + sum);

        //close scanner
        sc.close();


    }
}
