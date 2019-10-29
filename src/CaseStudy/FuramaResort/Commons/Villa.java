package CaseStudy.FuramaResort.Commons;


public class Villa extends House {
    private float dienTichHoBoi;
    public Villa() {
    }

    public Villa(String nameService, float dienTichSd, float chiPhiThue, float soNguoi, KieuThue kieuThue, String tieuChuanPhong, String tienNghiKhac, int soTang, float dienTichHoBoi, String id) {
        super(nameService, dienTichSd, chiPhiThue, soNguoi, kieuThue, tieuChuanPhong, tienNghiKhac, soTang, id);
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public float getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(float dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    @Override
    public String showInfor() {
        return  "Villa: " +
                "\nDien tich su dung: "+ super.getDienTichSd()+
                "\nChi phi thue: "+ super.getChiPhiThue()+
                "\nSo nguoi thue toi da: "+ super.getSoNguoi()+
                "\nKieu thue: "+ super.getKieuThue()+
                "\nTieu chuan phong: " + super.getTieuChuanPhong()+
                "\nTien nghi khac: " + this.getTienNghiKhac()+
                "\nSo tang: " + this.getSoTang()+
                "\nDien tich ho boi: " + this.dienTichHoBoi;
    }
}
