package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {

		// 아래와 같이 구구단을 출력하세요

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println("");
		}

	}

}
