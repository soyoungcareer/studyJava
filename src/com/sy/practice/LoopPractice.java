package com.sy.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LoopPractice {

	//반복문 ver.hard
	public void practice15() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("숫자 : ");
		int num = Integer.parseInt(br.readLine());
		
		boolean flag = true;
		
		if (num < 2) {
			bw.write("잘못 입력하셨습니다.");
		} else {
			//1, num을 제외한 중간값들 중 나누어 떨어지는 수가 있는지 확인
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
			
			if (flag) {
				bw.write("소수입니다.");
			} else {
				bw.write("소수가 아닙니다.");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	
	public void practice16() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while (true) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(br.readLine());

			boolean flag = true;

			if (num < 2) {
				bw.write("잘못 입력하셨습니다.\n");
			} else {
				// 1, num을 제외한 중간값들 중 나누어 떨어지는 수가 있는지 확인
				for (int i = 2; i < num; i++) {
					if (num % i == 0) {
						flag = false;
						break;
					}
				}

				if (flag) {
					bw.write("소수입니다.");
					break;
				} else {
					bw.write("소수가 아닙니다.");
					break;
				}
			}

			bw.flush();
		}
		bw.close();
		br.close();
	}
	
	
	public void practice17() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("숫자 : ");
		int num = Integer.parseInt(br.readLine());
		
		boolean flag = true;
		int count = 1;
		
		if (num < 2) {
			bw.write("잘못 입력하셨습니다.");
		} else {
			for (int i = 2; i < num; i++) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						flag = false;
					}
				}
				
				if (flag) {
					bw.append(i + " ");
					count++;
				}
				flag = true;
			}
			bw.append(String.valueOf(num));
			bw.newLine();
			bw.append("2부터 " + num + "까지 소수의 개수는 " + count + "개입니다.");
			
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	
	public void practice18() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		for (int i = 1; i <= num; i++ ) {
			if ((i % 2 == 0) || (i % 3 == 0)) {
				bw.write(i + " ");
			}
			
			if ((i % 2 == 0) && (i % 3 == 0)) {
				count++;
			}
			
		}
		bw.append("\ncount : " + String.valueOf(count));
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	
	public void practice19() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			for (int j = (num - 1); j > i; j--) {
				System.out.print(" ");
				
			}
			
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
	}
	
	
	public void practice20() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수 입력: ");
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i < num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void practice21() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			for (int j = (num - 1); j > i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	
	public void practice22() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수 입력 : ");
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		for (int i = 0; i < num - 2; i++) {
			System.out.print("*");
			for (int k = 0; k < num - 2; k++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
	}
	
	
	//다중for문 ver.hard
	public void practice23() {
		
		int num = 5;
		
		for (int i = 1; i <= num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j < i * 2; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		for (int i = num; i > 0; i--) {
			for (int j = num + 1; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j < i * 2 - 2; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
	
	public void practice24() {
		int num = 3;
		
		for (int i = 1; i <= num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j < i * 2; j++) {
				if (j == 1 || j == i * 2 - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		for (int i = num; i > 0; i--) {
			for (int j = num + 1; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j < i * 2 - 1; j++) {
				if (j == 1 || j == i * 2 - num) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
	
	
	public void practice25() {
		int num = 10;
		
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		for (int i = 0; i < num - 7; i++) {
			System.out.print("*");
			for (int k = 0; k < num - 2; k++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
	}
}
