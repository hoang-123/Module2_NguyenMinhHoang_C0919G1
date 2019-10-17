package SS2_MangVaPhuongThucTrongJava;

import java.util.Arrays;
import java.util.Scanner;

public class Mang2Chieu_TinhTongCacSoDuongCheoChinhCuaMaTranVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.println("Nhap phan tu cua hang: "+ i + " cot " + j);
                array[i][j] = scanner.nextInt();
            }  System.out.println(Arrays.toString(array[i]));
        }
    }
}
