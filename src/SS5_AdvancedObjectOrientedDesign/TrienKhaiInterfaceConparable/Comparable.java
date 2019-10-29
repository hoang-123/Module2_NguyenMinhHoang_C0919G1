package SS5_AdvancedObjectOrientedDesign.TrienKhaiInterfaceConparable;

import SS5_AdvancedObjectOrientedDesign.TrienKhaiInterfaceComparator.Circle.Circle;

public interface Comparable<C extends Circle> extends java.lang.Comparable<ComparableCircle> {
   int compareTo(ComparableCircle c1);
}
