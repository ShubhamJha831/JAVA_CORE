package classandobjects;

public class driver {
    public static void main(String[] args) {
        car mycar = new car();
        mycar.addfuel(3);
        mycar.drive();
        System.out.println(mycar.currentFuelINLiters);
    }
}
//we can also use this is return statement at time when it change by it my own object