package SS1_NgonNguLapTrinhJava;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int count = 0;
        int n = 2;
        while(count < 20){
            int flag = 0;
            for (int i = 1; i < n; i++){
                if(n % i == 0){
                    flag++;
                }
            }if(flag == 1){
                System.out.println(n);
                count ++;
            }
            n++;
        }
    }
}
