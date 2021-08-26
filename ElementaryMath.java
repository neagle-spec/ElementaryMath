package chapter_1;

import java.util.*;

//simple math practice using random number generation

public class ElementaryMath {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		Boolean correct = false;
		
		System.out.println("Do you want to practice: \n addition \n subtraction \n multiplication \n division");
		String option = scan.nextLine();
		
		//addition case
		if(option.equalsIgnoreCase("addition")) {
			while (correct==false) {
				int firstNum = rand.nextInt(10);
				int secondNum = rand.nextInt(10);
				int answer = firstNum + secondNum;
				
				System.out.println(firstNum + " + " + secondNum + " = ?");
				int userAnswer = scan.nextInt();
				
				if(userAnswer==answer) {
					correct = true;
					System.out.println("You are a math geniue, bye");
				}else {
					System.out.println("Incorrect answer, try again");
				}
			}
		}
		//subtraction case
		else if(option.equalsIgnoreCase("subtraction")) {
			while (correct==false) {
				int firstNum = rand.nextInt(10);
				int secondNum = rand.nextInt(10);
				int answer = firstNum - secondNum;
				
				System.out.println(firstNum + " - " + secondNum + " = ?");
				int userAnswer = scan.nextInt();
				
				if(userAnswer==answer) {
					correct = true;
					System.out.println("You are a math geniue, bye");
				}else {
					System.out.println("Incorrect answer, try again");
				}
			}
		}
		//multiplication case
		else if(option.equalsIgnoreCase("multiplication")) {
			while (correct==false) {
				int firstNum = rand.nextInt(10);
				int secondNum = rand.nextInt(10);
				int answer = firstNum * secondNum;
				
				System.out.println(firstNum + " * " + secondNum + " = ?");
				int userAnswer = scan.nextInt();
				
				if(userAnswer==answer) {
					correct = true;
					System.out.println("You are a math geniue, bye");
				}else {
					System.out.println("Incorrect answer, try again");
				}
			}
		}
		//division case
		else if(option.equalsIgnoreCase("division")) {
			while (correct==false) {
				int firstNum = rand.nextInt(10);
				int secondNum = rand.nextInt(10);
				int answer = firstNum * secondNum;
				
				System.out.println(firstNum + " * " + secondNum + " = ?");
				int userAnswer = scan.nextInt();
				
				if(userAnswer==answer) {
					correct = true;
					System.out.println("You are a math geniue, bye");
				}else {
					System.out.println("Incorrect answer, try again");
				}
			}
		}
		else {
			System.out.println("Not an option, bye");
		}
	}
	
}
