package CHALLANGES.Chalange_no83;

public class Square extends Shape{

    private final double SideInCms;

    public Square(double sideInCms) {
        this.SideInCms = sideInCms;
    }


    public double getSideInCms() {
        return SideInCms;
    }

    @Override
    public double calculateArea() {
        return Math.pow(SideInCms, 2);
    }
}
