package classandobjects;

public class car {
    int noofWheels;
    String color;
    float maxSpeed;
    float currentFuelINLiters;
    int noofSeat;

    public void drive(){
        System.out.println("car is driving");
        currentFuelINLiters--;
    }

    public void addfuel(float fuel){
        currentFuelINLiters += fuel;
    }
    public float getCurrentFuelevel(){
        return currentFuelINLiters;
    }



}
