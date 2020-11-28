package lab4;

import java.util.ArrayList;
import java.util.Collection;

class ShapeAccumulator <T extends Shape>
{
    ArrayList<Shape> shapes;
    ShapeAccumulator()
    {
        shapes = new ArrayList<>();
    }
    void Add(T shape)
    {
        shapes.add(shape);
    }
   void AddAll(Collection<T> newShapes)
    {
        shapes.addAll(newShapes);
    }
    Shape getMaxAreaShape() throws ArrayIndexOutOfBoundsException
    {
        Shape maxArea = shapes.get(0);
        for (Shape current : shapes) {
            if (current.calcArea() > maxArea.calcArea())
                maxArea = current;
        }
        return maxArea;
    }
    Shape getMinAreaShape() throws ArrayIndexOutOfBoundsException
    {
        Shape minArea = shapes.get(0);
        for (Shape current : shapes) {
            if (current.calcArea() < minArea.calcArea())
                minArea = current;
        }
        return minArea;
    }
    Shape getMaxPerimeterShape() throws ArrayIndexOutOfBoundsException
    {
        Shape maxPerimeter = shapes.get(0);
        for (Shape current : shapes) {
            if (current.calcArea() > maxPerimeter.calcArea())
                maxPerimeter = current;
        }
        return maxPerimeter;
    }
    Shape getMinPerimeterShape() throws ArrayIndexOutOfBoundsException
    {
        Shape minPerimeter = shapes.get(0);
        for (Shape current : shapes) {
            if (current.calcArea() > minPerimeter.calcArea())
                minPerimeter = current;
        }
        return minPerimeter;
    }
    double getTotalArea()
    {
        double TotalArea = 0;
        for (Shape current : shapes) {
            TotalArea += current.calcArea();
        }
        return TotalArea;
    }
    double getTotalPerimeter()
    {
        double TotalPerimeter = 0;
        for (Shape current : shapes) {
            TotalPerimeter += current.calcPerimeter();
        }
        return TotalPerimeter;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }
}