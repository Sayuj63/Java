class BinaryPattern {
    void display() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j % 2 + " ");
            }
            System.out.println();
        }
    }
}

public class BinaryTriangle extends BinaryPattern {
    public static void main(String[] args) {
        new BinaryTriangle().display();
    }
}
