create table bank(
custonNum varchar2(20) primary key,
accountNum varchar2(20),
money varchar2(20),
id varchar2(20) ,
foreign key(id) references member(id) on delete cascade);
select * from tab;
select * from bank;
