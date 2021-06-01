package com.sy.sql;

public class SQL {

	/*
	- SQL(Structured Query Language) 문법 : 데이터베이스를 접근하고 조작하는 데 필요한 표준 언어를 활용할 수 있게 해주는 규칙.
	- DBMS(DataBase Management System) : 데이터베이스에서 데이터 추출, 조작, 정의, 제어 등을 할 수 있게 해주는 데이터베이스 전용 관리 프로그램

	- Oracle CMD Process(보통은 대문자로 쓰나, 비밀번호는 대소문자 구분함)

	    C:\Users\USER>SQLPLUS

	    Enter user-name: SYS AS SYSDBA

	    Enter password : oracle

	    SQL> SHOW USER

	    SQL> SELECT USERNAME FROM DBA_USERS

	    2 ;

	    SQL> CONN HR;

	    Enter password: oracle

	    SQL> CONN SYSTEM

	    Enter password: oracle

	    SQL> SELECT USERNAME, ACCOUNT_STATUS FROM DBA_USERS WHERE USERNAME='HR'

	    2 ;

	    SQL> ALTER USER HR ACCOUNT UNLOCK;

	    SQL> ALTER USER HR IDENTIFIED BY HR;

	    SQL> CONN HR/HR; (→ 아이디/비밀번호)

	    SQL> SHOW USER;

	    ---

	- SQL Developer
	    - 도구 - 환경설정 - Environment - 인코딩 - UTF-8
	    - 코드실행 : 실행할 블럭 전체 잡아서 CTRL + ENTER

	    - sys에서 KH 사용자 새로 생성

	        CREATE USER KH IDENTIFIED BY KH;
	        GRANT RESOURCE, CONNECT TO KH;

	- 데이터 정의어(DDL : Data Definition Language)

	    → 테이블 구조 변경

	    - CREATE : 테이블 생성
	    - ALTER : 테이블 수정
	    - DROP : 테이블 삭제
	    - TRUNCATE : 테이블 초기화

	- 데이터 조작어(DML : Data Manipulation Language)

	    → 테이블 구조 유지하고 데이터만 변경

	    - INSERT : 데이터 추가
	    - UPDATE : 데이터 수정
	    - DELETE : 데이터 삭제
	    - SELECT : 데이터 조회 (DQL : 데이터 질의어)

	        → SELECT는 DML에 속해있으나 따로 DQL로 불리기도 함.

	    ```sql
	    --INSERT
	    INSERT INTO 테이블명(속성명1, ...)
	    VALUES(데이터1, ...)

	    --UPDATE
	    UPDATE 테이블명
	    	SET 속성명 = 데이터, ...
	    WHERE 조건

	    --DELETE
	    DELETE FROM 테이블명
	    WHERE 조건

	    --SELECT
	    SELECT [ALL | DISTINCT | DISTINCTROW] 속성명1, 속성명2, ...
	    	FROM 테이블명1, ...
	    [WHERE 조건]
	    [GROUP BY 속성명1, ...]
	    [HAVING 그룹조건]
	    [ORDER BY 속성 [ASC | DESC] ]; --ASC : 오름차순(default), DESC : 내림차순

	     
	    ALL : 모든 튜플 검색시. default
	    DISTINCT : 중복된 속성이 조회될 경우 그중 한 개만 검색
	    DISTINCTROW : SELECT 뒤에 속성들과 상관없이 튜플 전체가 중복된 튜플을 제거.

	    ROW = RECORD = TUPLE
	    
	    ```

	- 데이터 제어어(DCL : Data Control Language)

	    → 접속 권한 등 설정

	    → DB관리자가 데이터 보안, 무결성 유지, 병행 제어, 회복을 위해 사용하는 언어

	    - GRANT : 사용 권한 부여
	    - REVOKE : 사용 권한 취소
	    - TCL : 트랜잭션 제어언어

	    ```sql
	    --GRANT(권한 부여)
	    GRANT 권한 TO 사용자; --시스템 권한
	    GRANT 권한 ON 테이블 TO 사용자; --객체 권한

	    --REVOKE(권한 회수)
	    REVOKE 권한 FROM 사용자; --시스템 권한
	    REVOKE 권한 ON 테이블 FROM 사용자; --객체 권한

	    --COMMIT
	    COMMIT;

	    --ROLLBACK
	    ROLLBACK;

	    --SAVEPOINT
	    SAVEPOINT 이름;

	    --ROLLBACK TO SAVEPOINT
	    ROLLBACK TO SAVEPOINT 이름;
	    ```

	---

	- 트리거(Trigger)
	    - 데이터베이스 시스템에서 삽입, 갱신, 삭제 등의 이벤트가 발생할 때마다 관련 작업이 자동으로 수행되는 절차형 SQL.
	    - TCL 사용 불가. 오류에 주의해야 함.
	- 트랜잭션(Transaction)
	    - 데이터베이스 내에서 하나의 그룹으로 처리되어야 하는 명령문들을 모아놓은 논리적인 작업단위.
	    - 데이터베이스 응용 프로그램은 트랜잭션들의 집합.
	    - 여러 단계의 처리를 하나의 처리처럼 다루는 기능.
	    - 하나의 명령어라도 잘못되면 전체 취소되어 되돌아감.
	    - 트랜잭션 사용 이유 : 데이터의 **일관성을 유지**하면서 안정적으로 **데이터 복구**가 가능하게 하기 위함.
	    - 트랜잭션의 특징(ACID)
	        - **원자성(Atomicity)** : 트랜잭션이 데이터베이스에 모두 반영되거나, 전혀 반영되지 않아야 한다.
	        - **일관성(Consistency)** : 트랜잭션의 작업처리 결과는 항상 일관성이 있어야 한다.
	        - **독립성(Isolation)** : 둘 이상의 트랜잭션이 동시에 병행 실행되고 있을 경우에 어느 하나의 트랜잭션이라도 다른 트랜잭션의 연산에 끼어들 수 없다.
	        - **지속성(Durability)** : 트랜잭션이 성공적으로 완료된 경우, 결과는 영구적으로 반영되어야 한다.

	- WHERE 조건
	    - 비교 : =, <>, <, ≤, >, ≥
	    - 범위 : BETWEEN A AND B
	    - 집합 : IN, NOT IN
	    - 패턴 : LIKE
	    - NULL : IS NULL, IS NOT NULL
	    - 복합조건 : AND, OR, NOT
	- LIKE와 같이 사용하는 와일드 문자
	    - + : 문자열 연결
	    - % : 0개 이상의 문자열과 일치
	    - [ ] : 1개의 문자와 일치
	    - [^] : 1개의 문자와 불일치
	    - _ : 특정 위치의 1개의 문자와 일치
	    */
}
