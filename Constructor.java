import java.util.Scanner;

public class Constructor {
    Constructor(){
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("X :"+x);
        sc.close();
    }
    public static void main(String[] args) {
        new Constructor();
    }
}