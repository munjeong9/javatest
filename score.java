package java_programming_04;

import java.util.Scanner;

public class score {

	public static void main(String[] args) {
		// write your code here
		Scanner scan = new Scanner(System.in);
		int[] scores = new int[5];
		int average = 0;
		
		for(int i = 0 ; i < 5; i++){
			System.out.print("������ �Է��Ͻÿ� :");
			scores[i] = scan.nextInt();
			average += scores[i];
		}
		System.out.println("��ռ����� "+average/5+"�Դϴ�.");
			
	}
}

