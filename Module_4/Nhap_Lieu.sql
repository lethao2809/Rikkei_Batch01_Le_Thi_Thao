use quanlysachnhanam;
insert into dmsach value ('dms01',N'Thiếu Nhi','');
insert into dmsach value ('dms02',N'Khoa Học','');
insert into dmsach value ('dms03',N'Tôn Giáo','');
insert into dmsach value ('dms04',N'Chính Trị','');
insert into dmsach value ('dms05',N'Văn Học','');

insert into dmdochoi value ('dmdc01',N'Nhóm 0-3 tuổi','');
insert into dmdochoi value ('dmdc02',N'Nhóm 4-8 tuổi','');
insert into dmdochoi value ('dmdc03',N'Nhóm trên 8 tuổi','');

insert into dmdungcu value ('dmdc1',N'Tiểu học','');
insert into dmdungcu value ('dmdc2',N'Trung học','');
insert into dmdungcu value ('dmdc3',N'Phổ thông','');

insert into loaikhachhang value (1,N'Thường');
insert into loaikhachhang value (2,N'VIP1');
insert into loaikhachhang value (3,N'VIP2');

insert into nhanvien values('nv01',N'Lê Thị Thảo ','1999/01/01',N'Nhân Viên','0777941772','minhhoangpro09@gmail.com',N'Quảng Bình');
insert into nhanvien values('nv02',N'Trần Hoàng Anh','1999/02/02',N'Phó giám đốc','0913002441','hoanganhtran669@gmail.com',N'Hà Nội');
insert into nhanvien values('nv03',N'Nguyễn Thị Linh','1999/03/03',N'Thư kí','0913002441','nguyenthithao2809@gmail.com',N'Sài Gòn');
insert into nhanvien values('nv04',N'Nguyễn Thị Kiều Trang','1999/04/04',N'Nhân Viên','0363215351','nguyenkieutrang@gmail.com',N'Bình Dương');
insert into nhanvien values('nv05',N'Võ Văn Thắng','1999/05/05',N'Giám đốc','0913362157','nguyenviettrong@gmail.com',N'Hải Phòng');
insert into nhanvien values('nv06',N'Nguyễn Văn Hồng','1999/06/06',N'Nhân Viên','0996325874','nguyenvanhong@gmail.com',N'Quảng Nam');
insert into nhanvien values('nv07',N'Trần Viết Nhân','1999/07/07',N'Nhân Viên','0986352147','ngominhcuong@gmail.com',N'Huế');
insert into nhanvien values('nv08',N'Ngô Minh Cường','1999/08/08',N'Nhân Viên','0362158742','Tranvietnhan@gmail.com',N'Quảng Bình');
insert into nhanvien values('nv09',N'Nguyễn Hậu','1999/09/09',N'Nhân Viên','0998512362','nguyenhau@gmail.com',N'Quảng Nam');
insert into nhanvien values('nv10',N'Nguyễn Viết Trọng','1999/10/10',N'Nhân Viên','0965123748','vovanthang@gmail.com',N'Quảng Nam');
insert into nhanvien values('nv11',N'Phan Thị Diệu Hiền','1999/10/10',N'Nhân Viên','0965123748','vovanthang@gmail.com',N'Gia Lai');

