use hithotelmanager;

drop table User;

create table User
(
id int not null auto_increment,
name nvarchar(200) not null,
email nvarchar(200) not null,
phoneNumber nvarchar(200) not null,
address nvarchar(200),
password nvarchar(200) not null,
securityQuestion nvarchar(500) not null,
answer nvarchar(500),
primary key(id)
);

create table Room
(
id int not null auto_increment,
number varchar(200) not null,
type varchar(200) not null,
price varchar(200) not null,
status varchar(200) not null,
primary key(id)
);

-- // bảng booking (id, name, number, type, check in, check out, price);
create table booking
(
id int not null auto_increment,
name nvarchar(200) not null,
number nvarchar(200) not null,
type nvarchar(200) not null,
checkin datetime not null,
checkout datetime not null,
price nvarchar(200) not null,
primary key (id)
);

-- // bảng đánh giá (id, name, number, danh gia);
create table comment
(
id int not null auto_increment,
name nvarchar(200) not null,
number nvarchar(200) not null,
checkin datetime ,
checkout datetime ,
comment nvarchar(200),
primary key(id)
);

-- // bảng bill (id, create_date, name, phoneNumber, number, type, checkin, checkout, pice)
create table bill
(
id int not null auto_increment,
create_date datetime,
name nvarchar(200) not null,
phoneNumber nvarchar(12) not null,
number nvarchar(200) not null,
type nvarchar(200) not null,
checkin datetime not null,
checkout datetime not null,
price nvarchar(200) not null,
primary key (id)
)

select * from bill;

select * from comment;

select * from booking;

select * from Room;

select * from comment;

select * from User;
