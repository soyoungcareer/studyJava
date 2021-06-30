package com.CodingTest.JSY.baekjoon.step07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Dial {

	public static void main(String[] args) throws IOException {
		// 20210630 - 백준 5622번
		//1은 2초
		//2부터는 +1초씩
		//ABC = 2, DEF = 3, GHI = 4, JKL = 5
		//MNO = 6, PQRS = 7, TUV = 8, WXYZ = 9
		//대문자로 입력 받음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'A':
			case 'B':
			case 'C':
				num += 3; break;
			case 'D':
			case 'E':
			case 'F':
				num += 4; break;
			case 'G':
			case 'H':
			case 'I':
				num += 5; break;	
			case 'J':
			case 'K':
			case 'L':
				num += 6; break;	
			case 'M':
			case 'N':
			case 'O':
				num += 7; break;	
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				num += 8; break;	
			case 'T':
			case 'U':
			case 'V':
				num += 9; break;	
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				num += 10; break;	
			default: break;
			}
		}
		bw.write(String.valueOf(num));
		bw.flush();
		bw.close();
		br.close();
	}
}
