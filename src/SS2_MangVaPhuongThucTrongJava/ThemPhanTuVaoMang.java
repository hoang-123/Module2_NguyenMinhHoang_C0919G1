package SS2_MangVaPhuongThucTrongJava;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 5, 4, 1, 2, 1, 5};
        int[] array2 = new int[array.length + 1];
        int x, index;
        System.out.println("Nhap so X can chen: ");
        x = scanner.nextInt();
        System.out.println("Nhap vi tri can chen: ");
        index = scanner.nextInt();
        if(index < 0 || index > array.length){
            System.out.println("Khong the chen vao mang: ");
        }else {
        array2[index] = x;
        for (int i = 0; i < index ; i++) {
            array2[i] = array[i];
        }
        for (int j = (index + 1); j < array2.length; j++) {
            array2[j] = array[j - 1];
        }
        System.out.print(Arrays.toString(array2));
        }
    }
}
