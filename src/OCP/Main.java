package OCP;

import OCP.Order;
import OCP.OrderPrinterToFile;


public class Main {
    public static void main(String[] args) {
        Order order = new Order("Ноутбук", 2);
        OrderPrinterToFile printer = new OrderPrinterToFile();
        printer.printerr("карта", 4);
        OrderPrinterToBD bd = new OrderPrinterToBD();
        bd.printerr("jhflufufl", 85);

    }
}