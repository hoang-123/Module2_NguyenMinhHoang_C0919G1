package SS5_AdvancedObjectOrientedDesign.TrienKhaiInterfaceComparator.Shape;

import SS5_AdvancedObjectOrientedDesign.TrienKhaiInterfaceComparator.Shape.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
