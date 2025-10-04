package CHALLANGES.Challange_no90;

import org.w3c.dom.DOMStringList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        List<String>  list = Arrays.asList("Bear", "lion","fox");
        System.out.println(list);
        shortInDesending(list);
        System.out.println(list);
    }

    public static void shortInDesending(List<String> stringList){
        Collections.sort(stringList, new java.util.Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                if(s.equals(t1)){
                    return 0;
                }else if (s.charAt(0) < t1.charAt(0)){
                    return 1;
                }else{

                return -1;
                }
            }
        });

    }
}
