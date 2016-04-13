drop table if exists demo.reviewer;
CREATE TABLE  demo.reviewer( reviewerId int(11) NOT NULL AUTO_INCREMENT,
						     reviewer varchar(64) DEFAULT NULL,
							PRIMARY KEY(reviewerId));
                          
insert into reviewer (reviewerID,reviewer) values('1','james');
insert into reviewer (reviewerID,reviewer) values('2','martin');
insert into reviewer (reviewerID,reviewer) values('3','henry');
insert into reviewer (reviewerID,reviewer) values('4','matt');
insert into reviewer (reviewerID,reviewer) values('5','jack');
                     
select * from reviewer;