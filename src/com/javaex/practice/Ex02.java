package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		
		double[] num = new double[3];
		num[0] = 6.7;
		num[1] = 3.3;
		num[2] = 1.2;
		
		for(double i=0; i<num.length; i++) {
		}
		System.out.println(num[0]);           //System.out.println(num[i]) 에러 나옴 
		System.out.println(num[1]);
		System.out.println(num[2]);

	}

}
