package CHALLANGES;

import java.util.Scanner;

class Circle {
    double radiusInMm;
    Circle(double radiusInMm){
        this.radiusInMm = radiusInMm;
    }

    double getCircumference(){
        return 2 * radiusInMm * Math.PI;
    }
    double getArea(){
        return Math.PI * Math.pow(radiusInMm, 2);
    }

    @Override
    public String toString() {
        return "Circle props: Radius in mm:"+ radiusInMm +
                " , Circumference in mm: "+ getCircumference() +
                ", Area in mm2: "+ getArea();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world or circle\n");
        System.out.println("PLease Enter your radius: ");
        double radius = input.nextDouble();
        Circle Circle = new Circle(radius);
        System.out.println(Circle);
    }
}
