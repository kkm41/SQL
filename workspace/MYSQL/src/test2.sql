--02_DML,sql

insert into member(userid,pwd,name,phone,email)
values('user1','user1','홍길동','010-1111-3322','user1@naver.com');
insert into member(userid,pwd,name,phone,email)
values('user2','user2','이순신','010-1111-2233','user2@naver.com');
insert into member(userid,pwd,name,phone,email)
values('user3','user3','유관순','010-1111-4444','user3@naver.com');

insert into board(boardnum,writer,subject,content,writedate,readcount)
values(1,'user1','맨유','축구','2020-11-11',1);
insert into board(boardnum,writer,subject,content,writedate,readcount)
values(2,'user2','파리','실화','2011-10-10',2);
insert into board(boardnum,writer,subject,content,writedate,readcount)
values(3,'user3','토트넘','다큐','2019-09-09',3);


select*from member;
select*from board;





