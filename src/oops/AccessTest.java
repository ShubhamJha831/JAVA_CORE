package oops;

public class AccessTest {
    public static void main(String[] args) {
        AccessModifier car = new AccessModifier();
        car.color = "Red";
        car.model = "Swift";

        System.out.println(car);

        AccessModifier newcar = new AccessModifier("Black", "BMW", 1 , 20000);

        System.out.println(newcar);
    }
}
