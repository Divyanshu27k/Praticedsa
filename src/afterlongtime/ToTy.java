package afterlongtime;

import java.util.Scanner;

public class ToTy {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the first words");
        String str=sc.nextLine();
        System.out.println("Enter the second words");
        String str2=sc.nextLine();

        String str3=str + str2;
        System.out.println("The names is combined :" + str3);


//        System.out.println("Enter the first number ");
//        int a =sc.nextInt();

//        System.out.println("Enter the second number ");
//        int b= sc.nextInt();
//
//        int c=a+b;
//        System.out.println("Adding of this number :" +a +"+"+ b+ "="+c);
    }
}
