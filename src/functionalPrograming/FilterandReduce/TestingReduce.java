package functionalPrograming.FilterandReduce;
import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> number =  List.of(1,3,5,8,5,5,5,158);
        int sum = 0;
        for (Integer numbers : number){
            sum += numbers;
        }
        System.out.println(sum);

        int newSum = number.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }
                });
        System.out.printf("\n sum using reduce is %d: ", newSum);

        int newSum2 = number.stream()
                .reduce(0,(a, b) -> a + b);
        System.out.printf("\n sum using reduce is %d: ", newSum);

        int Max = number.stream()
                .reduce(Integer.MIN_VALUE,(a, b) -> a > b ? a : b);
        System.out.printf("\nmax using reduce is %d: ", Max);
    }
}
