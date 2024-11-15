package com.kh.java.operator;

public class Exam_Arithmetic {
	public static void main(String [] args) {
		System.out.println(1+1);
		System.out.println(1-1);
		System.out.println(1*1);				
		System.out.println("divide : "+ 5/2); // 몫
		System.out.println("mod : "+ 5%2); // 나머지
		// 3의 배수인지 아닌지 판별하시오
		// 3, 6, 9, 12, 15
		// 3*1, 3*2, 3*3, 3*4, ...
		// 3/3 = 1, 6/3 = 2, 9/3 = 3
		// 3%3 = 0, 6%3 = 0, 9%3 = 0 -> 나누어 떨어지는지를 알수있다
		// 5의 배수인지 아닌지 판별하시오
		// 5, 10, 15, 20, ...
		// 5%5, 10%5, 15%5, ...
		// 짝수인지 홀수인지 판별하시오
		// 4, 5, ...
		// %2 == 0 이면 짝수 , %2 != 0 이면 홀수 
	}
}
