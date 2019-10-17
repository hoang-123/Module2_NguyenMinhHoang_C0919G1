package SS3_LopVaDoiTuongTrongJava.LopHinhChuNhat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        HinhChuNhat HCN = new HinhChuNhat();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        HCN.setWidth(width);
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        HCN.setHeight(height);
        System.out.println("Your Rectangle \n"+ HCN.toString());
        System.out.println("Perimeter of the Rectangle: "+ HCN.getPerimeter());
        System.out.println("Area of the Rectangle: "+ HCN.getArea());
    }
}
