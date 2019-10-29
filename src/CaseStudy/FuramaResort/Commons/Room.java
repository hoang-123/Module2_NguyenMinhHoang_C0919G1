package CaseStudy.FuramaResort.Commons;

public class Room extends Services {
    private String dichVuMienPhi;

    public Room() {
    }

    public Room(String nameService, float dienTichSd, float chiPhiThue, float soNguoi, KieuThue kieuThue, String dichVuMienPhi, String id) {
        super(nameService, dienTichSd, chiPhiThue, soNguoi, kieuThue, id);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }
    @Override
    public String showInfor() {
        return  "Room: " +
                "\nDien tich su dung: "+ super.getDienTichSd()+
                "\nChi phi thue: "+ super.getChiPhiThue()+
                "\nSo nguoi thue toi da: "+ super.getSoNguoi()+
                "\nKieu thue: "+ super.getKieuThue()+
                "\nDich vu mien phi: " + this.dichVuMienPhi;
    }
    
}
