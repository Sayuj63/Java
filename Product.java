public class Product {
    private int product_id;
    private String product_name;
    private double product_price;
    private String product_manufacturer;

public Product(int productId, String productName, double productPrice, String productManufacturer) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_manufacturer = product_manufacturer;
        public int getProductId() {
            return product_id;
        }
    
        public void setProductId(int productId) {
            this.product_id = product_id;
            
            

        }
    }