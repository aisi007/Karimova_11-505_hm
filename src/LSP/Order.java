package LSP;

public class Order {
    protected String product;
    public Order(String product){
        this.product = product;
    }
    public void process(){
        System.out.println("Обработка заказа: " + product);
    }
}
