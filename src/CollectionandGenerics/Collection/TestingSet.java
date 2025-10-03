package CollectionandGenerics.Collection;

import jdk.jshell.execution.Util;

import java.util.Set;
import java.util.HashSet;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();


        System.out.println(names.add("Shubham"));
        System.out.println(names.add("Neha"));
        System.out.println(names.add("Anita"));

        Utility.Print(names);

        System.out.println(names.add("Shubham"));
        System.out.println(names.size());
        Utility.Print(names);

        System.out.println(names.contains("Shubham"));
        System.out.println(names.remove("Shubham"));
        Utility.Print(names);
        System.out.println(names.remove("Shubham"));


    }
}
