package core;

import java.util.Scanner;

public class CheckingtheIfCondition {
    public  static  void main(String[] args){

        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the number : ");
        double m=sc.nextDouble();

        if (m>=95){
            System.out.println("Scored gain Grade A+ : " + m);
        }else if(m>=90){
            System.out.println("Scored gain Grade A : " + m);
        }else if(m>=85){
            System.out.println("Scored gain Grade B+ : " + m);
        }else if(m>=80){
            System.out.println("Scored gain Grade B : " + m);
        }else if(m>=75){
            System.out.println("Scored gain Grade C+ : " + m);
        }else if(m>=70){
            System.out.println("Scored gain Grade D+ : " + m);
        }else if(m>=50){
            System.out.println("Scored gain Grade D : " + m);
        }else if(m>=40){
            System.out.println("Scored gain Grade E : " + m);
        }else if(m>=35){
            System.out.println("Scored gain Grade F : " + m);
        }else{
            System.out.println("Fail ");
        }

        sc.close();

    }
}
