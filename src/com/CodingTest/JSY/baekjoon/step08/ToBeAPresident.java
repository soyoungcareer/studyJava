package com.CodingTest.JSY.baekjoon.step08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ToBeAPresident {

	public static void main(String[] args) throws IOException {
		// 20210806 - 백준 2775번
		//a층 b호에 살려면, (a-1)층 1호부터 b호까지 사람들의 수만큼 데려와 살아야 한다.
		//0층부터, 1호부터 있음.
		//0층 i호에는 i명 거주
		//k층, n호

//		오답
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int residents = 0;
//		
//		int num = Integer.parseInt(br.readLine());
//		
//		for (int i = 0; i < num; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			
//			int k = Integer.parseInt(st.nextToken());
//			int n = Integer.parseInt(st.nextToken());
//			
//			if (k == 0) {
//				residents = n;
//			} else {
//				for (int m = 0; m < k; m++) {
//					for (int j = 1; j <= n; i++) {
//						residents += j;
//					}
//				}
//			}
//			bw.write(residents);
//			bw.newLine();
//		}
//		
//		bw.flush();
//		bw.close();
//		br.close();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int residents = 0;

		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			System.out.println(cal(k, n));
		}
	}
	
	
	private static int cal(int k, int n) {
		if (n == 0) {
			//n이 0호인 경우 0 리턴
			return 0;
		} else if (k == 0) {
			//k가 0층인 경우 n호 리턴. 0층부터 시작하므로.
			return n;
		} else {
			return cal(k, n-1) + cal(k-1, n);
		}
	}

}
