package lovebobber;

public class PMethod {
    //   public static void main(String[] args) {
//       printtable();
//   }
//       // 2. The printtable method is defined OUTSIDE of the main method
//      // 2 table
//       public static void printtable() {
//           for (int i = 1; i <= 10; i++){
//               System.out.println(2 * i + " ");
//           }
//           void printSum(int x, int y){
//
//           }
//       }
//static void print2table() {
//
//    for (int i = 1; i <= 10; i++) {
//        int ans = 2 * i;
//        System.out.println("-> " + ans);
//    }
//}
    void printSum(int i, int j) {
        System.out.println("sum" + (i + j));
    }

    void printmultiple(int i, int j) {
        System.out.println("Multiple" + (i * j));
    }

    void printSum(int i, int j, int z) {
        System.out.println("sum" + (i + j + z));
    }

    void solve(int num) {
        System.out.println("inside solve : " + num);
        num = num * 10;
        System.out.println("inside solve : " + num);

    }

    public static void main(String[] args) {
        PMethod pm = new PMethod();
        int num = 5;
        System.out.println("inside main : " + num);
        pm.solve(num);
        System.out.println("inside main : " + num);

//           pm.printmultiple(43,12);
//           pm.printSum(27,34);
//           pm.printSum(4,6,34);
//        System.out.println("hey");
//
//        print2table();
//
//        System.out.println("bye");
    }

}

