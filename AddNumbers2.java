
//import java.lang.String; //No need to import
import java.util.Scanner;

class AddNumbers2{

public static void main(String args[]){
	
	Scanner scan = new Scanner(System.in);  // Scanner -> Command Prompt 
	
	//Write to Console
	System.out.println("Please enter a number1");
	double v1 = scan.nextDouble();
	
	System.out.println("Please enter a number2");
	double v2 = scan.nextDouble();
	
	
	double sum = v1 + v2; 
	System.out.println("Addition of two numbers ="+ sum );
	
	
	
}

}