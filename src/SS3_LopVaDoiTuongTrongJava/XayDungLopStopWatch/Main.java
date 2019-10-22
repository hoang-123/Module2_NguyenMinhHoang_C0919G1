package SS3_LopVaDoiTuongTrongJava.XayDungLopStopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        Mang array = new Mang();
        time.start();
        array.createRandom();
        time.stop();
        System.out.println("\n" + time.getElapsedTime());

    }

}
