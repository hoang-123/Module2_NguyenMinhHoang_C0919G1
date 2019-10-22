package SS4_KeThua.LopCircleVaLopCylinder;

public class Cylinder extends Circle {
    private double hight;

    public Cylinder() {

    }

    public double getHight(double h) {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public Cylinder(double radius, String color, double hight) {
        super(radius, color);
        this.hight = hight;
    }
    public double getVolume(){
        return super.getArea()*this.hight;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "hight=" + hight +
                '}' + "Volume is: " + this.getVolume() + ", which is a subclass of" + super.toString();
    }
}
