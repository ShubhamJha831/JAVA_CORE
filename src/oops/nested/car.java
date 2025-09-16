package oops.nested;

public class car {
    private int noOfDoors;

    public void Repair(){

        Tire t = new Tire();
    }

    protected class Tire{

        private double width;

        private double pressure;

        private String material;

        public void inflate(){

            noOfDoors = 4;
        }
    }
}
