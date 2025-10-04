package functionalPrograming.Lamda;

public class TestingLambda {
    public static void main(String[] args) {
        TestingLambda Test = new TestingLambda();
        int sum = Test.sum(6, 7);
        Test.printString("this is the place where i code usually");

       //  toPrint -> System.out.println(toPrint);
    }
    public void printString(String toPrint){
        System.out.println(toPrint);
    }
    public int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
}
