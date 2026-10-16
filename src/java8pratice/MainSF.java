package java8pratice;

import java.sql.SQLOutput;

public class MainSF {
    public static void main(String[] args) {
//        Emp ep=new SoftwareEngineer();
//        System.out.println(ep.getNmae());
        Emp ep=()-> "d Engineer";
        System.out.println(ep.getNmae());
        Emp editor=()->"tester ";
        System.out.println(editor.getNmae());
    }
}
