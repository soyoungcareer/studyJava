package com.CodingTest.JSY.baekjoon.step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Max {

	public static void main(String[] args) throws IOException {
		// 20210621 - 2562번
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int arr[] = new int[9];
		int max = 0;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, arr[i]); //max에 최댓값 계속해서 갱신됨.
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) { //max값을 가진 arr의 인덱스 값 찾기
				count = ++i; //1부터 순서를 세어야하므로 1씩 더해줌.
			}
		}
		
		bw.write(String.valueOf(max));
		bw.newLine();
		bw.append(String.valueOf(count));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
