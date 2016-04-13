drop table if exists author;
CREATE TABLE  author(authorId int(11) NOT NULL AUTO_INCREMENT,
					 name varchar(64) DEFAULT NULL,
                     city varchar(64) DEFAULT NULL,
                     street varchar(64) DEFAULT NULL,
					 PRIMARY KEY(authorId));


insert into author (authorId,name,city,street) values('0001','henry','Nyc','4th blvd');
insert into author (authorId,name,city,street) values('0002','john','sfc','martin king Rd');
insert into author (authorId,name,city,street) values('0003','marko','dallas','stephen Rd');
insert into author (authorId,name,city,street) values('0004','kane','seattle','benjamin Rd');

select * from demo.author;