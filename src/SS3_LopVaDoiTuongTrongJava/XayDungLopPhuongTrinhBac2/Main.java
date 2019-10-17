package SS3_LopVaDoiTuongTrongJava.XayDungLopPhuongTrinhBac2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhuongTrinhBac2 ptr2 = new PhuongTrinhBac2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        float numA = scanner.nextFloat();
        ptr2.setNumA(numA);
        System.out.println("Nhap so b: ");
        float numB = scanner.nextFloat();
        ptr2.setNumB(numB);
        System.out.println("Nhap so c: ");
        float numC = scanner.nextFloat();
        ptr2.setNumC(numC);
        if(numA == 0){
            System.out.println("Phuong trinh co 1 nghiem: X= " + (-ptr2.numC/ptr2.numB));
        }else {
            if (ptr2.delta() < 0) {
                System.out.println("Phuong trinh Vo Nghiem:");
            }
            if (ptr2.delta() == 0) {
                System.out.println("Phuong trinh co nghiem kep X= " + ptr2.nghiemX1());
            }
            if (ptr2.delta() > 0) {
                System.out.println("Phuong trinh co 2 nghiem X1= " + ptr2.nghiemX1() + "\nX2= " + ptr2.nghiemX2());
            }
        }
    }
}
