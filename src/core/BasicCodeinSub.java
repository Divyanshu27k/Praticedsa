package core;

import java.util.Scanner;

public class BasicCodeinSub {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the first number you can subtract : ");
        int num1= sc.nextInt();

        System.out.print("Enter the second number Subtrct : ");
        int num2 =sc.nextInt();

        int sum= num1-num2;

        System.out.println("Sum of the total : " + sum);

        sc.close();
    }
}
