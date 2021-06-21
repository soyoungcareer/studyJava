package com.CodingTest.JSY.baekjoon.step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CountOfNums {

	public static void main(String[] args) throws IOException {
		// 20210621 - 2577번
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());

		String multi = String.valueOf(num1 * num2 * num3);
		
		int arr[] = new int[multi.length()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Character.getNumericValue(multi.charAt(i)); //Character.getNumericValue -> char값을 아스키코드값이 아닌 숫자형태로 변환해줌.
		}
		
		
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					count++;
				}
			}
			bw.append(String.valueOf(count));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
