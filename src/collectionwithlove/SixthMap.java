package collectionwithlove;

import java.util.HashMap;
import java.util.Map;

public class SixthMap {
    public static void main(String[] args) {

        HashMap<Integer, String> map=new HashMap<>();
        map.put(1,"divyanshu");
        map.put(1,"divyanshu");
        map.put(1,"divyanshu");
        map.put(1,"divyanshu");
        System.out.println(map);
        Map<String,String> maping= new HashMap<>();
        maping.put("asia","india");
        maping.put("us","srilanka");
        maping.put("africa","Afghanistan");
        maping.put("j","bhutan");
        maping.put("k","nepal");

        System.out.println(maping);
        Map<String,String>table=new HashMap<>();
        table.put("africa","SouthAfrica");
        System.out.println("before:" +table);
        table.putAll(maping);
        System.out.println("After:" +table);

        table.remove("j");
        System.out.println("After:" +table);
        table.putIfAbsent("is","india1");
        System.out.println(table.get("us"));
        System.out.println(table);



    }
}
