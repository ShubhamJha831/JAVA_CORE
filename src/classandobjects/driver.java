package classandobjects;

public class driver {
    int noofWheels;
    String color;
    float maxSpeed;
    float currentFuelINLiters;
    int noofSeat;

    public void carisdriving(){
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
