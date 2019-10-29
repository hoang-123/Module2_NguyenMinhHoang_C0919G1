package CaseStudy.FuramaResort.Commons;

public class House extends Services {
    private String tieuChuanPhong;
    private String tienNghiKhac;
    private int soTang;

    public House() {
    }


    public House(String nameService, float dienTichSd, float chiPhiThue, float soNguoi, KieuThue kieuThue, String tieuChuanPhong, String tienNghiKhac, int soTang, String id) {
        super(nameService, dienTichSd, chiPhiThue, soNguoi, kieuThue, id);
        this.tieuChuanPhong = tieuChuanPhong;
        this.tienNghiKhac = tienNghiKhac;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getTienNghiKhac() {
        return tienNghiKhac;
    }

    public void setTienNghiKhac(String tienNghiKhac) {
        this.tienNghiKhac = tienNghiKhac;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String showInfor() {
        return  "House: " +
                "\nDien tich su dung: "+ super.getDienTichSd()+
                "\nChi phi thue: "+ super.getChiPhiThue()+
                "\nSo nguoi thue toi da: "+ super.getSoNguoi()+
                "\nKieu thue: "+ super.getKieuThue()+
                "\nTieu chuan phong: " + this.tieuChuanPhong  +
                "\nTien nghi khac: " + this.tienNghiKhac +
                "\nSo tang: " + this.soTang;
    }

}
