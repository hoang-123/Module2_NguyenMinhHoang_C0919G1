package SS4_KeThua.LopPoint2DvaLopPoint3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] array  = {getX(),getY(), z};
        return array;
    }

    @Override
    public String toString() {
        return "Point3D{" + "x= " + getX() + " y= "+ getY()+
                "z= " + z + " array:" + Arrays.toString(getXYZ())+
                '}';
    }
}
