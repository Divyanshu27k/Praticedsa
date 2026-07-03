package lovebobber;

public class studentteest {
    public static void main(String[] args) {
//        OopsOperation op=new OopsOperation();
//        op.student_name="Divyanshu kumar";
//        op.classs=8;
//        op.father_name="abcc";
//        op.roll_number=27;
//        op.age=12;
//        op.address="patna";
//        op.mobile_number="77177784370";
//        op.school_name="xyz";
//        System.out.println(op.student_name);
//        System.out.println(op.classs);
//        System.out.println(op.roll_number);
//        System.out.println(op.father_name);
//        System.out.println(op.age);
//        System.out.println(op.address);
//        System.out.println(op.mobile_number);
//        System.out.println(op.school_name);
//
//        op.bunk();
//        op.sleep();
//        op.study();
        OopsOperation op=new OopsOperation(2,12,"dk",8,27,"xyz","patna","7717784370","DAV");

        System.out.println(op.id);
        System.out.println(op.student_name);
        System.out.println(op.classs);
        System.out.println(op.roll_number);
        System.out.println(op.father_name);
        System.out.println(op.age);
        System.out.println(op.address);
        System.out.println(op.mobile_number);
        System.out.println(op.school_name);
        op.bunk();
        op.sleep();
        op.study();

        //copy const

        OopsOperation op2 = new OopsOperation(op);

        System.out.println(op2.student_name);
        System.out.println(op2.age);
        System.out.println(op2.school_name);

    }
}
