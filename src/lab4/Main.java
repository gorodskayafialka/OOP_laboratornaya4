package lab4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args)
    {
        ShapeAccumulator sa = new ShapeAccumulator();
        sa.Add(new Triangle(22,33,50));
        sa.Add(new Rectangle(22,110));
        ArrayList<Square> s = new ArrayList<>();
        LinkedList<Circle> c = new LinkedList<>();
        c.add(new Circle(0.5));
        c.add(new Circle(0.8));
        c.add(new Circle(0.9));
        ArrayList<Shape> sh = new ArrayList<>();
        sh.add(new Circle(12));
        s.add(new Square(10));
        s.add(new Square(20));
        s.add(new Square(30));
        sh.addAll(s);
        sa.AddAll(s);
        sa.AddAll(c);
        System.out.println("Figures: " + sa.getShapes());
        System.out.println("Max Area: " +sa.getMaxAreaShape());
        System.out.println("Min Area: " +sa.getMinAreaShape());
        System.out.println("Max Perimeter: " +sa.getMaxPerimeterShape());
        System.out.println("Min Perimeter: " +sa.getMinPerimeterShape());
        System.out.println("Total Area: " +sa.getTotalArea());
        System.out.println("Total Perimeter: " +sa.getTotalPerimeter());

    }
}
