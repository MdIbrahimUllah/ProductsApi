package main.java.ca.vanier;

public class ObjectManager {
   
    private String productName;
    private String productID;
    private String productColor;
    private String productPrice;

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductID() {
        return productID;
    }
    public void setProductID(String productID) {
        // int ID = Integer.valueOf(productID);
        this.productID = productID;
    }
    public String getProductColor() {
        return productColor;
    }
    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }
    public String getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(String productPrice) {
        // int price = Integer.valueOf(productPrice);
        this.productPrice = productPrice;
    }
}

    

