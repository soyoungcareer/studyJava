package com.CodingTest.JSY.baekjoon.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Honeycomb {

	public static void main(String[] args) throws IOException {
		// 20210722 - 백준 2292번

		int count = 1;
		int range = 2;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		if (num == 1) {
			System.out.println(1);
		} else {
			while (range <= num) {
				range += 6 * count;
				count++;
			}
			System.out.println(count);
		}
	}
}
