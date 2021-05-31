package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] num = new int[5];
		
		int sum = 0;
		double plus;
		
	
		for(int i=0; i<num.length; i++) {
			num[i] = input.nextInt();
			sum = sum + num[i];
		}
		plus = sum/num.length;
		System.out.println("평균은" + plus +"입니다.");       
		
		input.close();

	}

}
