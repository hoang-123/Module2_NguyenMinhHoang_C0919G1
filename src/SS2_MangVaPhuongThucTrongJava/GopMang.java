package SS2_MangVaPhuongThucTrongJava;
import java.util.Arrays;
import java.util.Scanner;
public class GopMang {
    public static void main(String[] args) {
       int[] array1 = new int[4];
       int[] array2 = new int[4];
       Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mang 1: ");
        for (int i = 0; i < array1.length ; i++) {
            System.out.println("Enter element " + (i+1) + " :");
            array1[i] = scanner.nextInt();
        }
        System.out.println("Nhap mang 2: ");
        for (int j = 0; j < array1.length ; j++) {
            System.out.println("Enter element " + (j+1) + " :");
            array2[j] = scanner.nextInt();
        }
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length ; i++) {
            array3[array2.length + i] = array2[i];
        }
        System.out.println("Mang 1: " + Arrays.toString(array1));
        System.out.println("Mang 2: " + Arrays.toString(array2));
        System.out.println("Mang 3: " + Arrays.toString(array3));
    }
}
