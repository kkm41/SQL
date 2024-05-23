-- 06_DML.sql


--DML (Data Management Language) 데이터 조작 언어

-- 테이블에 레코드를 조작(추가, 수정, 삭제, 조회)하기 위한 명령어들
--INSERT(추가)
--UPDATE(수정)
--DELETE(삭제)
--SELECT(조회 및 선택)

--[1] 샘플 테이블 생성
create table exam01(
	deptno number(2),
	dname varchar2(15),
	loc varchar2(15)
);
select*from EXAM01;

--[2] 레코드 추가

--레코드 추가 방법 #1
insert into 테이블이름(필드명1, 필드명2, 필드명3, ....)values(값1, 값2, 값3, ...);

--레코드 추가 방법 #2
insert into 테이블 이름 values(값1, 값2, 값3, ...);

--#1과 #2의 차이점
--#1 : 필드명과 입력되어야 하는 값들이 1:1 매칭되어 입력됩니다
--		  필드명의 순서는 반드시 지켜야하는 것은 아니지만 나열된 필드명대로 값들의 순서는 맞춰서 입력합니다
insert into exam01(deptno, dname, loc)values('기획부',10,'서울'); X
insert into exam01(deptno, dname, loc)values(10,'기획부','서울'); O
insert into exam01(loc, deptno, dname)values('서울',10,'기획부'); O
--				null 값을 허용하는 필드나, default 값이 있는 필드는 생략하고 구성할 수 있습니다
insert into exam01(deptno, dname)values(10,'기획부'); O

-- #2 모든 필드에 해당하는 값들을 최초에 테이블 생성 시에 기술한 필드순서에 맞게 모두 입력하는 방법입니다
insert into exam01 values(10,'기획부','서울'); O
-- #2는 null을 허용하는 곳을 비우고 입력할 수 없으며, null이라도 직접 지정해야 합니다
insert into exam01 values(10,null,'서울'); O

--#1과 #2 공통으로 숫자는 그냥 쓰고, 문자는 작은 따옴표로 묶어서 표현합니다

delete from booklist; --테이블 내의 모든 레코드를 삭제하는 명령

--위 두가지 방법 중 자유롭게 선택하여서, booklist 테이블에 10개의 레코드를 추가해주세요.
--booknum은 시퀀스를 이용합니다
--grade 는 'all' '12' '18' 세가지만 골라서 입력해주세요. 자신이 만든 테이블에 grade가 없으면 입력하지 않아도 됩니다.

insert into booklist values(book_seq.nextVal,'좀비아이',2020,12000,2500,'all');

insert into booklist values(book_seq.nextVal,'내부자들',2017,12000,1500,'19');
insert into booklist values(book_seq.nextVal,'너의 이름은',2016,13000,2500,'12');
insert into booklist values(book_seq.nextVal,'날씨의 아이',2020,14000,3500,'12');
insert into booklist values(book_seq.nextVal,'스즈메의 문단속',2023,15000,4500,'12');
insert into booklist values(book_seq.nextVal,'최애의 아이',2023,16000,5500,'15');
insert into booklist values(book_seq.nextVal,'주술회전',2022,17000,6500,'19');
insert into booklist values(book_seq.nextVal,'짱구는 못말려',2023,15000,4500,'12');
insert into booklist values(book_seq.nextVal,'귀멸의 칼날',2023,16000,5500,'15');
insert into booklist values(book_seq.nextVal,'슈타인즈 게이트',2022,17000,6500,'19');
0
select*from booklist;

-- memberlist에 10명의 데이터를 추가해주세요(member_seq 이용)
insert into memberlist(membernum,name,phone)
values(member_seq.nextVal,'박민석','010-1234-5678');
insert into memberlist(membernum,name,phone)
values(member_seq.nextVal,'배현우','010-1324-5658');
insert into memberlist(membernum,name,phone)
values(member_seq.nextVal,'박재훈','010-4321-8765');
insert into memberlist(membernum,name,phone)
values(member_seq.nextVal,'이수현','010-1111-5678');

insert into memberlist
values(member_seq.nextVal,'김예지','010-2222-1212','96/11/11',100,'F','29');
insert into memberlist
values(member_seq.nextVal,'박지성','010-1313-4444','95/01/01',110,'M','20');
insert into memberlist
values(member_seq.nextVal,'손흥민','010-2121-3333','94/12/12',120,'M','21');
insert into memberlist
values(member_seq.nextVal,'이강인','010-5555-4321','93/10/10',130,'M','22');
insert into memberlist
values(member_seq.nextVal,'이재성','010-1520-1530','92/09/09',140,'M','23');
insert into memberlist
values(member_seq.nextVal,'김민재','010-0509-0310','91/08/08',150,'M','24');

select*from booklist;
select*from memberlist;

--rentlist 테이블도 rent_seq를 이용해서 10개의 데이터를 추가해주세요
insert into rentlist values (rent_seq.nextVal,'2020/12/01',3,1,100);
insert into rentlist values (rent_seq.nextVal,'2021/01/01',2,2,100);
insert into rentlist values (rent_seq.nextVal,'2021/03/05',4,2,200);
insert into rentlist values (rent_seq.nextVal,'2022/12/10',8,3,150);
insert into rentlist values (rent_seq.nextVal,'2023/03/10',7,4,200);
insert into rentlist values (rent_seq.nextVal,'2020/06.03',10,7,50);
insert into rentlist values (rent_seq.nextVal,'2021/07/09',9,6,250);
insert into rentlist values (rent_seq.nextVal,'2011/11/11',5,5,100);
insert into rentlist values (rent_seq.nextVal,'2022/12/12',10,1,150);
insert into rentlist values (rent_seq.nextVal,'2015/03/10',9,5,100);

select*from rentlist;
delete from rentlist;

commit -- 현재창에서 commit은 세미콜론을 붙이지 않습니다. 단일 명령이고 다른 명령과 함께 사용하지 않는다는 뜻입니다.

--데이터베이스 백업명령
exp userid = scott/tiger file = abc.dmp log =abc.log

--데이터베이스 복원명령
exp userid = scott/tiger file = abc.dmp log =abc.log full=y

--오라클의 백업 명령과 복원 명령은 모두 command 창에서 실행합니다
