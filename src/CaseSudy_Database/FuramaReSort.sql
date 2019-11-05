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
( IDKhachHang INT NOT NULL auto_increment,
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
create table KieuThue
(IDKieuThue varchar(45) not null,
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
create table DichVuDiKem
(IDDichVuDiKem int not null,
TenDichVuDiKem varchar(45) not null,
Gia int,
DoVi int,
TrangThaiKhaDung varchar(45),
primary key(IDDichVuDiKem)
);
CREATE TABLE HopDong
(IDHopDong int not null,
IDNhanVien int,
IDKhachHang int,
IDDichVu int,
NgayLamHopDong date,
NgayKetThuc date,
TienDatCoc int,
TongTien int,
primary key (IDHopDong),
 FOREIGN KEY (IDNhanVien) REFERENCES NhanVien(IDNhanVien),
 FOREIGN KEY (IDKhachHang) REFERENCES KhachHang(IDKhachHang),
 FOREIGN KEY (IDDichVu) REFERENCES DichVu(IDDichVu)
);
create table HopDongChiTiet
(IDHopDongChiTiet int not null,
IDHopDong int not null,
IDDichVuDiKem int not null,
SoLuong int,
primary key(IDHopDongChiTiet),
FOREIGN KEY (IDHopDong) REFERENCES HopDong(IDHopDong),
FOREIGN KEY (IDDichVuDiKem) REFERENCES DichVuDiKem(IDDichVuDiKem)
);



insert into ViTri(IDViTri, TenViTri) value
(001, 'Giam doc'),
(002, 'Truong phong'),
(003, 'Tiep Tan'),
(004, 'Nhan vien'),
(005, 'Dau bep');
insert into TrinhDo(IDTrinhDo, TrinhDo) value
(01, 'Dai hoc'),
(02, 'Cao Dang'),
(03, 'Trung cap');
insert into BoPhan(IDBoPhan, TenBoPhan) value
(1, 'Quan li'),
(2, 'Dichh vu'),
(3, 'Am thuc');



insert into NhanVien(HoTen, IDViTri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMTND, Luong, SDT, Email, DiaChi) value
('Hoang', 002, 01, 1, "1994/02/02", '123456789', '5000000', '123456', 'gmail.com', 'Quang Tri'),
('Hung', 002, 01, 2, "1994/02/02", '123456789', '5000000', '123456', 'gmail.com', 'Quang Nam'),
('Nam', 002, 01, 3, "1994/02/02", '123456789', '5000000', '123456', 'gmail.com', 'Quang Ngai'),
('Duc', 002, 01, 3, "1994/02/02", '123456789', '5000000', '123456', 'gmail.com', 'Quang Binh'),
('Kien', 002, 01, 3, "1994/02/02", '123456789', '5000000', '123456', 'gmail.com', 'Quang Tri'),
('Tung', 002, 01, 3, "1994/02/02", '123456789', '5000000', '123456', 'gmail.com', 'Phu yen'),
('Vuong', 002, 01, 2, "1994/02/02", '123456789', '5000000', '123456', 'gmail.com', 'Nam Dinh'),
('Linh', 002, 01, 1, "1994/02/02", '123456789', '5000000', '123456', 'gmail.com', 'Quang Tri'),
('Nhan', 002, 01, 2, "1994/02/02", '123456789', '5000000', '123456', 'gmail.com', 'Quang Tri'),
('Mai', 002, 01, 2, "1994/02/02", '123456789', '5000000', '123456', 'gmail.com', 'Quang Tri');

select * from nhanvien where (HoTen like 'H%' or HoTen like 'T%' or HoTen like 'K%') and length(HoTen) <= 15 ;

insert into LoaiKhach(IDLoaiKhach, TenLoaiKhach) value
(01, 'Diamond'),
(02, 'Platinium'), 
(03, 'Gold'), 
(04, 'Silver'),
(05, 'Member');
insert into KhachHang(IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) value
(01, 'Hoang', "1995/02/02", '123456789', '123456', 'gmail.com', 'Quang Tri'),
(02,'Hung', "2002/02/02", '123456789',  '123456', 'gmail.com', 'Quang Nam'),
(04,'Nam', "1999/02/02", '123456789', '123456', 'gmail.com', 'Quang Ngai'),
(01,'Duc', "1967/02/02", '123456789', '123456', 'gmail.com', 'Quang Binh'),
(05,'Kien', "1974/02/02", '123456789', '123456', 'gmail.com', 'Quang Tri'),
(02,'Tung', "1988/02/02", '123456789',  '123456', 'gmail.com', 'Phu yen'),
(05,'Vuong',"1965/02/02", '123456789',  '123456', 'gmail.com', 'Nam Dinh'),
(02,'Linh', "1978/02/02", '123456789',  '123456', 'gmail.com', 'Da Nang'),
(01,'Nhan',"1994/02/02", '123456789', '123456', 'gmail.com', 'Da Nang'),
(05,'Mai',"2000/02/02", '123456789', '123456', 'gmail.com', 'Quang Tri');

select*from KhachHang where (year(NgaySinh)<2001 and year(NgaySinh)>1969) and (DiaChi = 'Quang Tri' or DiaChi = 'Da Nang');
select KhachHang.HoTen, count(IDLoaiKhach) 




