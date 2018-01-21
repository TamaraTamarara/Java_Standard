/**
 * Created by Tamara on 1/19/18.
 */
public class Transaction {
    /**
     * Created by Tamara on 1/19/18.
     */
    String companyName, productName;
    int transactionID;
    int quantity;
    double costPerItem;
    double pricePerItem;


    //default constructor - no data
    Transaction(){
        companyName = "";
        productName = "";
        transactionID = 0;
        quantity = 0;
        costPerItem = 0.0;
        pricePerItem = 0.0;
    }

    //constructor - set brand, name and memory size to passed values
    Transaction(String companyName, String productName, int transactionID, int quantity, double costPerItem, double pricePerItem){
        this.companyName = companyName;
        this.productName = productName;
        this.transactionID = transactionID;
        this.quantity = quantity;
        this.costPerItem = costPerItem;
        this.pricePerItem = pricePerItem;

    }


    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String brand) {
        this.companyName = brand;
    }

    public  String getProductName() {
        return productName;
    }

    public  void setProductName(String name) {
        this.productName = name;
    }

    public  int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCostPerItem() {
        return costPerItem;
    }

    public void setCostPerItem(double costPerItem) {
        this.costPerItem = costPerItem;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public String toString (){
        String info = ("Transaction details: /nCompany - " + companyName
                + "./nTransaction ID - " + transactionID
                + "./nProduct name - " + productName
                + "./nQuantity of items - " + quantity
                + "./nCost per item - " + costPerItem
                + "./nPrice per item - " + pricePerItem
                + "./nProduct name - " + productName);
        return info;
    }


    public boolean equals(Object a) {
        if (a instanceof Transaction) {
            Transaction otherTrans = (Transaction) a;

            return (this.transactionID==otherTrans.transactionID);
        } else {
            return false;
        }
    }

    public double calculateMargin() {
        double total = costPerItem + pricePerItem;
        return total;
    }


}
