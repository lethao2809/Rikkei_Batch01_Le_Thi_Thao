#2 Hiển thị thông tin của các cản phẩm có số lượng > 20 và có đơn giá < 1.000.000 VNĐ
SELECT * from sanphamdochoi a
WHERE a.SoLuong > 20 and a.DonGia < 1000000;

SELECT * from sanphamdungcu a
WHERE a.SoLuong > 20 and a.DonGia < 1000000;

SELECT * from sanphamsach a
WHERE a.SoLuong > 20 and a.DonGia < 1000000;

#3. Hiển thị thông tin của những Khách hàng có độ tuổi >16 tuổi và < 30 tuổi
# có địa chỉ ở Đà Nẵng hoặc những Khách hàng có độ tuổi > 40 tuổi và có địa chỉ ở Quảng Nam

SELECT * FROM khachhang as a
WHERE ROUND(DATEDIFF(now() , a.NgaySinh)/365) BETWEEN 16 and 30
  AND ROUND(DATEDIFF(now() , a.NgaySinh)/365) = 40;