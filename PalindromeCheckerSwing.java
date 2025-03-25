import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class PalindromeCheckerSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Palindrome Checker");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 150);
            frame.setLayout(new FlowLayout());
            
            JLabel label = new JLabel("Enter text: ");
            JTextField inputField = new JTextField(15);
            JButton checkButton = new JButton("Check Palindrome");
            JLabel resultLabel = new JLabel();
            
            checkButton.addActionListener(e -> {
                String inputText = inputField.getText().trim();
                String reversedText = new StringBuilder(inputText).reverse().toString();
                
                if (inputText.equalsIgnoreCase(reversedText)) {
                    resultLabel.setText(inputText + " is a Palindrome");
                } else {
                    resultLabel.setText(inputText + " is NOT a Palindrome");
                }
            });
            
            frame.add(label);
            frame.add(inputField);
            frame.add(checkButton);
            frame.add(resultLabel);
            
            frame.setVisible(true);
        });
    }
}