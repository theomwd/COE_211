import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;
    // Constructor to initialize the calculator
    public Calculator() {
        Scanner scan = new Scanner(System.in);
            System.out.println("enter the first number");
               num1 = scan.nextInt();
               System.out.println("enter the operator");
                      operator = scan.nextLine();
               operator = scan.nextLine();
               System.out.println("enter the second number");
               num2 = scan.nextInt();
               scan.nextLine();
        
       switch(operator) {
        case "+":
        System.out.println(add(num1, num2));
        break;
        case "-":
        System.out.println(subtract(num1, num2));
        break;
        case "/":
        System.out.println(divide(num1, num2));
        break;
        case "*":
        System.out.println(multiply (num1,num2));
        break;
        }

    }

    public String add(int a, int b) {
        return a + "+" + b + "=" + (a+b);
        
    }

    public String subtract(int a, int b) {
        return a + "-" + b + "=" + (a-b);
    }

    public String multiply(int a, int b) {
        return a + "*" + b + "=" + (a*b);
    }

    public String divide(int a, int b) {
        return a + "/" + b + "=" + (a/b);
    }
   
}