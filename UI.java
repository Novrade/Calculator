import java.util.Scanner;

public class UI {

    private final Calculator calculator;
    private final Scanner scanner;

    public UI() {
        this.calculator = new Calculator();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int userChoice = 0;
        System.out.println("Welcome to the calculator please select one of the following: ");
        while(userChoice != 5) {
            System.out.print("1. Addition:\n" +
                    "2. Subtraction: \n" +
                    "3. Multiplication: \n" +
                    "4. Division: \n" +
                    "5. Clear result\n" +
                    "6. Exit\n" +
                    ">>>>>>  ");
            userChoice = Integer.parseInt(scanner.nextLine());
            switch (userChoice) {
                case 1:
                    operationUI('+');
                    break;
                case 2:
                    operationUI('-');
                    break;
                case 3:
                    operationUI('*');
                    break;
                case 4:
                    operationUI('/');
                    break;
                case 5:
                    System.out.println("Good bye !");
                    break;
            }
        }
    }

    private void operationUI(char operator) {
        if(operator == '/'){
            System.out.println("Left operand must be greater than right operand");
        }
        System.out.print("Please enter left operand: ");
        int left = Integer.parseInt(scanner.nextLine());
        System.out.print("Please enter right operand: ");
        int right = Integer.parseInt(scanner.nextLine());

        System.out.println("Result equals: " + calculator.operation(left,right,operator) + "\n");
    }
}
