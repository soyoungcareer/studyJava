package com.CodingTest.JSY.baekjoon.step08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ACMHotel {

	public static void main(String[] args) throws IOException {
		// 20210801 - 백준 10250번
		//정문으로부터 가장 짧은 거리의 방 배정
		//W x H
		//거리 같을 때는 아래층 방 선호

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int height = Integer.parseInt(st.nextToken());
			int width = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			
			int yRoom = (num - 1) % height + 1;
			int xRoom = ((num - 1) / height) + 1;

			String xNum = "";
			if (xRoom < 10) {
				xNum = "0" + xRoom;
			} else {
				xNum = String.valueOf(xRoom);
			}
			
			bw.write(yRoom + xNum);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
