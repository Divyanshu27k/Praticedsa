package lovebobber;

import java.sql.SQLOutput;

public class PatternQ1 {
    public static void main(String[] args){
        //1.
       // int n=4;
//        for(int i =1;i<=4;i++){
//            for (int j=1;j<=6;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
       // 2
//        int n =5;
//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=row;col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //3
//         int n=5;
//        for(int row =1;row<n;row++){
//
//            //space like in blank space
//            for(int col=1;col<n-row;col++){
//                System.out.print(" ");
//            }
//            for (int col=1;col<=n;col++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
        //4
//        int n=5;
//        for (int row =1; row<=n;row++){
//
//            for(int col=1; col<=n-row+1;col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //5
//        int n=5;
//        for(int row=1;row<=n;row++){
//            //space
//            for(int col =1;col<=n-row;col++){
//                System.out.print(" ");
//            }
//            //stars
//            for (int col=1;col<=2*row-1;col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//       // 6
//       // int n=4;
//        for(int row=1;row<=n;row++){
//            if(row == 1){
//                continue;
//            }
//            //space
//            for(int col =1;col<=row-1;col++){
//                System.out.print(" ");
//            }
//            //stars
//            for (int col=1;col<=2*n-2*row+1;col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //5
//        int n=5;
//        for(int row=1;row<=n;row++){
//            //space
//            for(int col =1;col<=6;col++){
//                if(row==1 || row==n){
//                    System.out.print("*");
//                    //System.out.println();
//                }else{
//                    if(col == 1||col==6) {
//                        System.out.print("*");
//
//                    }else {
//                        System.out.print(" ");
//                    }
//                }
//            }
//
//            System.out.println();
//        }
        //6
//        int n=10;
//        for(int row=1;row<=n;row++){
//            //space
//         //   for(int col =1;col<=6;col++){
//                if(row==1 || row==2 ||row==n){
//                    for(int col =1;col<=row;col++){
//                        System.out.print("*");
//                    }
//
//                    //System.out.println();
//                }else{
//
//                        System.out.print("*");
//                        for(int col=1;col<=(row-2);col++){
//                            System.out.print(" ");
//
//                    }
//                        System.out.print("* ");
//                }
//      //      }
//
//            System.out.println();
//        }
          //7
//        int n= 5;
//
//        for (int row=1;row<=n;row++){
//
//            //space part1
//            for(int col=1;col<=n-row;col++){
//                System.out.print(" ");
//            }
//            //part2
//            if(row==1|| row==n){
//                for(int col=1;col<=2*row-1;col++){
//                    System.out.print("*");
//
//                }
//
//            }else{
//                System.out.print("*");
//                //2r-3 space
//                for(int col=1;col<=2*row-3;col++){
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//            }
//            System.out.println();
//
//
//        }
        int n=4;
        for(int row=1;row<=n;row++){
            //part 1
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            //part2
            for (int col=1;col<=2 *(n-row);col++){
                System.out.print(" ");
            }
            //part3
            for (int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //inverted symmetrical half
        for (int row=1;row<=n;row++){
            //part4
            for(int col=1;col<=n-row;col++){
                System.out.print("* ");
            }
            //part5
            for (int col=1;col<=2*(row-1);col++){
                System.out.print(" ");
            }
            //part6
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
