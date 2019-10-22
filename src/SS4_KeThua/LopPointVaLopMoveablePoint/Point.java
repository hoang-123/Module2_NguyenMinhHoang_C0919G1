package SS4_KeThua.LopPointVaLopMoveablePoint;

import java.util.Arrays;

public class Point {
    private float x = 0f;
    private float y = 0f;

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] array  = {this.x, this.y};
        return array;
    }

    @Override
    public String toString() {
        return "Point{" + Arrays.toString(getXY()) + '}';
    }
}
