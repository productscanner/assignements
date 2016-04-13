drop table if exists demo.books;
CREATE TABLE  demo.books( bookId int(11) NOT NULL AUTO_INCREMENT,
						  title varchar(64) DEFAULT NULL,
                          authorId int(11) NOT NULL,
                          PRIMARY KEY(bookId),
                          CONSTRAINT FOREIGN KEY (authorId) REFERENCES author(authorId));
                          
insert into books (bookId,title,authorId) values('0001','A database primer','0001');
insert into books (bookId,title,authorId) values('0002','Building a datawarehouse','0001');
insert into books (bookId,title,authorId) values('0003','Teach yourself SQL','0001');
insert into books (bookId,title,authorId) values('0004','101 exotic recipes','0002');
insert into books (bookId,title,authorId) values('0005','Learn SQL programming','0004');
                     
select * from books;                     