package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for(int i=0; i<intArray.length; i++) {
			result = result + intArray[i];
		}
		System.out.println(result);
		
		//int형 intArry라는 영역에 5칸의 공간을 만들었지만, 실제로 intArray의 공간을 3만큼 주었다.
		// 정수0이 나오고, 에러가 나옴 -> new int[5]로 수정, i<intArray 수정
		// result = result + intArray[i]이므로 22가 나옴 

	}

}
