class AddTwoNumbers1{

public static void main(String args[]){

//char c = 'A'; 
//String name= "ABC";

//1. Collect string args 
String s1 = args[0]; //"1a"
String s2 = args[1]; //"2"

//2. Converting string to int
int a = Integer.parseInt(s1); //1
int b = Integer.parseInt(s2); //2
 
int sum = a+b;

System.out.println(sum);

}


}