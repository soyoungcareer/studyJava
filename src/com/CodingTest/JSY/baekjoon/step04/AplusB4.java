package com.CodingTest.JSY.baekjoon.step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AplusB4 {

	public static void main(String[] args) throws IOException {
		// 20210618
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = "";
		StringTokenizer st;
		int num1 = 0;
		int num2 = 0;
		while ((str = br.readLine()) != null) {
			try {
				st = new StringTokenizer(str);
				num1 = Integer.parseInt(st.nextToken());
				num2 = Integer.parseInt(st.nextToken());

			} catch (Exception o) {
				break;
			}

			bw.write(String.valueOf(num1 + num2));
			bw.newLine();
		}

		bw.flush();
		br.close();
		bw.close();

	}
}
