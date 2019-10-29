package CaseStudy.FuramaResort.Commons;

public class Services {
    private String nameService;
    private float dienTichSd;
    private float chiPhiThue;
    private float soNguoi;
    private KieuThue kieuThue;
    private String id;

    public Services() {
    }

    public Services(String nameService, float dienTichSd, float chiPhiThue, float soNguoi, KieuThue kieuThue, String id) {
        this.nameService = nameService;
        this.dienTichSd = dienTichSd;
        this.chiPhiThue = chiPhiThue;
        this.soNguoi = soNguoi;
        this.kieuThue = kieuThue;
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public float getDienTichSd() {
        return dienTichSd;
    }

    public void setDienTichSd(float dienTichSd) {
        this.dienTichSd = dienTichSd;
    }

    public float getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(float chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public float getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(float soNguoi) {
        this.soNguoi = soNguoi;
    }

    public KieuThue getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(KieuThue kieuThue) {
        this.kieuThue = kieuThue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String showInfor() {
        return "Services:" +
                "\nTen dich vu: " + nameService  +
                "\nDien tich su dung: " + dienTichSd +
                "\nChi Phi Thue: " + chiPhiThue +
                "\nSo nguoi thue toi da: " + soNguoi +
                "\nKieu thue: " + kieuThue;
    }
}

