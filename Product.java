public class Product {

    private int productNumber;
    private String productName;
    private int unitsInStock;
    private double price;
    private Vendor vendor;

    // Empty constructor
    public Product(){
    }

    public Product(int productNumber, String productName, int unitsInStock, double price, Vendor vendor){
        this.productNumber = productNumber;
        this.productName = productName;
        this.unitsInStock = unitsInStock;
        this.price = price;
        this.vendor = vendor;
    }

    void setProductNumber(int productNumber){
        this.productNumber = productNumber;
    }
    int getProductNumber(){
        return productNumber;
    }
    void setProductName(String productName){
        this.productName = productName;
    }
    String getProductName(){
        return productName;
    }
    void setUnitsInStock(int unitsInStock){
        this.unitsInStock = unitsInStock;
    }
    int getUnitsInStock(){
        return unitsInStock;
    }
    void setPrice(double price){
        this.price = price;
    }
    double getPrice(){
        return price;
    }

    void setVendor(Vendor vendor){
        this.vendor = vendor;
    }
    Vendor getVendor(){
        return vendor;
    }

    double inventoryPrice(){
        return unitsInStock * price;
    }

    public String toString(){
        return productNumber + " " + productName + " " + unitsInStock + " " + price + " " + inventoryPrice() +
                " " + vendor.getCompanyName() + " " + vendor.getAddress() + " " + vendor.getNameOfRepresentative() +
                " " + vendor.getPhoneNumber();
    }
}

class DVD extends Product{

    // 4.1
    private String title;
    double restockingFee = 5;

    public DVD(int productNumber, String productName, int unitsInStock, double price, Vendor vendor, String title){
        super(productNumber, productName, unitsInStock, price, vendor);
        this.title = title;
    }

    void setTitle(String title){
        this.title = title;
    }
    String getTitle(){
        return title;
    }

    // 4.2
    double inventoryPrice(){
        return getUnitsInStock() * getPrice() * (1 + restockingFee/100);
    }

    //4.3 Modify the output to display this additional feature you have chosen and the restocking fee.
    // Not sure what this means. Do they want me to add a print statement somewhere? or to modify the toString method for subclass?
    // System.out.printf("Adding %.1f percent restocking fee to inventory price\n", restockingFee);

    public String toString(){
        return getProductNumber() + " " + getProductName() + " " + getUnitsInStock() + " " + getPrice() + " " + inventoryPrice() +
                " " + getVendor().getCompanyName() + " " + getVendor().getAddress() + " " + getVendor().getNameOfRepresentative() +
                " " + getVendor().getPhoneNumber();
    }
}