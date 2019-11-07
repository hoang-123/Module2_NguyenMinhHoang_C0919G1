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
( IDNhanVien INT NOT NULL,
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
create table KieuThue
(IDKieuThue int not null,
TenKieuThue varchar(45),
Gia int,
primary key(IDKieuThue)
);
create table LoaiDichVu
(IDLoaiDichVu int not null,
TenLoaiDichVu varchar(45),
primary key(IDLoaiDichVu)
);
CREATE TABLE DichVu
(IDDichVu int not null,
TenDichVu varchar(45),
DienTich int,
SoTang int,
SoNguoiToiDa varchar(45),
ChiPhiThue varchar(45),
IDKieuThue int,
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
DonVi int,
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
insert into NhanVien(IDNhanVien, HoTen, IDViTri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMTND, Luong, SDT, Email, DiaChi) value
(11,'Hoang', 002, 01, 1, "1994/02/02", '123456789', '5000000', '123456', 'gmail.com', 'Quang Tri'),
(12,'Hung', 002, 01, 2, "1994/02/02", '123456789', '5000000', '123456', 'gmail.com', 'Quang Nam'),
(13,'Nam', 002, 01, 3, "1994/02/02", '123456789', '5000000', '123456', 'gmail.com', 'Quang Ngai'),
(14,'Duc', 002, 01, 3, "1994/02/02", '123456789', '5000000', '123456', 'gmail.com', 'Quang Binh'),
(15,'Kien', 002, 01, 3, "1994/02/02", '123456789', '5000000', '123456', 'gmail.com', 'Quang Tri'),
(16,'Tung', 002, 01, 3, "1994/02/02", '123456789', '5000000', '123456', 'gmail.com', 'Phu yen'),
(17,'Vuong', 002, 01, 2, "1994/02/02", '123456789', '5000000', '123456', 'gmail.com', 'Nam Dinh'),
(18,'Linh', 002, 01, 1, "1994/02/02", '123456789', '5000000', '123456', 'gmail.com', 'Quang Tri'),
(19,'Nhan', 002, 01, 2, "1994/02/02", '123456789', '5000000', '123456', 'gmail.com', 'Quang Tri'),
(20,'Mai', 002, 01, 2, "1994/02/02", '123456789', '5000000', '123456', 'gmail.com', 'Quang Tri');
insert into LoaiKhach(IDLoaiKhach, TenLoaiKhach) value
(01, 'Diamond'),
(02, 'Platinium'), 
(03, 'Gold'), 
(04, 'Silver'),
(05, 'Member');
insert into KhachHang(IDKhachHang ,IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) value
(011, 01, 'Hoang', "1995/02/02", '123456789', '123456', 'gmail.com', 'Quang Tri'),
(012, 02, 'Hung', "2002/02/02", '123456789',  '123456', 'gmail.com', 'Quang Nam'),
(013, 04, 'Nam', "1999/02/02", '123456789', '123456', 'gmail.com', 'Quang Ngai'),
(014, 01, 'Duc', "1967/02/02", '123456789', '123456', 'gmail.com', 'Quang Binh'),
(015, 01, 'Kien', "1974/02/02", '123456789', '123456', 'gmail.com', 'Quang Tri'),
(016, 02, 'Tung', "1988/02/02", '123456789',  '123456', 'gmail.com', 'Phu yen'),
(017, 05, 'Vuong',"1965/02/02", '123456789',  '123456', 'gmail.com', 'Nam Dinh'),
(018, 02, 'Linh', "1978/02/02", '123456789',  '123456', 'gmail.com', 'Da Nang'),
(019, 01, 'Nhan',"1994/02/02", '123456789', '123456', 'gmail.com', 'Da Nang'),
(020, 05, 'Mai',"2000/02/02", '123456789', '123456', 'gmail.com', 'Quang Tri');
insert into LoaiDichVu(IDLoaiDichVu, TenLoaiDichVu) value
(01, 'Villa'),
(02, 'House'),
(03, 'Room');
insert into KieuThue(IDKieuThue, TenKieuThue, Gia) value
(1, 'Theo ngay', 500),
(2, 'Theo gio', 50);
insert into DichVu(IDDichVu, TenDichVu, DienTich, SoTang, SoNguoiToiDa, ChiPhiThue, IDKieuThue, IDLoaiDichVu, TrangThai) value
(001, 'Villa', 25, 3, '15', 'max', 1, 01, 'good'),
(002, 'House', 30, 3, '20', 'Min', 2, 02, 'TB'),
(003, 'Room', 30, 3, '20', 'Min', 2, 02, 'TB');
insert into DichVuDiKem(IDDichVuDiKem, TenDichVuDikem, Gia, DonVi, TrangThaiKhaDung) value
(01, 'Massage', 300, 20, 'ok'),
(02, 'Bar', 500, 20, 'ok');
insert into HopDong(IDHopDong, IDNhanVien, IDKhachHang, IDDichVu, NgayLamHopDong, NgayKetThuc, TienDatCoc, TongTien) value
(011, 11, 012, 01, '2018/01/02', '2019/12/25', 500, 100000),
(012, 12, 012, 02, '2019/10/02', '2019/10/11', 500, 100000),
(013, 13, 015, 03, '2019/11/02', '2019/04/11', 500, 200000),
(014, 14, 011, 02, '2018/03/02', '2019/02/11', 500, 200000);
insert into HopDongChiTiet(IDHopDongChiTiet, IDHopDong, IDDichVuDiKem, SoLuong) value
(1, 011, 01, 2),
(2, 011, 01, 2);

select * from nhanvien where (HoTen like 'H%' or HoTen like 'T%' or HoTen like 'K%') and length(HoTen) <= 15 ;
select*from KhachHang where (year(NgaySinh)<2001 and year(NgaySinh)>1969) and (DiaChi = 'Quang Tri' or DiaChi = 'Da Nang');

select KhachHang.HoTen, LoaiKhach.TenLoaiKhach, count(HopDong.IDKhachHang) as'So Lan Dat'
from KhachHang 
inner join LoaiKhach on KhachHang.IDLoaiKhach = LoaiKhach.IDloaiKhach 
inner join HopDong on KhachHang.IDKhachHang = HopDong.IDKhachHang
where LoaiKhach.TenLoaiKhach = 'Diamond'
group by KhachHang.HoTen
order by HopDong.IDKhachHang asc;

select KhachHang.IDKhachHang, KhachHang.HoTen, LoaiKhach.TenLoaiKhach, HopDong.IDHopDong, DichVu.TenDichVu, HopDong.NgayLamHopDong, HopDong.NgayKetThuc, HopDong.TongTien, 
sum(DichVu.ChiPhiThue + HopDongChiTiet.SoLuong*DichVuDiKem.Gia) as 'Tong'
from HopDong
right join KhachHang on KhachHang.IDKhachHang = HopDong.IDKhachHang
left join LoaiKhach on LoaiKhach.IDLoaiKhach = KhachHang.IDLoaiKhach
left join DichVu on DichVu.IDDichVu = HopDong.IDDichVu
left join HopDongChiTiet on HopDongChiTiet.IDHopDong = HopDong.IDHopDong
left join DichVuDiKem on DichVuDiKem.IDDichVuDiKem = HopDongChiTiet.IDDichVuDiKem
group by KhachHang.HoTen;

select DichVu.IDDichVu, DichVu.TenDichVu, DichVu.DienTich, DichVu.ChiPhiThue, LoaiDichVu.TenLoaiDichVu  from DichVu
inner join LoaiDichVu on DichVu.IDLoaiDichVu = LoaiDichVu.IDLoaiDichVu
where not exists (select HopDong.NgayLamHopDong from HopDong where (HopDong.NgayLamHopDong between '2019/01/01' and curdate()) 
and DichVu.IDDichVu = HopDong.IDDichVu);

select IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu from DichVu
inner join LoaiDichVu on DichVu.IDLoaiDichVu = LoaiDichVu.IDLoaiDichVu
where exists(select HopDong.NgayLamHopDong from HopDong where year(HopDong.NgayLamHopDong) = 2018 and DichVu.IDDichVu = HopDong.IDDichVu)
and not exists(select HopDong.NgayLamHopDong from HopDong where year(HopDong.NgayLamHopDong) = 2019 and DichVu.IDDichVu = HopDong.IDDichVu);

select distinct(HoTen) from KhachHang;
select * from KhachHang
group by  HoTen;
SELECT HoTen FROM KhachHang
UNION
SELECT HoTen FROM KhachHang;

select meses.month , count(month(NgayLamHopDong)) as sokhachhangdangki
FROM
           (
                     SELECT 1 AS MONTH
                      UNION SELECT 2 AS MONTH
                      UNION SELECT 3 AS MONTH
                      UNION SELECT 4 AS MONTH
                      UNION SELECT 5 AS MONTH
                      UNION SELECT 6 AS MONTH
                      UNION SELECT 7 AS MONTH
                      UNION SELECT 8 AS MONTH
                      UNION SELECT 9 AS MONTH
                      UNION SELECT 10 AS MONTH
                      UNION SELECT 11 AS MONTH
                      UNION SELECT 12 AS MONTH
           ) as meses
left join HopDong on month(HopDong.NgayLamHopDong) = meses.month
left join KhachHang on KhachHang.IDKhachHang = HopDong.IDKhachHang
where year(HopDong.NgayLamHopDong) = '2019' or year(HopDong.NgayLamHopDong) is null or month(HopDong.NgayLamHopDong) is null
group by meses.month
order by meses.month;

select HopDong.IDHopDong, HopDong.NgayLamHopDong, HopDong.NgayKetThuc, HopDong.TienDatCoc, count(HopDongChiTiet.IDHopDongChiTiet) as 'So Luong Dich Vu Di Kem' from HopDong
left join HopDongChiTiet on HopDong.IDHopDong = HopDongChiTiet.IDHopDong
left join DichVuDiKem on DichVuDiKem.IDDichVuDiKem = HopDongChiTiet.IDDichVuDiKem;

select * from DichVuDiKem
left join HopDongChiTiet on DichVuDiKem.IDDichVuDiKem = HopDongChiTiet.IDDichVuDiKem
left join HopDong on