insert into sanphamdochoi values ('spdc01',N'Xe mô hình',3,100000,'chiếc','dmdc01','Việt Nam','ABC','GameLoft','');
insert into sanphamdochoi values ('spdc02',N'Thú nhồi bông',2,200000,'cái','dmdc02','Hàn Quốc','Kim Long','Rikkei','');
insert into sanphamdochoi values ('spdc03',N'Lắp ráp',7,300000,'cái','dmdc03','Trung Quốc','Hồng Hà','Phi Long','');
insert into sanphamdochoi values ('spdc04',N'Thú nhún',2,300000,'con','dmdc01','Mỹ','Phương Đông','Duy Tân','');
insert into sanphamdochoi values ('spdc05',N'Xe đẩy',2,200000,'chiếc','dmdc02','Việt Nam','ABC','Lotter','');
insert into sanphamdochoi values ('spdc06',N'Tàu lượn',4,100000,'chiếc','dmdc03','Úc','Logger','Big C ','');
insert into sanphamdochoi values ('spdc07',N'Xe mô hình',5,400000,'chiếc','dmdc01','Italia','ABCD','Bông','');
insert into sanphamdochoi values ('spdc08',N'Xe cẩu',2,500000,'chiếc','dmdc02','Triều Tiên','Yamaha','Ochahous','');
insert into sanphamdochoi values ('spdc09',N'Búp bê',6,100000,'con','dmdc03','Việt Nam','Elesa','Gong Cha','');
insert into sanphamdochoi values ('spdc10',N'Siêu nhân',3,500000,'chiếc','dmdc01','Trung Quốc','Gao','GameLoft','');

insert into sanphamdungcu values('spdc1','Thước','100','6000','đ','dmdc1','Việt Nam','Thiên Long','Hoàng Anh','Xanh dương','400','nhựa','');
insert into sanphamdungcu values('spdc2','Bút chì','1000','5000','cái','dmdc2','Việt Nam','Thiên Long','Lê Thảo','Đen','20','gỗ','');
insert into sanphamdungcu values('spdc3','Tẩy','1020','3000','cái','dmdc3','Việt Nam','Hồng Hà','Kim Tiến','Trắng','400','gôm','');
insert into sanphamdungcu values('spdc4','Vở ô ly','1000','5000','quyển','dmdc1','Việt Nam','Thiên Long','Thanh Hải','Trắng','400','giấy','');
insert into sanphamdungcu values('spdc5','Vở kẻ ngang','1000','8000','quyển','dmdc2','Việt Nam','Hồng Hà','Hải Lý','Trắng','800','Giấy','');
insert into sanphamdungcu values('spdc6','Vở kẻ ngang','1200','6000','quyển','dmdc3','Việt Nam','Thiên Long','Thảo Hiếu','Trắng','400','Giấy','');
insert into sanphamdungcu values('spdc7','Ống thí nghiệm','100','60000','cái','dmdc1','Việt Nam','Trung Sơn','Hiếu Anh','Trắng','400','thủy tinh','');
insert into sanphamdungcu values('spdc8','Kẹt thí nghiệm','100','50000','cái','dmdc2','Việt Nam','Trung Sơn','Hoàng Anh','Nâu','200','gỗ','');
insert into sanphamdungcu values('spdc9','Compa','1000','6000','cái','dmdc3','Việt Nam','Thiên Long','Hoàng Sơn','Xanh','400','Nhựa','');
insert into sanphamdungcu values('spdc10','Chai trung tín','100','12000','cái','dmdc1','Việt Nam','Trung Sơn','Văn Sĩ','Nâu','400','nhựa','');

