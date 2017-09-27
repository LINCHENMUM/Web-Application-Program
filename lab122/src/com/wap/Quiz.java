package com.wap;

public class Quiz {
	
	public Quiz(){};
	
	private static String[] questions={
		"3,1,4,1,5",
		"1,1,2,3,5",
		"1,4,9,16,25",
		"2,3,5,7,11",
		"1,2,4,8,16"
	};
	private static int[] answers={9,8,36,13,32};
	private static String[] hint={"pi","fibonacci","squares","primes","powers of 2"};

	public String getQuestion(int i){
		return questions[i];
	}
	public int getAnswer(int j){
		return answers[j];
	}
	public int getLength(){
		return questions.length;
	}
	public String getHint(int k){
		return hint[k];
	}
}
