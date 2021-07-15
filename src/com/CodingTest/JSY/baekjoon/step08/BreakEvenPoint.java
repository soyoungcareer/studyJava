package com.CodingTest.JSY.baekjoon.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakEvenPoint {

	public static void main(String[] args) throws IOException {
		// 20210715 - 백준 1712번
		
		//A : 고정비용
		//B : 가변비용
		//C : 노트북 가격
		//손익분기점 : 총수입(판매비용) > 총비용(고정비용+가변비용)
		//최초로 이익이 발생하는 판매량 출력. 손익분기점 존재하지 않을시 -1 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int fc = Integer.parseInt(st.nextToken()); //고정비용
		int vc = Integer.parseInt(st.nextToken()); //가변비용
		int price = Integer.parseInt(st.nextToken()); //판매가
		
		int quantity = 0;

		if (price <= vc) {
			quantity = -1;
		} else {
			quantity = fc / (price - vc) + 1;
		}
		
		System.out.println(quantity);
		br.close();
	}

}
