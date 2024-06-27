package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		// 정수 다섯개를 입력받아 가장 큰 수를 출력하세요.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");

		int max = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자: ");
			int num = sc.nextInt();

			if (num > max) {
				max = num;
			}

		}
		
		System.out.println("최대값은 " + max + " 입니다.");

		sc.close();

		/* if문 사용
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");

		System.out.print("숫자: ");
		int num1 = sc.nextInt();

		System.out.print("숫자: ");
		int num2 = sc.nextInt();

		System.out.print("숫자: ");
		int num3 = sc.nextInt();

		System.out.print("숫자: ");
		int num4 = sc.nextInt();

		System.out.print("숫자: ");
		int num5 = sc.nextInt();

		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
			System.out.println("최대값은 " + num1 + "입니다.");
		} else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
			System.out.println("최대값은 " + num2 + "입니다.");
		} else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
			System.out.println("최대값은 " + num3 + "입니다.");
		} else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
			System.out.println("최대값은 " + num4 + "입니다.");
		} else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
			System.out.println("최대값은 " + num5 + "입니다.");
		}

		sc.close();
		*/
		
	}

}
