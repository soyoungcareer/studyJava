package com.sy.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ConditionPractice {

	public void practice1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		System.out.println("메뉴 번호를 입력하세요 : ");
		
		int num = Integer.parseInt(br.readLine());
		
		switch (num) {
		case 1 : 
			bw.write("입력 메뉴입니다."); break;
		case 2 : 
			bw.write("수정 메뉴입니다."); break;
		case 3: 
			bw.write("조회 메뉴입니다."); break;
		case 4 : 
			bw.write("삭제 메뉴입니다."); break;
		case 9 : 
			bw.write("프로그램이 종료됩니다."); break;
		default : 
			bw.write("없는 메뉴번호입니다."); break;
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	
	public void practice2() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = Integer.parseInt(br.readLine());
		
		if (num <= 0) {
			bw.write("양수만 입력해주세요.");
		} else {
			if (num % 2 == 0) {
				bw.write("짝수다");
			} else {
				bw.write("홀수다");
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}
	
	
	public void practice3() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("국어점수 : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("수학점수 : ");
		int math = Integer.parseInt(br.readLine());
		System.out.print("영어점수 : ");
		int eng = Integer.parseInt(br.readLine());
		
		double avg = (kor + math + eng) / 3.0;
		
		if (kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			bw.write("축하합니다, 합격입니다!");
		} else {
			bw.write("불합격입니다.");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	
	public void practice4() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = Integer.parseInt(br.readLine());
		
		String season = "";
		
		switch (num) {
		case 12:
		case 1:
		case 2:
			season = "겨울"; break;
		case 3:
		case 4:
		case 5:
			season = "봄"; break;
		case 6:
		case 7:
		case 8:
			season = "여름"; break;
		case 9:
		case 10:
		case 11:
			season = "가을"; break;
		default:
			season = "잘못 입력된 달"; break;
		}
		
		bw.write(num + "월은 " + season + "입니다.");
		bw.flush();
		br.close();
		bw.close();
	}
	
	
	public void practice5() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("아이디 : ");
		String id = br.readLine();
		System.out.print("비밀번호 : ");
		String pw = br.readLine();
		
		if (id.equals("user1")) {
			if (pw.equals("1234")) {
				bw.write("로그인 성공");
			} else {
				bw.write("비밀번호가 틀렸습니다.");
			}
		} else {
			bw.write("아이디가 틀렸습니다.");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	
	public void practice6() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("권한을 확인하고자 하는 회원 등급(관리자, 회원, 비회원) : ");
		String grade = br.readLine();
		
		switch(grade) {
		case "관리자":
			bw.write("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회"); break;
		case "회원":
			bw.write("게시글 작성, 게시글 조회, 댓글 작성"); break;
		case "비회원":
			bw.write("게시글 조회"); break;
		default:
			bw.write("잘못 입력했습니다."); break;
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	
	public void practice7() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = Double.parseDouble(br.readLine());
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		int weight = Integer.parseInt(br.readLine());
		
		double bmi = weight / (height * height);
		
		bw.write("bmi지수 : " + bmi);
		bw.newLine();
		
		if (bmi > 30) {
			bw.append("고도 비만");
		} else if (bmi > 25) {
			bw.append("비만");
		} else if (bmi > 23) {
			bw.append("과체중");
		} else if (bmi > 18.5) {
			bw.append("정상체중");
		} else {
			bw.append("저체중");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	
	public void practice8() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("피연산자1 입력 : ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("피연산자2 입력 : ");
		int num2 = Integer.parseInt(br.readLine());
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String operator = br.readLine();
		
		int result = 0;
		
		switch(operator) {
		case "+":
			result = num1 + num2; break;
		case "-":
			result = num1 - num2; break;
		case "*":
			result = num1 * num2; break;
		case "/":
			result = num1 / num2; break;
		case "%":
			result = num1 % num2; break;
		default:
			System.out.println("연산자를 잘못입력하였습니다.");
		}
		
		bw.write(num1 + " "+ operator  + " "+ num2 + " = " + String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
	
	
	public void practice9() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("중간 고사 점수 : ");
		int mid = Integer.parseInt(br.readLine());
		System.out.print("기말 고사 점수 : ");
		int fin = Integer.parseInt(br.readLine());
		System.out.print("과제 점수 : ");
		int assign = Integer.parseInt(br.readLine());
		System.out.print("출석 횟수 : ");
		int attend = Integer.parseInt(br.readLine());
		
		double newMid = mid * 0.2;
		double newFin = fin * 0.3;
		double newAssign = assign * 0.3;
		double newAttend = (double)attend / 20 * 100 * 0.2;
		
		double result = newMid + newFin + newAssign + newAttend;
		
		
		if (result >= 70 && ((double)attend / 20) >= 0.7) {
			bw.write("=========결과=========");
			bw.append("\n중간 고사 점수(20) : " + newMid);
			bw.append("\n기말 고사 점수(30) : " + newFin);
			bw.append("\n과제 점수 \t(30) : " + newAssign);
			bw.append("\n출석 점수 \t(20) : " + newAttend);
			bw.append("\n총점 : " + result);
			bw.newLine();
			bw.append("PASS");
		} else if (result < 70 && ((double)attend / 20) >= 0.7){
			bw.write("=========결과=========");
			bw.append("\nFAIL [점수 미달] (총점 " + result + ")");
		} else if (result >= 70 && ((double)attend / 20) < 0.7) {
			bw.write("=========결과=========");
			bw.append("\nFAIL [출석 횟수 부족] (" + attend + "/20)");
		} else {
			bw.write("=========결과=========");
			bw.append("\nFAIL [출석 횟수 부족] (" + attend + "/20)");
			bw.append("\nFAIL [점수 미달] (총점 " + result + ")");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	
	public void practice10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		System.out.println("선택 : ");
		int menu = Integer.parseInt(br.readLine());
		
		switch(menu) {
		case 1: practice1(); break;
		case 2: practice2(); break;
		case 3: practice3(); break;
		case 4: practice4(); break;
		case 5: practice5(); break;
		case 6: practice6(); break;
		case 7: practice7(); break;
		case 8: practice8(); break;
		case 9: practice9(); break;
		default : 
			System.out.println("없는 메뉴입니다.");
			break;
		}
	}
}
