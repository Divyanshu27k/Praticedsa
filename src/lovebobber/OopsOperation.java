package lovebobber;

public class OopsOperation {
    //Attributes
    int id;
    int age;
    String student_name;
    int classs;
    int roll_number;
    String father_name;
    String address;
    String mobile_number;
    String school_name;

    //default const
//    public OopsOperation(){
//        System.out.println("Student defalut const ");
//    }
    //prameterised con
    public OopsOperation(int id,int age,String student_name,int classs,int roll_number,String father_name, String address,String mobile_number,String school_name){

        System.out.println("Student pramterset const const ");
        this.id=id;
        this.student_name=student_name;
        this.classs=classs;
        this.roll_number=roll_number;
        this.father_name=father_name;
        this.address=address;
        this.mobile_number=mobile_number;
        this.school_name=school_name;
    }

    //copy con
//    public OopsOperation(studentteest src) {
//        this.id = src.id;
//        this.student_name = src.student_name;
//        this.classs = src.classs;
//        this.roll_number = src.roll_number;
//        this.father_name = src.father_name;
//        this.address = src.address;
//        this.mobile_number = src.mobile_number;
//        this.school_name = src.school_name;
//    }
    //Method/ behaviour

    public void study(){
        System.out.println(student_name + " Studing");
    }

    public void sleep(){
        System.out.println(student_name + " sleep");
    }

    public void bunk(){
        System.out.println(student_name + " bunking");
    }

    public static void main(String[] args) {

        //Q1.How will you model a program having 100s of students, and each students have their own properties, behaviours and something to hide?





    }
}
