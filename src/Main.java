import SRP.Order;
import SRP.OrderPrinter;
import SRP.SavedAtaBase;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("Ноутбук", 2);
        OrderPrinter printer = new OrderPrinter();
        printer.printaFile("карта", 4);
        printer.printaFilep("урааа работает");

        SavedAtaBase repository = new SavedAtaBase();
        repository.savedataFile("order", 199);
        repository.savedataBD("ordeergerr", 1984849);
    }
}