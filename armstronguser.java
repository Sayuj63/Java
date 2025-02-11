
    import java.util.Scanner;
    public class armstronguser {




    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length();
        
        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, n);
            number /= 10;
        }
        
        return result == originalNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        boolean result = isArmstrong(num);
        
        if (result) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
