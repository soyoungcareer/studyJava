package com.CodingTest.JSY.baekjoon.step07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Constant {

	public static void main(String[] args) throws IOException {
		// 20210629 - 백준 2908번
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String num1 = st.nextToken();
		String num2 = st.nextToken();

		String newNum1 = "";
		String newNum2 = "";
		
		for (int i = 2; i >= 0; i--) {
			newNum1 += num1.charAt(i);
			newNum2 += num2.charAt(i);
		}
		
		int intNum1 = Integer.parseInt(newNum1);
		int intNum2 = Integer.parseInt(newNum2);
		
		if (intNum1 > intNum2) {
			bw.write(String.valueOf(intNum1));
		} else {
			bw.write(String.valueOf(intNum2));
		}
		
		bw.flush();
		bw.close();
		br.close();
		
		
		//간단한 풀이
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
//	    
//		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
//		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString()); 
//		System.out.println(A>B ? A:B);
//		
		
	}
}
