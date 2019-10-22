package SS4_KeThua.LopPointVaLopMoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(4, 5);
        System.out.println(point.toString());
        Point moveP = new MovablePoint(2,2,4,4);

        System.out.println(moveP.toString());
        moveP = ((MovablePoint) moveP).move();
        System.out.println(moveP.toString());

    }
}
