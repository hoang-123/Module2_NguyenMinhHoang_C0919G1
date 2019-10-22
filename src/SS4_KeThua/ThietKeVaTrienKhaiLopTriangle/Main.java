package SS4_KeThua.ThietKeVaTrienKhaiLopTriangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape triangle = new Triangle();
        System.out.println("Nhap mau: ");
        triangle.setColor(scanner.nextLine());
        System.out.println("Nhap ok: ");
        triangle.setFilled(scanner.nextBoolean());
        System.out.println("Nhap canh 1: ");
        ((Triangle) triangle).setSide1(scanner.nextDouble());
        System.out.println("Nhap canh 2: ");
        ((Triangle) triangle).setSide2(scanner.nextDouble());
        System.out.println("Nhap canh 3: ");
        ((Triangle) triangle).setSide3(scanner.nextDouble());

        System.out.println(triangle.toString());
    }
}
