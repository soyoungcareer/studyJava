package com.sy.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OperatorPractice {
	
	public void practice1() throws IOException {
		//키보드로 입력받은 정수가 양수이면 "양수다", 아니면 "양수가 아니다" 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("정수 : ");
		int a = Integer.parseInt(br.readLine());
		
		if (a > 0) {
			bw.write("양수다");
		} else {
			bw.write("양수가 아니다");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	
	public void practice2() throws IOException {
		//키보드로 입력 받은 정수가 양수이면 "양수다", 0이면 "0이다", 둘 다 아니면 "음수다" 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("정수 : ");
		int a = Integer.parseInt(br.readLine());
		
		if (a > 0) {
			bw.write("양수다");
		} else if (a == 0) {
			bw.write("0이다");
		} else {
			bw.write("음수다");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	
	public void practice3() throws IOException {
		//키보드로 입력 받은 정수가 짝수이면 "짝수다", 아니면 "홀수다" 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("정수 : ");
		int a = Integer.parseInt(br.readLine());
		
		if (a % 2 == 0) {
			bw.write("짝수다");
		} else {
			bw.write("홀수다");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	
	public void practice4() throws IOException {
		/*
		 * 모든 사람이 사탕 골고루 나눠 가지려 함.
		 * 인원 수, 사탕 개수 키보드로 입력 받고
		 * 1인당 동일하게 나눠가진 사탕 개수와
		 * 나눠주고 남은 사탕의 개수 출력
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("인원수 : ");
		int people = Integer.parseInt(br.readLine());
		System.out.print("사탕 개수 : ");
		int candy = Integer.parseInt(br.readLine());
		
		bw.write("1인당 사탕 개수 : ");
		bw.append(String.valueOf(candy / people));
		bw.newLine();
		bw.write("남는 사탕 개수 : ");
		bw.append(String.valueOf(candy % people));
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	
	public void practice5() throws IOException {
		/*
		 * 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인
		 * 성별이 'M'이면 남학생, 아니면 여학생으로 출력
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("이름 : ");
		String name = br.readLine();
		System.out.print("학년(숫자만) : ");
		int year = Integer.parseInt(br.readLine());
		System.out.print("반(숫자만) : ");
		int classNum = Integer.parseInt(br.readLine());
		System.out.print("번호(숫자만) : ");
		int num = Integer.parseInt(br.readLine());
		System.out.print("성별(M/F) : ");
		String gender = br.readLine();
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		Double grade = Double.parseDouble(br.readLine());
		
		String gen = null;
		
		if (gender.equals("M")) {
			gen = "남";
		} else {
			gen = "여";
		}
		
		bw.write(year + "학년 " + classNum + "반 " + num + "번 " + name + " " + gen + "학생의 성적은 " + grade + "이다.");
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	
	public void practice6() throws IOException {
		//나이를 키보드로 입력 받아 어린이(13세 이하), 청소년(13세 초과 ~ 19세 이하), 성인(19세 초과) 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("나이 : ");
		int age = Integer.parseInt(br.readLine());
		
		if (age > 19) {
			bw.write("성인");
		} else if (age > 13) {
			bw.write("청소년");
		} else {
			bw.write("어린이");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	
	public void practice7() throws IOException {
		/*
		 * 국어, 영어, 수학 점수를 키보드에 정수로 입력 받고
		 * 세 과목의 합계와 평균(합계/3.0) 구하시오.
		 * 세 과목의 점수가 각각 40점 이상이면서 평균 60점 이상일 경우 합격, 아니면 불합격.
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("국어 : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("영어 : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("수학 : ");
		int math = Integer.parseInt(br.readLine());
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		String pnp = null;
		
		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			pnp = "합격";
		} else {
			pnp = "불합격";
		}
		
		bw.write("\n합계 : " + sum + "\n");
		bw.append("평균 : " + avg + "\n");
		bw.append(pnp);
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	
	public void practice8() throws IOException {
		//주민번호 이용하여 남자인지 여자인지 구분하여 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("주민번호를 입력하세요(-포함) : ");
		
		String num = br.readLine();
		char gender = num.charAt(7);
		
		if (gender == '2' || gender == '4') {
			bw.write("여자");
		} else {
			bw.write("남자");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	
	public void practice9() throws IOException {
		/*
		 * 키보드로 정수 두 개 입력받아 각각 변수 (num1, num2)에 저장
		 * 또 다른 정수를 입력 받아 그 수가 num1 이하이거나 num2 초과이면 true 출력, 아니면 false 출력
		 * (단, 입력시 num1 < num2 이어야 함)
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("정수1 : ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("정수2 : ");
		int num2 = Integer.parseInt(br.readLine());
		System.out.print("입력 : ");
		int num = Integer.parseInt(br.readLine());
		
		if (num <= num1 || num > num2) {
			bw.write("true");
		} else {
			bw.write("false");
		}
	
		bw.flush();
		br.close();
		bw.close();
	}
	
	
	public void practice10() throws IOException {
		//3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("입력1 : ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("입력2 : ");
		int num2 = Integer.parseInt(br.readLine());
		System.out.print("입력3 : ");
		int num3 = Integer.parseInt(br.readLine());
		
		if ((num1 == num2) && (num1 == num3)) {
			bw.write("true");
		} else {
			bw.write("false");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	
	public void practice11() throws IOException {
		/*
		 * A, B, C 사원의 연봉을 입력 받고 각 사원의 인센티브를 포함한 연봉을 계산하여 출력
		 * 인센티브 포함 급여가 3000만원 이상이면 "3000 이상", 미만이면 "3000 미만" 출력
		 * (A사원의 인센티브는 0.4, B사원의 인센티브는 없음, C사원의 인센티브는 0.15)
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("A사원의 연봉 : ");
		int salA = Integer.parseInt(br.readLine());
		System.out.print("B사원의 연봉 : ");
		int salB = Integer.parseInt(br.readLine());
		System.out.print("C사원의 연봉 : ");
		int salC = Integer.parseInt(br.readLine());
		
		double incenSalA = salA * 1.4;
		double incenSalB = salB * 1.0;
		double incenSalC = salC * 1.15;
		
		String result1 = "3000 이상";
		String result2 = "3000 미만";

		/*방법1
		bw.write("\nA사원의 인센티브포함 연봉 : " + incenSalA + "\n");
		if (incenSalA >= 3000) {
			bw.append("3000 이상");
		} else {
			bw.append("3000 미만");
		}
		bw.newLine();
		bw.append("B사원의 인센티브포함 연봉 : " + incenSalB + "\n");
		if (incenSalB >= 3000) {
			bw.append("3000 이상");
		} else {
			bw.append("3000 미만");
		}
		bw.newLine();
		bw.append("C사원의 인센티브포함 연봉 : " + incenSalC + "\n");
		if (incenSalC >= 3000) {
			bw.append("3000 이상");
		} else {
			bw.append("3000 미만");
		}
		*/
		
		//방법2
		bw.write("\nA사원의 인센티브포함 연봉 : " + incenSalA + "\n");
		bw.write(incenSalA >= 3000 ? result1 : result2);
		bw.write("\nB사원의 인센티브포함 연봉 : " + incenSalB + "\n");
		bw.write(incenSalB >= 3000 ? result1 : result2);
		bw.write("\nC사원의 인센티브포함 연봉 : " + incenSalC + "\n");
		bw.write(incenSalC >= 3000 ? result1 : result2);
		
		bw.flush();
		br.close();
		bw.close();
	}
}
