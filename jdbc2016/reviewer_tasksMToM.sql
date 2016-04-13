drop table if exists demo.reviewer_tasks;
CREATE TABLE  demo.reviewer_tasks( reviewerId int(11) NOT NULL,
								   taskID int(11) NOT NULL);
                          
insert into reviewer_tasks (reviewerID,taskID) values('1','1');
insert into reviewer_tasks (reviewerID,taskID) values('2','1');
insert into reviewer_tasks (reviewerID,taskID) values('3','2');
insert into reviewer_tasks (reviewerID,taskID) values('3','4');
insert into reviewer_tasks (reviewerID,taskID) values('4','4');
                     
select * from reviewer_tasks;

select * from  reviewer r join reviewer_tasks rt on r.reviewerID = rt.reviewerID join tasks t on t.taskID = rt.taskID;