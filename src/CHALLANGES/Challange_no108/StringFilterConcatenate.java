package CHALLANGES.Challange_no108;

import java.util.List;

public class StringFilterConcatenate {
    public static void main(String[] args) {
        List<String> str = List.of(
                "shubham jha",
                "bad",
                "Bakeer",
                "is studying java",
                "In worst collange",
                "In the world"
        );

        String result = str.stream()
                .filter(s -> s.length() > 10)
                .reduce("", (a, b) -> a + " " + b);

        System.out.println("Concatenated filtered strings:");
        System.out.println(result);
    }
}
