create table foreigner(
    national varchar(40),
    gender varchar(1),
    gend_total varchar(10),
    age4 varchar(10),
    age9 varchar(10),
    age14 varchar(10),
    age19 varchar(10),
    age24 varchar(10),
    age29 varchar(10),
    age34 varchar(10),
    age39 varchar(10),
    age44 varchar(10),
    age49 varchar(10),
    age54 varchar(10),
    age59 varchar(10),
    age60 varchar(10)
);

drop table foreigner;
create table foreign;
select * from foreigner;

select * from foreigner
where national = 'Áß±¹';

select national, gend_total from foreigner where national = '¹Ì±¹';
or 'È«Äá' or 'ÇÊ¸®ÇÉ' or 'Å¸ÀÌ' or 'ÀÏº»';