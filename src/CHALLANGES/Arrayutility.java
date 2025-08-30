package CHALLANGES;

import java.util.*;

public class Arrayutility {
    public static int[] takeDynamicIntArrayInput() {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("Enter integers (press Enter + Ctrl+D/Ctrl+Z to stop):");

        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }

        // convert list to array
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}

