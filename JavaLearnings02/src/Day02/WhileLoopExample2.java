package Day02;

import java.util.Scanner;

public class WhileLoopExample2 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to Start Count Down");
		int count= sc.nextInt();

		while(0<count){
			System.out.println(count);
			count--;
		}
		System.out.println("Finished the Counts");
	}
}
