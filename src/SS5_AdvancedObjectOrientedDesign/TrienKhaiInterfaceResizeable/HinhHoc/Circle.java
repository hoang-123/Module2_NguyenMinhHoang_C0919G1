package SS5_AdvancedObjectOrientedDesign.TrienKhaiInterfaceResizeable.HinhHoc;
import SS5_AdvancedObjectOrientedDesign.TrienKhaiInterfaceResizeable.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius() + "Area: " + this.getArea()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("Area - after: tang " + percent + "phan tram" + this.getArea()+ this.getArea()*percent/100) ;
    }
}
