package CollectionandGenerics.Collection;

import java.util.ArrayList;

public class TestingList {
    public static void main(String[] args) {
        ArrayList strList = new ArrayList();
        strList.add("shubham");
        strList.add("Jha");

        strList.add(1,"Shubham");
        strList.remove(0);

        if(strList.contains("Jha")){
            System.out.println(strList.indexOf("Jha"));
        }
        for(int i = 0; i < strList.size(); i++){
            System.out.println(strList.get(i));
        }
    }
}
