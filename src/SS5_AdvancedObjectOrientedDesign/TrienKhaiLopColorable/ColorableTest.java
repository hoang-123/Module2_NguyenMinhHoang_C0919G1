package SS5_AdvancedObjectOrientedDesign.TrienKhaiLopColorable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);


        for (Shape shape: shapes) {
            System.out.println(shape);
            if( shape instanceof Colorable){
                ((Colorable) shape).howToColor();
            }
        }

    }
}
