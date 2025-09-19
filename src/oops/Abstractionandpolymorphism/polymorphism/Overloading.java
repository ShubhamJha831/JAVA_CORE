package oops.Abstractionandpolymorphism.polymorphism;

public class Overloading {

    public int add (int a, int b){
        return a + b;
    }
    public int add(int a, int b, int c, int d){
        return a + b + c + d;
    }
    public String add(String a, String b, String c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Overloading overload = new Overloading();
        int sum = overload.add(3,4);
        overload.add("a", " ", "b");
        System.out.println(overload.add(5,10));
        System.out.println(overload.add("Shubham", " ", "Jha"));
    }
}
