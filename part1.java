package practice1;
import java.io.*; 
import java.util.*; 

public class part1 {

	public static void main(String[] args) {
		String input = "ICS212";
		
		StringBuilder inputA = new StringBuilder();
		inputA.append(input);
		
		inputA = inputA.reverse();
		
		System.out.println(inputA);
		
	}
}
