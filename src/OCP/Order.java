package OCP;

public class Order {
    private String product;
    private int amount;
    public Order(String product, int amount){
        this.product = product;
        this.amount = amount;
    }
    public String getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }
    public void setProduct(String product) {
        this.product = product;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
