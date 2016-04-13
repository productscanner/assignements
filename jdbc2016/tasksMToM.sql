drop table if exists demo.tasks;
CREATE TABLE  demo.tasks( taskId int(11) NOT NULL AUTO_INCREMENT,
						  task varchar(64) DEFAULT NULL,
                          PRIMARY KEY(taskId));
                          
insert into tasks (taskID,task) values('1','singing');
insert into tasks (taskID,task) values('2','dancing');
insert into tasks (taskID,task) values('3','writing');
insert into tasks (taskID,task) values('4','driving');
insert into tasks (taskID,task) values('5','running');
                     
select * from tasks;                     