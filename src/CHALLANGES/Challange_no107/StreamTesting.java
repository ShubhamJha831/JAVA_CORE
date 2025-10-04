package CHALLANGES.Challange_no107;

import java.util.List;

public class StreamTesting {
    public static void main(String[] args) {
        List<String> names = List.of("Shubham", "Jha", "Anita");

        // Using stream with lambda
        names.stream()
                .forEach(name -> System.out.println(name));
    }
}
