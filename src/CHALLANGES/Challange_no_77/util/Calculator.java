package CHALLANGES.Challange_no_77.util;

import CHALLANGES.Challange_no_77.geometry.Circle;
import CHALLANGES.Challange_no_77.geometry.Rectangle;

public class Calculator {

    public static void main(String[] args) {

        Circle cir = new Circle(5.5);

        Rectangle rect = new Rectangle(10, 5);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double  rectArea = rect.breadth * rect.length;

        System.out.printf("Area of the circle is: %s, area of the rectangle is: %s", cirArea, rectArea);

    }

}
