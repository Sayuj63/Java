public class Sum_of_vars {
    public static int sumOfNumbers() {
        int[] numbers = {1, 2, 3, 4, 5}; // predefined numbers
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = sumOfNumbers();
        System.out.println("The sum of the numbers is: " + result);
    }
}