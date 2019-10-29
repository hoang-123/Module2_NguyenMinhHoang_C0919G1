package CaseStudy.FuramaResort.Commons;

public class DichVuDiKem {
    private String nameService;
    private int donVi;
    private float giaTien;

    public DichVuDiKem() {
    }

    public DichVuDiKem(String nameService, int donVi, float giaTien) {
        this.nameService = nameService;
        this.donVi = donVi;
        this.giaTien = giaTien;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getDonVi() {
        return donVi;
    }

    public void setDonVi(int donVi) {
        this.donVi = donVi;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }
}
