public class Calculator {


    public Calculator() {
    }

    public int operation(int x, int y, char operator) {
        if (operator == '/') {
            if (x <= 0 || y <= 0) {
                return -1;
            }
        }
        switch (operator) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return x / y;
            default:
                System.out.println("Operator not found");
        }
        return -1;
    }
}
