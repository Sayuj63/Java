import java.util.*;

public class EmployeeHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "John");
        employeeMap.put(2, "Sarah");
        employeeMap.put(3, "David");

        System.out.println("Employee Details:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
