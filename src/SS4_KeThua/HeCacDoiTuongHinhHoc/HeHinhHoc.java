package SS4_KeThua.HeCacDoiTuongHinhHoc;

public class HeHinhHoc {
    private String color;
    private boolean filled;

    public HeHinhHoc() {
        this.color = "Green";
        this.filled = true;
    }

    public HeHinhHoc(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}
