--07_DML_Update

--데이터 변경 - 수정(UPDATE)
--UPDATE 테이블명 SET 변경내용 WHERE 검색조건
update memberlist set age =30, phone = '010-0000-1111' where membernum=3;

--명령문에 WHERE 이후 구문은 생략이 가능합니다
--다만 이 부분을 생략하면 모든 레코드를 대상으로해서 UPDATE 명령이 실행되어 모든 레코드가 수정됩니다.
--검색조건 : 필드명(비교-관계연산자) 조건값 으로 이루어진 조건연산이며, 흔히 자바에서 if()
-- if 괄호안에 사용했던 연산을 그대로 사용하는게 보통입니다
-- 나이가 29세 이상-> WHERE AGE>=29
-- 두개 이상의 필드를 수정하고자 한다면(,)로 구분해서 기술합니다
-- 복합 조건을 사용하고자 한다면 and, or 등을 사용합니다 (&& -> and, || -> or, !-> Not)

--booklist 테이블의 도서 제목 '봉제인형 살인사건' 도서의 grade를 '18'으로 수정하세요
update booklist set grade='18' where subject = '내부자들';
update booklist set grade='18' where subject = '봉제인형&'; --봉제인형으로 시작하는 모든 제목들
update booklist set grade='18' where subject = '&살인사건'; -- 살인사건으로 끝나는 제목들
update booklist set grade='18' where subject = '&인형&'; --인형이 들어간 모든 제목들

--booklist의 모든 도서의 대여가격(rentprice)를 10%이상으로 인상한 값으로 수정하세요
rentprice = rentprice + rentprice*0.1;
rentprice = rentprice * 1.1;
update booklist set rentprice = rentprice * 1.1;

--memberlist에서 사은포인트(Bpoint)가 300이상인 회원의 Bpoint에 30점을 가산해주세요
pdate memberlist set Bpoint= Bpoint+ 30 where Bpoint>=300;

--생년월일이 NULL인 회원의 생년월일을 2000-01-01로 AGE를 23으로 변경하세요
update memberlist set Birth='2000-01-01',AGE='23' where Birth=null; --이렇게 안씀
update memberlist set Birth='2000-01-01',AGE='23' where Birth is null;

--gender가 NULL인 회원의 gender를 'M'으로 변경하세요
update memberlist set gender = 'M' where gender is null;

--외래키로 참조되는 필드를 수정
update booklist set booknum = 17 where booknum = 7;
-- rentlist에 bnum에 7번이 없다면 변경이 가능
-- rentlist에 bnum에 7번이 있다면 변경이 불가능
-- ORA-02292: integrity constraint (SCOTT.FK1) violated - child record found
-- 해결방법 #1 외래키를 지우고 해당 booknum과 bnum을 함께 수정한 후 다시 외래키를 설정
-- 해결방법 #2 PL/SQL의 트리거 기능을 이용해서 동시에 변경

--레코드의 삭제
--delete from 테이블명 where 조건식
--where 조건식이 생략되면 모든 레코드가 삭제된다

--rentlist 테이블에서 discount가 10이하인 레코드를 삭제
delete from rentlist where discount<=10;


--삭제의 제한
delete from booklist where booknum=7; --삭제 실패
-- integrity constraint (SCOTT.FK1) violated - child record found

-- 해결방법 #1
-- 이를 해결하려면 우선 rentlist 테이블에 해당 도서 대여목록 레코드(child record)를 모두 삭제한 후
-- booklist 테이블에서 해당 도서를 삭제
delete from rentlist where bnum=7;
delete from booklist where booknum =7;

-- 해결방법 #2
-- 외래키 제약조건을 삭제한 후 다시 생성
-- 외래키 생성시에 "옵션을 추가해서"
-- "참조되는 값(parents record)이 삭제되면 참조하는 값(child record)도 같이 삭제"되게 구성합니다

-- 외래키 삭제
alter table rentlist drop constraint fk1;

--새로운 외래키 추가
alter table rentlist add constraint fk1
foreign key(bnum) references booklist(booknum) on delete cascade;

-- memberlist테이블에서 회원 한명을 삭제하면, rentlist테이블에서도 해당회원이 대여한 기록을 같이 삭제하도록
--외래키 설정을 바꿔주세요(외래키 제약조런 삭제후 재생성)
alter table rentlist drop constraint fk2;
alter table rentlist add constraint fk2
foreign key(mnum) references memberlist(membernum) on delete cascade;


select*from RENTLIST;