package SS2_MangVaPhuongThucTrongJava;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCacSoOMotSoCotXacDinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hang;
        int cot;
        System.out.println("Nhap kich thuoc cua mang:");
        System.out.println("Nhap so hang");
        hang = scanner.nextInt();
        System.out.println("Nhap so cot:");
        cot = scanner.nextInt();
        int[][] array = new int[hang][cot];
        for (int i = 0; i < hang ; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("Nhap phan tu cua hang: "+ i + " cot " + j);
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        int index;
        float tong = 0;
        System.out.println("Ban muon tinh tong cot nao cua mang:");
        index = scanner.nextInt();
        for (int i = 0; i < hang ; i++) {
                tong += array[i][index];
            }
        System.out.println("Tong cot " + index + " la: " + tong);

    }
}
