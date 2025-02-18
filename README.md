# HIT-HotelManager

# Ứng dụng Quản lý Khách sạn bằng Java

## 1. Mô tả bài toán

### 1.1 Mục tiêu bài toán:

Xây dựng một ứng dụng quản lý khách sạn bằng Java, sử dụng cơ sở dữ liệu MySQL để lưu trữ và quản lý dữ liệu. Ứng dụng cho phép quản lý các thông tin như:

- _Quản lý phòng_: Thêm, sửa, xóa thông tin phòng (số phòng, loại phòng, giá, tình trạng...).
- _Quản lý khách hàng_: Thêm, sửa, xóa thông tin khách hàng (họ tên, CMND/CCCD, số điện thoại, địa chỉ…).
- _Quản lý đặt phòng_: Khách đặt phòng, hủy đặt phòng, cập nhật trạng thái đặt phòng.
- _Quản lý hóa đơn_: Tạo hóa đơn, tính tổng tiền, in hóa đơn.
- _Quản lý góp ý_ của khách hàng sau khi sử dụng dịch vụ.

---

### 1.2 Các chức năng chính:

- _Đăng nhập/Quản lý người dùng_:
  - Người dùng (admin) đăng nhập vào hệ thống.
  - Phân quyền: Admin, nhân viên, khách hàng.
- _Quản lý phòng_:
  - Thêm, sửa, xóa thông tin phòng.
  - Xem danh sách phòng, trạng thái phòng (trống, đã đặt, đang sử dụng).
- _Quản lý khách hàng_:
  - Thêm mới, chỉnh sửa, xóa khách hàng.
  - Tìm kiếm khách hàng theo tên, số điện thoại, ID.
- _Quản lý đặt phòng_:
  - Đặt phòng: chọn phòng, nhập thông tin khách hàng, ngày nhận, ngày trả.
  - Hủy đặt phòng.
  - Cập nhật thông tin đặt phòng.
- _Quản lý hóa đơn_:
  - Tạo hóa đơn dựa trên thông tin đặt phòng.
  - Tính tổng chi phí (tiền phòng, dịch vụ).
  - In hóa đơn.

---

### 1.3 Mô hình cơ sở dữ liệu

Cơ sở dữ liệu MySQL gồm các bảng chính:

- _room_: number, type, price, status.
- _user_: id, name, email, phoneNumber, address, password, securityQuestion, answer.
- _booking_: id, name, number, type, checkIn, checkOut, price.
- _bill_: id, createDate, name, phoneNumber, number, type, checkIn, checkOut, price.
- _comment_: id, name, number, checkIn, checkOut, comment.

---

### 4. Công nghệ sử dụng:

- _Ngôn ngữ_: Java sử dụng JDBC để kết nối MySQL.
- _Cơ sở dữ liệu_: MySQL.
- _IDE_: Eclipse.
- _Quản lý project_: Maven để quản lý các thư viện JDBC, MySQL Connector.
