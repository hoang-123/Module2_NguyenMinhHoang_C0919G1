package SS3_LopVaDoiTuongTrongJava.XayDungLopFan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean setOn() {
        return on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    @Override
    public String toString() {
        return (setOn() ? "Fan{" + "speed=" + speed + ", radius=" + radius + ", color='" + color + '\'' + '}' + " Fan is on"
       : "Fan{" + "speed=" + speed + ", radius=" + radius + ", color='" + color + '\'' + '}'+ " Fan is off");

    }
}

