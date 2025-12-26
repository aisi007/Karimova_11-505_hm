package SRP;

public class SavedAtaBase {
    public void savedataFile(String product, int amount){
        System.out.println("сохранен: " + product + ", сохранен: " + amount);
    }
    public void savedataBD(String product, int amount){
        System.out.println("сохранен в бд: " + product + ", сохранен в бд: " + amount);
    }
}
