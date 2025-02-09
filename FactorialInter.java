// factorial using interface


interface FactorialInterface {
    static int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

public class FactorialInter {
    public static void main(String[] args) {
        int number = 5;  
        System.out.println("The factorial of " + number + " is: " + FactorialInterface.calculateFactorial(number));
    }
}
