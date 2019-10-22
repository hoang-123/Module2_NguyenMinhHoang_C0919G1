package SS4_KeThua.LopPointVaLopMoveablePoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed = 0f;
    private float ySpeed = 0f;

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MovablePoint(){

    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] array  = {this.xSpeed, this.ySpeed};
        return array;
    }

    @Override
    public String toString() {
        return super.toString() + " speed = " + Arrays.toString(getSpeed());
    }
    public MovablePoint move(){
        float x = getX();
        float y = getY();
        x += this.xSpeed;
        y += this.ySpeed;
        setY(y);
        setX(x);
        return this;
    }

}
