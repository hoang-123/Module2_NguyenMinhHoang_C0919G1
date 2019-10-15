public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int n = 2;
        while(n < 100){
            int flag = 0;
            for (int i = 1; i < n; i++){
                if(n % i == 0){
                    flag++;
                }
            }if(flag == 1){
                System.out.println(n);
            }
            n++;
        }
    }
}
