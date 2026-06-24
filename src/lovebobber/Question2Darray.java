package lovebobber;

public class Question2Darray {
    public static void main(String[] args) {

        //

        int[][] arr;
        arr = new int[3][4];
        // int [][] brr= {{1,2},{2,3},{3,4},{4,5}};
        int[][] brr = {{1, 2}, {2, 3, 4, 5}, {3, 4, 4, 5, 6, 7}, {4}};

        //System.out.println(brr[0][0]);
        int rowlength = brr.length;
//        int collength= brr[0].length;
        for (int rowindex = 0; rowindex <= rowlength - 1; rowindex++) {
            int collength = brr[rowindex].length;
            for (int colindexx = 0; colindexx <= collength - 1; colindexx++) {
                System.out.print(brr[rowindex][colindexx] + " ");
            }

//            for (int colIndex=0;colIndex<=collength-1;colIndex++){
//                System.out.print(brr[rowindex][colIndex]);
//            }
            System.out.println();
        }
    }

}
