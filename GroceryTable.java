public class GroceryTable {
    public static void main(String[] args) {

        String[][] groceries = {
            {"1", "Maggi Noodles", "Nestle", "15.00"},
            {"2", "Tata Tea", "Tata Global", "98.00"},
            {"3", "Mari biscuit", "Britania", "10.00"},
            {"4", "Amul butter", "Amul", "45.00"},
            {"5", "Aashirwad Atta", "ITC", "225.00"},
            {"6", "Fortune Cooking Oil", "ADANI WILMAR","195.00"},
            {"7", "Parle-G", "Parle", "5.00"}
        };
        

        System.out.printf("%-10s %-15s %-20s %-10s\n", "Grocery ID", "Item Name", "Manufacturer", "Price");
     
        

        for (String[] item : groceries) {
            System.out.printf("%-10s %-15s %-20s %-10s\n", item[0], item[1], item[2], item[3]);
        }
    }
}
