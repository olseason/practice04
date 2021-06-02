package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		for(int i = 0; i<lotto.length; i++) {
			int lotto_num = (int)(Math.random()*45) +1;
			lotto[i] = lotto_num;
			
			for (int j=0; j<i; j++) {
				if(lotto[i] ==lotto[i]) {
					i--;
					break;
				}
			}
		}
		for(int Arraynum=0; Arraynum<lotto.length; Arraynum++) {
			System.out.print(lotto[Arraynum] + " ");
		}
		
		

	}

}
