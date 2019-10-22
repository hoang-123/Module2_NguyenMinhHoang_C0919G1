package SS4_KeThua.HeCacDoiTuongHinhHoc;

public class Main {
    public static void main(String[] args) {
        HeHinhHoc hhh = new HeHinhHoc();
        System.out.println(hhh);
        hhh = new HeHinhHoc("red", false);
        System.out.println(hhh);

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo", false, 3.5);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);



    }
}
