package SS3_LopVaDoiTuongTrongJava.XayDungLopPhuongTrinhBac2;

public class PhuongTrinhBac2 {
    float numA, numB, numC;

    public float getNumA() {
        return numA;
    }
    public float getNumB() {
        return numB;
    }
    public float getNumC() {
        return numC;
    }
    public void setNumA(float numA) {
        this.numA = numA;
    }
    public void setNumB(float numB) {
        this.numB = numB;
    }
    public void setNumC(float numC) {
        this.numC = numC;
    }

    public PhuongTrinhBac2() {
    }

    public double delta() {
        return this.numB*this.numB - 4*this.numA*this.numC;
    }
    public double nghiemX1(){
        return (-this.numB + Math.sqrt(this.delta()))/(2*this.numA);
    }
    public double nghiemX2(){
        return (-this.numB - Math.sqrt(this.delta()))/(2*this.numA);
    }
}
