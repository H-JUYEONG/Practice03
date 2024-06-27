package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		/*
		  다음과 같은 프로그램을 작성하세요 
		  a. 입력 받은 숫자가 홀수인 경우에는, 입력 값까지 홀수의 합을 출력합니다.
		  - 예) 입력이 7 이면16을 출력 ( 1 + 3 + 5 + 7 = 16 ) 
		  b. 입력 받은 숫자가 짝수인 경우에는, 입력 값까지 짝수의 합을 출력합니다.
		  - 예) 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30 )
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			int evenSum = 0;
			for (int i = 0; i <= num; i += 2) {
				evenSum += i;
			}
			System.out.println("결과값: " + evenSum);
		} else {
			int oddSum = 0;
			for (int j = 1; j <= num; j += 2) {
				oddSum += j;
			}
			System.out.println("결과값: " + oddSum);
		}

		sc.close();

	}

}
