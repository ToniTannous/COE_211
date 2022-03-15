import java.util.Scanner;


public class Calculator {
    
private int num1;
    
private int num2;
    
private String operator;
private int num;
  
// Constructor to initialize the calculator
    
public Calculator() {
        
// Get user input
        
Scanner scanCalc = new Scanner(System.in);
System.out.println("Input the first number: ");
num1 = scanCalc.nextInt();scanCalc.nextLine();
System.out.print("Input the operator: ");
operator = scanCalc.nextLine();
System.out.println("Input the second number: ");
num2 = scanCalc.nextInt();


int num;
switch(operator){
case "+":
	add(num1,num2);
	break;
case "-":
	subtract(num1,num2);
	break;
case "X":
	multiply(num1,num2);
   break;
case "/":
	divide(num1,num2);
  default:
           break;
   }
      }      
 /**
         * Continue code here to ask for the first number, the operator, and the second number, IN THAT ORDER
         */

       
 // Decide on the operation to perform 
        
/**
         * Insert code to decide on which function to call, based on the operator the user chose
         * Hint: Switch statement
         */
    

   
 public String add(int a, int b) {
 
num1=a;
num2=b;
num= num1 + num2;
return num1 + "+" +num2+ "="+num;
   }

    
public String subtract(int a, int b) {

num1 = a;
num2 = b;
num =num1 -num2;
return num1 + "-" +num2 +"="+num;
 }

   
 public String multiply(int a, int b) {

num1 = a;
num2 = b;
num = num1*num2;
return num1+ "X"+num2 +"="+num;
          }

    
public String divide(int a, int b) {
      
num1 =a;
num2 =b;
num =num1/num2;
return num1+ "/"+num2+ "=" +num;

}

   public String toString(){
     return num1 +" "+operator +" "+ num2 +" = " +num;
          }
             }