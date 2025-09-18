package CHALLANGES.Challange_no85;

public class Calculator {

    public int add(int a, int b){
        return a +  b;
    }

    public int add(int a, int b, int c){

        return a + b + c;
    }

    public double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 6));
        System.out.println(calc.add(5, 6, 7));
        System.out.println(calc.add(5.11, 6.11));
    }
}
