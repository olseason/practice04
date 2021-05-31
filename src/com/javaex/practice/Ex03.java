package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intA = {3, 6, 9};
		
		int[] intB;                                     // 20
		intB = intA;                                    // 6
		intB[0] = 20;                                   // 10
		intB[2] = 10;
		
		for(int i=0; i<intA.length; i++) {              // intA = intB와 같고, intA에 대한 i의 값을 출력받으   
			System.out.println(intA[i]);                // 공간에 대해 저장했던 20과 10 나오고, intA에서 저장
		}                                               // 했던 값이 intB[1]에 나옴 

		
		
	}

}
