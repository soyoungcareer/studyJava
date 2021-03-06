package com.sy.sql;

public class SQL2 {

	/*
	- 기본저장디렉토리 변경 : 도구 > 환경설정 > 데이터베이스 > 워크시트 > 스크립트를 찾을 기본 경로 선택
	- 행번호 표시 : 도구 > 환경설정 > 코드편집기 > 행 여백 > 행 번호 표시

	- escape 문자 : # (#이외에도 임의의 특수문자 사용 가능)

	- DQL(Data Query Language)
	    - 데이터를 검색 추출하기 위해 사용하는 언어. DQL은 DML에 속한언어이기도 하다.
	    - 데이터조회한 결과를 Result set(행들의 집합)이라고 한다.
	    → 0개이상의 행이 포함될 수 있고 , 특정기준에 의해 정렬될 수 있다.
	    - SELECT 기본 작성법

	- 비교연산자
	    - 표현식 사이의 관계를 비교하기 위해 사용하고, 비교 결과는 논리 결과중에 하나(TRUE/FALSE/NULL)가 됨
	    → 단, 비교하는 두 컬럼 값/표현식은 서로 동일한 데이터 타입이어야 함

	    ```
	    연산자			설명
	    =			같다
	    >,<			크다/작다
	    >=,=<			크거나 같다/작거나 같다
	    <>,!=,^=		같지 않다
	    BETWEEN AND		특정 범위에 포함되는지 비교
	    LIKE / NOT LIKE		문자 패턴 비교
	    IS NULL / IS NOT NULL	NULL 여부 비교
	    IN / NOT IN		비교 값 목록에 포함/미포함 되는지 여부 비교

	     <> 작거나 크다 즉, 같지 않다!

	    ```

	- LIKE연산
	    - -LIKE 연산자: 문자 패턴이 일치하는 값을 조회 할때 사용
	    --컬럼명 LIKE '문자패턴'
	    --문자패턴 : '글자%'(글자로 시작하는 값)
	    -- '%글자%'(글자가 포함된 값)
	    -- '%글자'(글자로 끝나는 값)

	    '%' 와 '_' 와일드 카드 로 사용할수있다
	    와일드 카드 : 아무거나 대체해서 사용할수 있는 것
	    _: 한문자
	    %:모든것
	    

	- AS : 굳이 쓰지 않아도 한칸 띄우고 쓰면 별칭 지정해줌.
	- 연결연산자(||)
	- 리터럴
	*/
	
}
