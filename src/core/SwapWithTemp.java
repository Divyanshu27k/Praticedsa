package core;

import java.util.Scanner;

public class SwapWithTemp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int a =sc.nextInt();

        System.out.print("Enter the Second number : ");
        int b = sc.nextInt();

        int temp=a;
        a= b;
        b=temp;

        System.out.println("After swap:");
        System.out.println("a = " + a + ", b = " + b);

        sc.close();
    }
}
