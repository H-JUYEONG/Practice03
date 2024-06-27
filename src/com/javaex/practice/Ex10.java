package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		// 정수 다섯개를 입력받아 가장 큰 수를 출력하세요.

		//for문 사용
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");

		int[] num = new int[5]; // 정수 다섯개를 입력받으므로 배열 크기는 5

		for (int i = 0; i < 5; i++) { // 0, 1, ,2, 3, 4 --> 5번 반복
			System.out.print("숫자: ");
			num[i] = sc.nextInt();
		}

		int max = num[0]; // 첫번째로 입력받은 값을 최대값으로 설정

		// num[0]이 max로 설정되어 있으므로 i값을 1로 세팅 = num[1]부터 비교
		for (int i = 1; i < num.length; i++) {
			if (max < num[i]) { // num[0]과 num[1] 값을 비교
				max = num[i]; // num[1]이 num[0]보다 크면 max에 num[1] 값으로 갱신
			}
		}

		System.out.println("최대값은 " + max + "입니다.");

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
