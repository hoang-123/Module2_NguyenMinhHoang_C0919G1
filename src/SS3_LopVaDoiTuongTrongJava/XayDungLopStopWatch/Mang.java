package SS3_LopVaDoiTuongTrongJava.XayDungLopStopWatch;

import java.util.Random;

public class Mang {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100000];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }
}
