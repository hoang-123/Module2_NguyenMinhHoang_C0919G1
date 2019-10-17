package SS3_LopVaDoiTuongTrongJava.LopHinhChuNhat;

public class HinhChuNhat {
    double width, height;

    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public HinhChuNhat() {
    }
    public HinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String toString() {
        return "LopHinhChuNhat{" + "width=" + width + ", height=" + height + '}';
    }
}
