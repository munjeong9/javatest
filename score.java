package java_programming_04;

import java.util.Scanner;

public class score {

	public static void main(String[] args) {
		// write your code here
		Scanner scan = new Scanner(System.in);
		int[] scores = new int[5];
		int average = 0;
		
		for(int i = 0 ; i < 5; i++){
			System.out.print("성적을 입력하시오 :");
			scores[i] = scan.nextInt();
			average += scores[i];
		}
		System.out.println("평균성적은 "+average/5+"입니다.");
			
	}
}

