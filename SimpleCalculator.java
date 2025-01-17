import java.util.Scanner;

public class SimpleCalculator {
  public static void main(String[] args) {

    int operator, result = 0, num1, num2;
    boolean valid = true;

    Scanner scanner = new Scanner(System.in);

    System.out.println("1 - Add \n2 - Subtract \n3 - Multiply \n4 - Divide");
    System.out.print("Choose Operator: ");
    operator = scanner.nextInt();

    System.out.print("Enter first number: ");
    num1 = scanner.nextInt();
    System.out.print("Enter second number: ");
    num2 = scanner.nextInt();

    switch (operator) {
      case 1: 
      result = num1+num2;
        break;
      case 2:
      result = num1-num2;      
        break;
      case 3:
      result = num1*num2;
        break;
      case 4:
      result = num1/num2;
        break;
      default:
      System.out.println("Entered operator is not valid.");
        valid = false; // Mark as invalid operation
        break;
    }
    if (valid) {
      System.out.println("Result: " + result); //Will only print result if it is valid
  }
  }
}