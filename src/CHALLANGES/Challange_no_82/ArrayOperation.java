package CHALLANGES.Challange_no_82;

public class ArrayOperation {
    private int[] numbers;

    public ArrayOperation(int[] numbers) {
        this.numbers = numbers;
    }

    public class Statistics {
        double mean() {
            long sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return (double) sum / numbers.length;
        }
    }
}
