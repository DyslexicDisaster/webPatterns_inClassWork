package business;

public class Product {
    //                          productCode varchar(15) NOT NULL,
    //                          productName varchar(70) NOT NULL,
    //                          productLine varchar(50) NOT NULL,
    //                          productScale varchar(10) NOT NULL,
    //                          productVendor varchar(50) NOT NULL,
    //                          productDescription text NOT NULL,
    //                          quantityInStock smallint(6) NOT NULL,
    //                          buyPrice double NOT NULL,
    //                          MSRP double NOT NULL,
    //                          PRIMARY KEY  (productCode),
    //                          FOREIGN KEY (productLine) REFERENCES productlines(productLine)

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

}
