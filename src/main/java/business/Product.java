package business;

import java.util.Objects;

public class Product {
    //i. Create a new class modelling the products table (Product.java) – this is a DTO (Data Transfer Object). Like
    //the Customer class in the example, this class should contain variables based on the table as well as
    //constructors, getters, setters and the "good practice" methods.

    //productCode varchar(15) NOT NULL,
    //productName varchar(70) NOT NULL,
    //productLine varchar(50) NOT NULL,
    //productScale varchar(10) NOT NULL,
    //productVendor varchar(50) NOT NULL,
    //productDescription text NOT NULL,
    //quantityInStock smallint(6) NOT NULL,
    //buyPrice double NOT NULL,
    //MSRP double NOT NULL,
    //PRIMARY KEY  (productCode),
    //FOREIGN KEY (productLine) REFERENCES productlines(productLine)

    private String productCode;
    private String productName;
    private String productLine;
    private String productScale;
    private String productVendor;
    private String productDescription;
    private int quantityInStock;
    private double buyPrice;
    private double MRSP;

    public Product(String productCode, String productName, String productLine, String productScale, String productVendor, String productDescription, int quantityInStock, double buyPrice, double MRSP) {
        this.productCode = productCode;
        this.productName = productName;
        this.productLine = productLine;
        this.productScale = productScale;
        this.productVendor = productVendor;
        this.productDescription = productDescription;
        this.quantityInStock = quantityInStock;
        this.buyPrice = buyPrice;
        this.MRSP = MRSP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productCode, product.productCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productCode);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", productLine='" + productLine + '\'' +
                ", productScale='" + productScale + '\'' +
                ", productVendor='" + productVendor + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", quantityInStock=" + quantityInStock +
                ", buyPrice=" + buyPrice +
                ", MRSP=" + MRSP +
                '}';
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductLine() {
        return productLine;
    }

    public String getProductScale() {
        return productScale;
    }

    public String getProductVendor() {
        return productVendor;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getMRSP() {
        return MRSP;
    }
}
