package afterlongtime;

import java.util.Scanner;

/*Problem statement
Write a program to accept a coordinate point in an XY coordinate system and determine in which quadrant the coordinate point lies.

Print

"1st Quadrant": if  +x,+y
"2nd Quadrant": if -x,+y
"3rd Quadrant": if -x,-y
"4th Quadrant": if +x,-y
"x axis": if x,0
"y axis": if 0,y
"Origin": if 0,0
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
5 100
Sample Output 1 :
1st Quadrant
Explanation of Sample Input 1:
Both x and y are positive so the point lies in 1st Quadrant.
Sample Input 2 :
0 -80
Sample Output 2 :
y axis
Explanation of Sample Input 2:
 Since x is 0 the point lies in y-axis.
Sample Input 3 :
-2 40
Sample Output 3 :
2nd Quadrant
Explanation of Sample Input 3:
Since x is negative and y is positive the point lies in 2nd Quadrant.*/
public class ProblemStatement8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x == 0) {
            System.out.println("y axis");
        } else if (y == 0) {
            System.out.println("x axis");
        } else if (x > 0 && y > 0) {
            System.out.println("1st Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("2nd Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("3rd Quadrant");
        } else {
            System.out.println("4th Quadrant");
        }

        sc.close();
    }
}
