class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}q
public class mobilenumValidator {
    public static void validateMobileNumber(String mobileNumber) throws InvalidDataException {
        if (mobileNumber.length() != 10 || !mobileNumber.matches("\\d+") || "012345".contains(mobileNumber.substring(0, 1))) {
            throw new InvalidDataException("Invalid Mobile Number");
        }
        System.out.println("Valid Mobile Number: " + mobileNumber);
    }
    public static void main(String[] args) {
        String number = "9876543210"; 

        try {
            validateMobileNumber(number);
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
