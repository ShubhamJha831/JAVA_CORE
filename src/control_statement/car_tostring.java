package control_statement;

public class car_tostring {
    int getNoOfWeels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modalNumber;
    String company;

    public car_tostring(int getNoOfWeels, int noOfDoors, int maxSpeed, String name, String modalNumber, String company) {
        this.getNoOfWeels = getNoOfWeels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modalNumber = modalNumber;
        this.company = company;
    }

    @Override
    public String toString() {
        return "car{" +
                "getNoOfWeels=" + getNoOfWeels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modalNumber='" + modalNumber + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public static void main(String[] args) {
        car_tostring swift = new car_tostring(4, 4, 120, "swift", "Sw876", "Maruti");

        System.out.println(swift);
    }
}
