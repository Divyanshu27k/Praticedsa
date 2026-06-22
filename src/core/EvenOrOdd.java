package core;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the First number : " );
        int num=sc.nextInt();

        if(num%2 ==0 ){
            System.out.println("Even Number");

        }else {
            System.out.println("Odd numbers");
        }
        sc.close();
    }
}
