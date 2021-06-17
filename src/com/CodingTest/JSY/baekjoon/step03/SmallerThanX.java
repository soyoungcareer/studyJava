package com.CodingTest.JSY.baekjoon.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SmallerThanX {

	public static void main(String[] args) throws IOException {
		// 20210617
		//방법1. Buffered로 풀기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int num = Integer.parseInt(st.nextToken());
		int standard = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < num; i++) {
			int inputNums = Integer.parseInt(st.nextToken());

			if (inputNums < standard) {
				bw.write(inputNums + " ");
			}
		}
		
		bw.flush();
		br.close();
		bw.close();
		
		
		//방법2. Scanner로 풀기
		/*
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int standard = sc.nextInt();
		
		int[] arr = new int[num];
		
		for (int i = 0; i < num; i++) {
			int inputNums = sc.nextInt();
			arr[i] = inputNums;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < standard) {
				System.out.print(arr[i] + " ");
			}
		}
		*/
	}
}
