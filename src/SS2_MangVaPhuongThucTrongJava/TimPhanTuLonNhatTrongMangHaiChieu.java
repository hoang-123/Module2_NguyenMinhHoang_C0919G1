package SS2_MangVaPhuongThucTrongJava;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        int[][] array = {
                {2,5,6,1},
                {4,5,10,2},
                {8,2,3,4},
                {7,10,2,3}
        };
        int max = array[0][0];
        int indexRow = 0;
        int indexCol = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                if(array[i][j] > max){
                    max = array[i][j];
                    indexRow = i;
                    indexCol = j;
                }
            }
        }
        System.out.println("Gia tri lon nhat la: " + max + " tai hang " + indexRow + " cot: " + indexCol);
    }
}
