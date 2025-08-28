package classandobjects;

public class car {
    int noofWheels;
    String color;
    float maxSpeed;
    float currentFuelINLiters;
    int noofSeat;

    public void drive(){
        if (currentFuelINLiters == 0){
            System.out.println("car is out of fuel");

        } else if (currentFuelINLiters < 5){
            System.out.println("car is iin reserve mode, please refule");
        }else {
        System.out.println("car is driving");
        currentFuelINLiters--;

        }
    }

    public void addfuel(float currentFuelINLiters){
        this.currentFuelINLiters += currentFuelINLiters;
    }
    public float getCurrentFuelevel(){
        return currentFuelINLiters;
    }



}
