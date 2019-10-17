package SS2_MangVaPhuongThucTrongJava;
import java.util.Arrays;
import java.util.Scanner;
public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter size of array: ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        }while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int min = array[0];
        for (int j = 1; j < array.length ; j++) {
            if(array[j] < min){
                min = array[j];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Gia tri nho nhat trong mang: " + min);
    }
}
