package lovebobber;

public class MathOperationQuestion {

    static void printDigit(int num) {
        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);

            num = num / 10;
        }
    }
    static int countDigit(int num) {
        int count=0;
        while (num != 0) {
            int digit = num % 10;
            count++;
          //  System.out.println(digit);

            num = num / 10;
        }
        return count;
    }
    static int sumofDigit(int num) {
        int sum=0;
        while (num != 0) {
            int digit = num % 10;
            sum =sum + digit;
            num = num/10;
        }
        return sum;
    }

    static int reverseNum(int num) {
        int revNum = 0;
        while (num != 0) {
            int digiit = num % 10;
            revNum = revNum * 10 + digiit;
            num = num / 10;
        }
        return revNum;

    }
    static  boolean isPolidrome(int num){
        int originalNum=num;
        int reversedNum=reverseNum(num);
        if (originalNum == reversedNum ){
            System.out.println("it is a palidrome");
            return  true;
        }
        else{
            System.out.println("it is not a palidrome");
            return false;
        }
    }
    static boolean isPrimenumber(int num){
        for (int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return  true;
    }
    //more time
//        for(int i=2;i<=num-1;i++){
//            if (num%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
    static int getGCD(int a, int b){
        while(b !=0){
            int value=b;
            b=a%b;
            a=value;

        }
        int ans=a;
        return ans;
    }
    static int getLcm(int a,int b){
        int gcd=getGCD(a,b);
        int vl=a*b;
        int lcm=vl/gcd;
        return lcm;
    }
    static boolean isArmstrongnumber(int num){
        int sum=0;
        int originalNum=num;
        while(num!=0){
            int digit = num%10;
            int cubeofDigit = digit*digit*digit;
            sum = sum + cubeofDigit;
            num= num /10;
        }
        if(sum == originalNum){
            return  true;
        }else {
            return false;
        }
    }
    static boolean checkPerfectnum(int num){
        int sum =1;
        for (int i=2;i*i<=num;i++){
            if(num %i==0){
                int firstFactor=i;
                int secondfactor=num/i;
                sum=sum+ firstFactor+secondfactor;
            }
        }
        if(sum == num){
            return true;

        }else{
            return false;
        }
    }
    static  void printallprimenum(int num){
        for(int n=2;n<=num;n++){
            boolean isprime= isPrimenumber(n);
            if(isprime ==true){
                System.out.println(num);
            }

        }
    }


    public static void main(String[] args) {
   //     int num = 53127;
      //  System.out.print(num);
     //   printDigit(num);

        //digit print
//        int ans =countDigit(num);
//        System.out.println(ans);

        //sum of digit of a number
//        int sum=sumofDigit(num);
//        System.out.println(sum);

        //reverse number
//        int num= 1234;
//        int revNum=reverseNum(num);
//        System.out.println(revNum);

        //polidrome number
//        boolean ans =isPolidrome(1221);
//        System.out.println(ans);

        //prime number
//        int num=13;
//        System.out.println(isPrimenumber(num));

        //GCD of a number
//        System.out.println(getGCD(18,12));

        //Lcm
//        System.out.println(getLcm(18,1  2));

        //armstrongnumber
//        System.out.println(isPrimenumber(153));

        //chechperfect number
//        System.out.println(checkPerfectnum(6));


        //print all prime number
       // System.out.println();
        printallprimenum(10);

    }


}
