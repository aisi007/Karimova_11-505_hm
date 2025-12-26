package OCP;

public class OrderPrinterToFile implements PrinterBasic{
    public void printerr(String product, int amount){
        System.out.println("распечатан: " + product + ", распечатан: " + amount);
    }

}
