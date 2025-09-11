package oops;

public class GetterTest {
    public static void main(String[] args) {

        GetterAndSetter car = new GetterAndSetter("Red", "Maruti", 3, 80000);
        car.Setcolor("Blue");
        System.out.printf("%s %s",car.getColor(), car.getModel() );

    }
}
