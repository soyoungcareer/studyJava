package com.CodingTest.JSY.baekjoon.step08;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class BigAplusB {

	public static void main(String[] args) throws IOException {
		// 20210809 - 백준 10757번
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		
		BigInteger result = a.add(b);
		
		System.out.println(result);
	}

}
