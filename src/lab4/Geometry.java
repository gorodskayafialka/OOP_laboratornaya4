package lab4;

class Circle implements Shape {
    private double Radius;
    Circle(double Radius) throws IllegalArgumentException{
        if (Radius <= 0) throw new IllegalArgumentException("Radius should be positive");
        this.Radius = Radius;
    }

    @java.lang.Override
    public double calcArea() {
        return 3.14 * Math.pow(Radius, 2);
    }

    @java.lang.Override
    public double calcPerimeter() {
        return 2 * 3.14 * Radius;
    }

    @Override
    public String toString() {
        String Info = "Circle (" + Radius + ")";
        return Info;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }
}

class Triangle implements Shape {
    private double A, B, C;
    Triangle(double A, double B, double C) throws IllegalArgumentException {
        if ((A <= 0)||(B <= 0)||(C <= 0))
            throw new IllegalArgumentException("Triangle's sides should be positive");
        this.A = A;
        this.B = B;
        this.C = C;
    }

    @java.lang.Override
    public double calcArea() {
        double AB, BC, AC;
        double p = calcPerimeter()/2;
        return Math.pow((p*(p-A)*(p-B)*(p-C)),0.5);
    }

    @java.lang.Override
    public double calcPerimeter() {
        return A+B+C;
    }

    @Override
    public String toString() {
        return "Triangle (" + A + ", " + B + " и " + C + ")";
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    public double getC() {
        return C;
    }

    public void setC(double c) {
        C = c;
    }
}

class Rectangle implements Shape
{
    private double A, B;
    Rectangle(double A, double B) throws IllegalArgumentException
    {
        if ((A <= 0)||(B <= 0))
            throw new IllegalArgumentException("Rectangle's sides should be positive");
        this.A = A;
        this.B = B;
    }

    @java.lang.Override
    public double calcArea() {
        return A * B;
    }

    @java.lang.Override
    public double calcPerimeter() {
        return 2 * (A + B);
    }

    @Override
    public String toString() {
        return "Rectangle (" + A +"x" + B + ")";
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }
}

class Square implements Shape
{
    private double A;

    Square(double A) throws IllegalArgumentException
    {
        if (A <= 0)
            throw new IllegalArgumentException("Square's side should be positive");
        this.A = A;
    }

    @Override
    public double calcArea() {
        return A * A;
    }

    @Override
    public double calcPerimeter() {
        return 4 * A;
    }

    @Override
    public String toString() {
        return "Square (" + A + ")" ;
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }
}
