import java.util.Scanner;
public class MenuDrivenCalc{
    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         
         System.out.println("Enter first number:");
         int number = scan.nextInt();
         
         System.out.println("Enter Second number:");
         int number2 = scan.nextInt();
         
         System.out.println("Enter Maths operator (+, -, *, /):");
         char operator = scan.next().charAt(0);
         
         int sum = 0;
         switch(operator){
               case '+' :
                        int addition = number + number2;
                        System.out.println("The sum of the given two numbers: " + addition);
                        break;
               case '-' :
                        int subtraction = number - number2;
                        System.out.println("The difference the given two numbers: " + subtraction);
                        break;
               case '*' :
                        double multiple = number * number2;
                        System.out.println("The product the given two numbers: " + multiple);
                        break;
               case '/' :
                        double division = number / number2;
                        System.out.println("The result of the given two numbers: " + division);
                        break;
               default:
                      System.out.println("Invalid operator"); 
         } 
    }
}
