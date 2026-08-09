package afterlongtime;

import java.util.Scanner;

/*Problem statement
Write a program that takes three numbers a,b, and c as input and prints the largest number amongst them.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
4 6 1
Sample Output 1 :
6
Explanation of Sample Input 1:
6 is the highest of amongst all.
Sample Input 2 :
-32 -23 -76
Sample Output 2 :
-23
Explanation of Sample Input 2:
-23 is the highest of amongst all.
Sample Input 3 :
-4 0 5
Sample Output 3 :
5
Explanation of Sample Input 2:
5 is the highest of amongst all.
*/
public class ProblemStatement7 {
    public static void main(String args[]) {

        // Write code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

        sc.close();

    }
}
