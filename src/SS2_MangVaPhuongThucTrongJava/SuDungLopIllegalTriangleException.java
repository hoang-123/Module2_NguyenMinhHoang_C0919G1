package SS2_MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class SuDungLopIllegalTriangleException {
    public static boolean check(){

     return true;
    }
    public static void main(String[] args) {

        try{Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap canh thu 1 cua tam giac: ");
            double canhA = scanner.nextDouble();
            System.out.println("Nhap canh thu 2 cua tam giac: ");
            double canhB = scanner.nextDouble();
            System.out.println("Nhap canh thu 3 cua tam giac: ");
            double canhC = scanner.nextDouble();

        }catch (IllegalThreadStateException e){
            System.err.println("Day khong phai la 3 canh cua tam giac");
        }
    }
}
