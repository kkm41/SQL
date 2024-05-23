--8_DML_SELECT.sql

--오라클 명령어 : select문(검색)
--가장 사용빈도수가 높은 명령

--[1]scott 사용자가 관리하고 있는 테이블 목록
select*from tab;
select*from tabs;

--[2] 특정 테이블의 구조 조회(필드 리스트/데이터 형식)
desc booklist; -- 커멘드 창(sqlplus)에서 확인 요망
desc memberlist; -- 커멘드 창(sqlplus)에서 확인 요망

--[3]테이블의 제약사항 조회
select*from user_constraints; --모든 제약 사항
select*from user_constraints where table_name='RENTLIST'; --특정 테이블의 제약 사항
select*from user_constraints where table_name='BOOKLIST';
select*from user_constraints where table_name='MEMVERLIST';

--SELECT의 사용법
--SELECT : select와 from 사이에 조회하고자 하는 필드명들을 ,로 구분하여 나열합니다
	select booknum, subject, rentprice from booklist;
-- 모든 필드를 한번에 지목하려면 * 을 써줍니다 --select*from ...
-- from 뒤에는 대상 테이블 명을 써줍니다
-- where 절을 붙여서 조건에 맞는 행만 골라내기도 합니다
	select 필드명들 또는 from 테이블명 where 검색조건
	
--출판년도가 2020년 이후인 도서의 제목과 출판년도를 조회
	select subject, makeyear from booklist where makeyear>=2020;
	
	select*from booklist; -- 검색조건 없이 모든 필드를 다 조회해서 열람
	
-- 연산의 결과가 필드의 항목을 조회할 수 있습니다
select rentprice - inprice from booklist;
select rentprice - inprice as 마진 from booklist; //필드명이 연산이 껴서 나오면 아주 곤란, as를 써서 필드명을 정하자
select subject as 제목, rentprice*10 - inprice as 마진 from booklist;
select subject as 제목, rentprice*10 - inprice as 10회대여 마진 from booklist;	
--FROM keyword not found where expected	왜 오류인지 모르겠네~?
-- 대여 마진 사이에 빈칸때문에 FROM을 못찾는다 "를 이때 쓴다
select subject as "도서 제목", rentprice*10 - inprice as "10회대여 마진" from booklist;	
select booknum || '-' || subject as "book info" from booklist;
-- 오라클 SL에서 ||는 이어붙이기 연산입니다



--중복제거 distinct
select bnum as 대여도서번호들 from rentlist; --중복된게 있어서 몇권을 빌려줬는지 모르겠는데? 그럴때 distinct 사용
select distinct bnum as 대여도서번호들 from rentlist;



--함수의 사용
select avg(inprice) as 입고가격평균 from booklist;

--검색 조건 : update와 delete 에서 사용하던 where와 사용방식이 똑같습니다

--memberlist 테이블에서 이름이 '홍'으로 시작하는 회원의 모든 회원정보 출력
select*from memberlist where name like '홍%'; 

--memberlist 테이블에서 1983년도 이후로 태어난 회원의 모든 회원정보
select*from memberlist where Birth >='1983-01-01';
--booklist에서 제작년도가 2016년 이전이거나 입고가격(inprice)이 18000 이하인 도서의 모든 필드
select*from booklist where makeyear>=2016 or inprice<=18000;
--booklist에서 도서 제목에 두번째 글자가 '것'인 도서 정보
select*from booklist where subject like '_것%';

select*from DEPT;
select*from EMP;


-- IN ANY SOME ALL

-- 부서번호가 10,20,30 인 사원들의 모든 필드 조회
--방법 #1
select*from emp where deptno=10 or deptno=20 or deptno = 30;

--방법 #2
select*from emp where deptno<>40;

--방법 #3
select*from emp where deptno in(10,20,30);


--1. ANY
select*from emp where deptno = any(10,20,40);
-- ANY() : 괄호안에 나열된 내용 중 어느하나라도 해당하는 것이 있다면 검색 대상으로 함.
-- In과 유사

--2 SOME 조건식 - ANY와 동일
SELECT*FROM emp WHERE deptno = some(10,20,40);


--3. ALL
SELECT*FROM emp WHERE deptno = all(10,20,40);
-- 괄호 안의 모든값이 동시 만족해야하는 조건이므로 해당하는 레코드가 없을때가 대부분입니다. 사용빈도수가 현저히 낮습니다
SELECT*FROM emp WHERE deptno <> all(10,20,40);
-- 이와 같이 구성내용과 모두 같지 않을때를 필터링할때 자주 사용합니다
-- 위 예문을 in으로 표현
SELECT*FROM emp WHERE deptino NOT IN(10,20,40); 



-- 그 외 활용하기 좋은 select에 대한 예제

-- 부서번호가 10이 아닌 사원 (아래 두 문장은 같은 의미의 명령입니다)
select*from emp where NOT(DEPTNO=10);
select*from emp where DEPTNO<>10;

--급여가 1000달러 이상, 3000다러 이하
select*from emp where SAL>=1000 and SAL<=3000;
select*from emp where SAL between 1000 and 3000;

--사원의 연봉 출력
select deptno, ename, sal*12 as 연봉 from emp;



-- 정렬(Sort) - where 구문 뒤에, 또는 구문의 맨 끝에 Order by 필드명 [desc]
-- select 명령의 결과를 특정 필드값의 오름차순이나 내림차순으로 정렬하는 명령
-- asc : 오름차순 정렬, 쓰지 않으면 기본 오름차순 정렬로 실행됩니다
-- desc : 내림차순 정렬, 내림 차순 정렬을 위해서는 반드시 필드명 뒤에 써야하는 키워드 입니다.

--emp 테이블에서
-- sal이 1000이상인 데이터를 ename의 오름차순으로 정렬하여 조회
select*from emp where sal>=1000 order by ename; -- 오름차운일때 asc는 생략 가능
-- sal이 1000이상인 데이터를 ename의 내림차순으로 정렬하여 조회
select*from emp where sal>=1000 order by ename desc;

--job으로 내림차순 정렬 후 같은 job_id 사이에서는 순서를 hiredate의 내림차순으로 정렬
select*from emp order by job desc, hiredate desc;
--두개 이상의 정렬 기준이 필요하다면 위와 같이 컴마(,)로 구분해서 두가지 기준을 지정해주며,
--위의 예제로 봤을때 job으로 1차 내림 차순 정렬하고, 같은 job 값들 사이에 hiredate로 내림차순 정렬합니다
