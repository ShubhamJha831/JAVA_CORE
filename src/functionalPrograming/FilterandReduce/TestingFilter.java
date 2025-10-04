package functionalPrograming.FilterandReduce;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "Banana", "Cherry");

        System.out.println(fruits.size());
        System.out.println("Printing fruits normally:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Printing fruits using streams:");

        // Using an anonymous Consumer class
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });

        // Using a lambda expression
        System.out.println("printing fruits using filter");
        fruits.stream()
                .filter(Fruits -> Fruits.endsWith("e"))
                .forEach(fruit -> System.out.println(fruit));


    }
}
