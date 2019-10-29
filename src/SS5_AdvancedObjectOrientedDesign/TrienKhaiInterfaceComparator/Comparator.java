package SS5_AdvancedObjectOrientedDesign.TrienKhaiInterfaceComparator;

import SS5_AdvancedObjectOrientedDesign.TrienKhaiInterfaceComparator.Circle.Circle;

public interface Comparator extends java.util.Comparator<Circle> {
    @Override
    int compare(Circle c1, Circle c2);

}
