package Abstractionandpolymorphism.polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();
        //Vehicle v = new Vehicle();

       // castTest(v);
        castTest(c);
       // Vehicle vCar = new Car();
        //Car cVehicle = (Car) new Vehicle();

    }
    private static void castTest(Vehicle veh){
        veh.start();

        //Car cVehicle = (Car) veh;
        //veh.start();
        //cVehicle.noOfDoors();
    }

}
