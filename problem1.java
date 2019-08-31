//practice.java1
//@Shinya Saito
//import the necessary modules
import java.util.Scanner;
//problem1
public class practice1{
public String reverse(){
//a class that reads a string and prints the string in reverse order
String reverse = "";
Scanner read = new Scanner(System.in);
String str = read.nextLine();

for (int i = str.length()-1; i>=0; i--)
  {

  reverse = reverse + str.charAt(i);
  }
  System.out.println("Reversed string is"+ )
}
public float average(){
  Scanner sc = new Scanner(System.in);
  //a class that gets ten numbers
  float input[] = new input[10];

  float total = 0.00f;
  float average = 0.00f;

  for(int i = 0; i <10;i++){
    System.out.println("Enter the"+(i+1)+":");
    input[i] = sc.nextFloat();
  }
  sc.close();
  for(int i =0; i<10; i++)
  {
    total = total+input[i];
  }
  average = total/10;
  System.out.println("Average is:"+average);
}
public static void main(String[]args)
{
    practice1 obj = practice1();
    obj.average();
    obj.reverse();
}
}