insert into sanphamsach values('s01',N'ANIMORPHS - NGƯỜI HÓA','100','54400','Quyển','dms01','Hội nhà văn','2019','K.A Applegate','2019/11/27',1);
insert into sanphamsach values('s02',N'BÍ ẨN VỀ CON CHÓ LÚC NỬA ĐÊM','100','60000','Quyển','dms02','Văn Học','2019','Mark Haddon','2019/11/07',1);
insert into sanphamsach values('s03',N'TÔI LÀ AI VÀ NẾU VẬY THÌ BAO NHIÊU','50','116000','Quyển','dms03','Thế giới','2018','Mary Roach','2018/10/27',2);
insert into sanphamsach values('s04',N'TOÁN HỌC, MỘT THIÊN TIỂU THUYẾT','20','88000','Quyển','dms04','Thế giới','2019','Mickaël Launay','2019/05/16',2);
insert into sanphamsach values('s05',N'HỌC KIỂU MỸ TẠI NHÀ','100','94400','Quyển','dms05','Thế giới','2019','Hong Dinh','2019/04/10',1);
insert into sanphamsach values('s06',N'21 BÀI HỌC CHO THẾ KỶ 21','188','167200','Quyển','dms01','Thế giới','2018','Yuval Noah Harari','2019/02/10',1);
insert into sanphamsach values('s07',N'HOA VẪN NỞ MỖI NGÀY','55','187000','Quyển','dms02','Hà Nội','2020','Valérie Perrin','2020/11/03',1);
insert into sanphamsach values('s08',N'CHÚC MẸ NGỦ NGON','66','116000','Quyển','dms03','Hà Nội','2020','Thomas Cathcart - Daniel Klein','2020/09/21',1);
insert into sanphamsach values('s09',N'NÓI LUÔN CHO NÓ VUÔNG','63','72000','Quyển','dms04','Thế giới','2018','Steve Harvey','2018/09/30',1);
insert into sanphamsach values('s10',N'TRIẾT HỌC NGHỆ THUẬT CỦA HEIDEGGER','30','128000','Quyển','dms05','Thế Giới','2020','Julian Young','2020/03/01',1);

insert into khachhang values(1,N'Trần Hoàng Lâm','2002/1/2','0363688925','thangqn@gmail.com',2);
insert into khachhang values(7,N'Nguyễn Văn Trọng','2002/12/11','0363698123','ttnguyenxx26@gmail.com',3);
insert into khachhang values(5,N'Nguyễn Bảo Khang','2002/1/10','03669220','khangbao@gmail.com',2);
insert into khachhang values(3,N'Trần Anh Hoàng','2001/12/10','0363812001','trananhhoang@gmail.com',1);
insert into khachhang values(9,N'Trần Healthy','2003/01/02','0363689990','tranmongmanh@gmail.com',1);
insert into khachhang values(2,N'Hoàng Hy An','2004/11/2','0363685525','anhyhoang@gmail.com',3);
insert into khachhang values(4,N'Đào Balance ','2002/1/2','036389440','badao002@gmail.com',2);
insert into khachhang values(6,N'Phạm Hoàng My','2004/10/11','036445289','Mypham@gmail.com',1);
insert into khachhang values(8,N'Đào Trang','2002/1/2','0364586358','daonghiatrang@gmail.com',1);
insert into khachhang values(10,N'Đào Thị Ái','2003/11/02','0355988244','uocmocau@gmail.com',1);

insert into donhang values('dh01',1,'nv01','2021/02/15', 123456);
insert into donhang values('dh02',2,'nv02','2021/02/15',123 );
insert into donhang values('dh03',3,'nv04','2021/02/15', 123456);
insert into donhang values('dh04',4,'nv05','2021/02/15', 123456);
insert into donhang values('dh05',5,'nv01','2021/02/15', 123456);
insert into donhang values('dh06',6,'nv02','2021/02/15', 123456);
insert into donhang values('dh07',7,'nv03','2021/02/15', 123456);
insert into donhang values('dh08',1,'nv04','2021/02/15', 123456);
insert into donhang values('dh09',2,'nv05','2021/02/15', 123456);
insert into donhang values('dh10',3,'nv03','2021/02/15',123456 );

insert into chitietdonhang values(1,'dh01','s01',10);
insert into chitietdonhang values(2,'dh02','s02',10);
insert into chitietdonhang values(3,'dh03','spdc02',10);
insert into chitietdonhang values(4,'dh04','spdc06',10);
insert into chitietdonhang values(5,'dh05','spdc7',10);
insert into chitietdonhang values(6,'dh06','s01',10);
insert into chitietdonhang values(7,'dh07','s06',10);
insert into chitietdonhang values(8,'dh08','s09',10);
insert into chitietdonhang values(9,'dh09','spdc04',10);
insert into chitietdonhang values(10,'dh10','spdc2',10);





