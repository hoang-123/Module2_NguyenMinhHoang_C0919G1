package SS5_AdvancedObjectOrientedDesign.TrienKhaiInterfaceResizeable;

import SS5_AdvancedObjectOrientedDesign.TrienKhaiInterfaceResizeable.HinhHoc.Circle;
import SS5_AdvancedObjectOrientedDesign.TrienKhaiInterfaceResizeable.HinhHoc.Rectangle;
import SS5_AdvancedObjectOrientedDesign.TrienKhaiInterfaceResizeable.HinhHoc.Shape;
import SS5_AdvancedObjectOrientedDesign.TrienKhaiInterfaceResizeable.HinhHoc.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(5,4);
        shapes[2] = new Square(7);
        for (Shape element: shapes) {
            System.out.println(element.toString());
        }
        for (Shape element: shapes) {
            if (element instanceof Circle){
                ((Circle)element).resize(Math.random()*100+1);
            }
        }



    }
}
