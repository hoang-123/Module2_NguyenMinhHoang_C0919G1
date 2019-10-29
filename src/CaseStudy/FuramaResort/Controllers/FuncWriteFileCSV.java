package CaseStudy.FuramaResort.Controllers;

import CaseStudy.FuramaResort.Commons.*;

import java.util.Scanner;

public class FuncWriteFileCSV<E> {
    Scanner input = new Scanner(System.in);

    public void addVila() {
        Villa villa = new Villa();
        System.out.println("Nhap thuoc tinh Villa");
        System.out.println("Nhap dien tich su dung:");
        villa.setDienTichSd(input.nextFloat());
        System.out.println("Nhap chi phi thue:");
        villa.setChiPhiThue(input.nextFloat());
        System.out.println("Nhap so nguoi thue:");
        villa.setSoNguoi(input.nextInt());
//        System.out.println("Nhap kieu thue");
//        villa.setKieuThue(input.hasNextInt());
        System.out.println("Nhap tieu chuan phong:");
        villa.setTieuChuanPhong(input.nextLine());
        System.out.println("Nhap tien nghi khac:");
        villa.setTienNghiKhac(input.nextLine());
        System.out.println("Nhap so tang:");
        villa.setSoTang(input.nextInt());
        System.out.println("Nhap dien tich ho boi");
        villa.setDienTichHoBoi(input.nextFloat());
    }

    public void addHouse() {
        House house = new House();
        System.out.println("Nhap thuoc tinh House");
        System.out.println("Nhap dien tich su dung:");
        house.setDienTichSd(input.nextFloat());
        System.out.println("Nhap chi phi thue:");
        house.setChiPhiThue(input.nextFloat());
        System.out.println("Nhap so nguoi thue:");
        house.setSoNguoi(input.nextInt());
        System.out.println("Nhap tieu chuan phong:");
        house.setTieuChuanPhong(input.nextLine());
        System.out.println("Nhap tien nghi khac:");
        house.setTienNghiKhac(input.nextLine());
        System.out.println("Nhap so tang:");
        house.setSoTang(input.nextInt());
    }

    public void addRoom() {
        Room room = new Room();
        System.out.println("Nhap thuoc tinh Room");
        System.out.println("Nhap dien tich su dung:");
        room.setDienTichSd(input.nextFloat());
        System.out.println("Nhap chi phi thue:");
        room.setChiPhiThue(input.nextFloat());
        System.out.println("Nhap so nguoi thue:");
        room.setSoNguoi(input.nextInt());
        System.out.println("Dich vu mien phi kem theo:");
        room.setDichVuMienPhi(input.nextLine());
    }
    public void showVilla(){
        House villa = new Villa();
        villa.showInfor();
    }
    public void showHouse(){
        Services house = new House();
        house.showInfor();
    }
    public void showRoom(){
        Services room = new Room();
    }





}

