drop database if exists Furama_Resort;
create database Furama_Resort;
use Furama_Resort;
create table ViTri
(IDViTri int,
TenViTri varchar(45) not null,
primary key(IDViTri)
);
create table TrinhDo
(IDTrinhDo int,
TrinhDo varchar(45),
primary key(IDTrinhDo)
);
create table BoPhan
(IDBoPhan int,
TenBoPhan varchar(45),
primary key(IDBoPhan)
);
CREATE TABLE NhanVien
( IDNhanVien INT NOT NULL AUTO_INCREMENT,
  HoTen VARCHAR(45) NOT NULL,
  IDViTri int,
  IDTrinhDo int,
  IDBoPhan int,
  NgaySinh DATE,
  SoCMTND varchar(45),
  Luong varchar(45),
  SDT varchar(45),
  Email varchar(45),
  DiaChi varchar(45),
  CONSTRAINT NhanVien_pk PRIMARY KEY (IDNhanVien),
  FOREIGN KEY (IDViTri) REFERENCES ViTri(IDViTri),
  FOREIGN KEY (IDTrinhDo) REFERENCES TrinhDo(IDTrinhDo),
  FOREIGN KEY (IDBoPhan) REFERENCES BoPhan(IDBoPhan)
);
create table LoaiKhach
(IDLoaiKhach int not null,
TenLoaiKhach varchar(45),
primary key(IDLoaiKhach)
);
CREATE TABLE KhachHang
( IDKhachHang INT NOT NULL,
  IDLoaiKhach INT,
  HoTen VARCHAR(45) NOT NULL,
  NgaySinh DATE,
  SoCMTND varchar(45),
  SDT varchar(45),
  Email varchar(45),
  DiaChi varchar(45),
  CONSTRAINT KhachHang_pk PRIMARY KEY (IDKhachHang),
  FOREIGN KEY (IDLoaiKhach) REFERENCES LoaiKhach(IDLoaiKhach)
);
create table DichVuDiKem
(IDDichVuDiKem int not null,
TenDichVuDiKem varchar(45) not null,
Gia int,
DoVi int,
TrangThaiKhaDung varchar(45),
primary key(IDDichVuDiKem)
);
create table HopDongChiTiet
(IDHopDongChiTiet int not null,
IDHopDong int not null,
IDDichVuDiKem int not null,
SoLuong int,
primary key(IDHopDongChiTiet),
FOREIGN KEY (IDDichVuDiKem) REFERENCES DichVuDiKem(IDDichVuDiKem)
);
CREATE TABLE HopDong
(IDHopDong int not null,
IDNhanVien int not null,
IDKhachHang int not null,
IDDichVu int,
NgayLamHopDong date,
NgayKetThuc date,
TienDatCoc int,
TongTien int,
constraint HopDong_pk primary key (IDHopDong),
FOREIGN KEY (IDHopDong) REFERENCES HopDongChiTiet(IDHopDong)
);
create table KieuThue
(IDKieuThue int not null,
TenKieuThue varchar(45),
Gia int,
primary key(IDKieuThue)
);
create table LoaiDichVu
(IDLoaiDichVu int not null,
TenDichVu varchar(45),
primary key(IDLoaiDichVu)
);
CREATE TABLE DichVu
(IDDichVu int not null,
TenDichVu varchar(45),
DienTich int,
SoTang int,
SoNguoiToiDa varchar(45),
ChiPhiThue varchar(45),
IDKieuThue varchar(45),
IDLoaiDichVu int,
TrangThai varchar(45),
constraint DichVu_pk primary key (IDDichVu),
foreign key (IDKieuThue) references KieuThue(IDKieuThue),
foreign key (IDLoaiDichVu) references LoaiDichVu(IDLoaiDichVu)
);






