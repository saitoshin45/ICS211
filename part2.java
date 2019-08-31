package practice1;
import java.util.Scanner;

public class part2 {



	public static void main(String[] args) {
	System.out.println("This will print the average of 10 numbers of your input:");
	
	Scanner sc = new Scanner(System.in);
	
	double[] avg = new double[10];
	
	double total = 0;
	double average = 0;
	
	for(int i = 0; i < 10; i++) {
		System.out.print("Enter Element No."+(i+1)+": ");
		avg[i] = sc.nextDouble();
	}
	sc.close();
	
	for(int i = 0; i < 10; i++) {
		total = total+avg[i];
		
	}
	average = total/10;
	
	System.out.println("Average is:"+average);
	}
	

}
