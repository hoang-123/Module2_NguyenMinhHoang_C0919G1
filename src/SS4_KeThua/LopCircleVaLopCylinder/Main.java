package SS4_KeThua.LopCircleVaLopCylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle cir = new Circle();
        System.out.println("Nhap ban kinh:");
        double bk = scanner.nextDouble();
        cir.setRadius(bk);
        scanner.nextLine();
        System.out.println("Nhapmau sac:");
        String color = scanner.nextLine();
        cir.setColor(color);
        System.out.println(cir);

        System.out.println("====================");
        Circle cyl = new Cylinder();
        System.out.println("Nhap chieu cao:");
        ((Cylinder)cyl).setHight(scanner.nextDouble());
        System.out.println("Nhap ban kinh:");
        scanner.nextLine();
        ((Cylinder) cyl).setRadius(scanner.nextDouble());
        System.out.println("Nhap mau sac:");
        ((Cylinder) cyl).setColor(scanner.nextLine());
        System.out.println(cyl);

    }
}
