package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Shape> myShape = new ArrayList<>();
        myShape.add(new Rectangle(3.0, 2.0));
        myShape.add(new Circle(2.0));

        List<Circle> myCircle = new ArrayList<>();
        myCircle.add(new Circle(2.0));
        myCircle.add(new Circle(3.0));

        // System.out.println("Total area: "+ totalArea(myShape));
        System.out.println("Total area: "+ totalArea(myCircle));
    }

    private static Double totalArea(List<? extends Shape> list) { // Essa Lista pode ser de Shape ou qualquer outro subtipo
        double sum = 0.0;
        for(Shape s: list){
            sum += s.area();
        }
        return sum;
    }
}
