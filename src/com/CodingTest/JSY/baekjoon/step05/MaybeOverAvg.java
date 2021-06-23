package com.CodingTest.JSY.baekjoon.step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaybeOverAvg {

	public static void main(String[] args) throws IOException {
		// 20210623 - 4344번
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int nums = Integer.parseInt(st.nextToken());
			
			int arr[] = new int[nums];
			int sum = 0;
			
			for (int j = 0; j < nums; j++) {
				int grade = Integer.parseInt(st.nextToken());
				arr[j] = grade;
				sum += arr[j];
			}
			
			double avg = sum / nums; //평균점수
			
			int count = 0;
			
			for (int j = 0; j < nums; j++) {
				if (arr[j] > avg) count++; //평균 넘는 학생 수 
			}

			double overAvg = ((double)count / nums) * 100; //double을 (count/nums) 계산 후에 붙이면 0으로 계산됨. 계산 전에 형변환 해줄 것!
			
			sb.append(String.format("%.3f", overAvg) + "%\n");
		}
		System.out.println(sb);
	}
}
