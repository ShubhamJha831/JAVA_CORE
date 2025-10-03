package CollectionandGenerics.Collection;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class testingCollection {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(4);
        numList.add(5);
        numList.add(6);
        numList.add(7);
        numList.add(8);
        Utility.Print(numList);

        Collections.sort(numList);

        Utility.Print(numList);

        Collections.reverse(numList);

        Utility.Print(numList);
    }
}
