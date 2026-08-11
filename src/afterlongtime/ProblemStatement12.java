package afterlongtime;

import java.util.Scanner;
/*Problem statement
Write a program to find x to the power n (i.e., x^n). Take x and n from the user. You need to print the answer.

Note: For this question, you can assume that 0 raised to the power of 0 is 1



Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= x <= 8
0 <= n <= 9
Sample Input 1 :
 3 4
Sample Output 1 :
81
Explanation of Sample Input 1:
3^4=3*3*3*3=81
Sample Input 2 :
 2 5
Sample Output 2 :
32
Explanation of Sample Input 2:
2^5=2*2*2*2*2=32*/
public class ProblemStatement12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*x;
        }
        System.out.println(result);
        sc.close();
    }
}
