package SS2_MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKiTuTrongChuoi {
    public static void main(String[] args) {
        String str = "nguyen minh hoang";
        int count = 0;
        char x;
        String c = "nguyen minh hoang";
        if (str.equals(c)==true){
            System.out.println("true");
        }else System.out.println("false");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 1 ki tu:");
        x = scanner.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == x){
                count ++;
            }
        }
        System.out.println("So lan xuat hien cua ki tu " + x + " la: " + count );
    }
}
