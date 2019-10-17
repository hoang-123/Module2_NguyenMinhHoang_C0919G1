package SS2_MangVaPhuongThucTrongJava;
import java.util.Arrays;
import java.util.Scanner;
public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array = {5, 4, 6, 7, 1, 2, 8};
        int[] array2 = new int[0];
        int xoa;
        int indexXoa = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu can xoa: ");
        xoa = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == xoa){
                indexXoa = i;
                count ++;
                array2 = new int[array.length - 1];
                for (int j = 0; j < indexXoa ; j++) {
                    array2[j] = array[j];
                }
                for (int j = indexXoa; j < array2.length ; j++) {
                    array2[j] = array[j + 1];
                }
            }
        }
        if(count == 0){
            System.out.println("Khong co phan tu can xoa");
        }
        System.out.println(Arrays.toString(array2));
    }
}
