package CHALLANGES.Chalange_no83;

public class Circle extends Shape{

    private double rediusInCms;

    public Circle(double rediusInCms) {
        this.rediusInCms = rediusInCms;
    }

    public double getRediusInCms() {
        return rediusInCms;
    }


    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(rediusInCms, 2);
    }
}
