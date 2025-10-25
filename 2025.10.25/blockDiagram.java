import java.util.Scanner;

public class blockDiagram{
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("лежу на диване");
        toTheGym();
    }
    
    public static void toTheGym() {
        System.out.println("Пойдешь в зал? Напиши 1, если да или любое число,  если нет");
        int answer = scanner.nextInt();
        
        if (answer == 1) {
            System.out.println("Тогда вставай с дивана!");
            seasonTicket();
        } else {
            endss();
        }
    }
    
    public static void seasonTicket() {
        System.out.println("есть абонемент? Напиши 1, если да или любое число,  если нет");
        int answer = scanner.nextInt();        
        if (answer == 1) {
            System.out.println("все вещи собраны? Напиши 1, если да или любое число,  если нет");
            int thingsAnswer = scanner.nextInt();
            
            if (thingsAnswer == 1) {
                changeClothesAndGo();
            } else {
                gatherThings();
                changeClothesAndGo();
            }
        } else {
            System.out.println("ты купил абонемент");
            System.out.println("все вещи собраны? Напиши 1, если да или любое число,  если нет");
            int thingsAnswer = scanner.nextInt();
            
            if (thingsAnswer == 1) {
                changeClothesAndGo();
            } else {
                gatherThings();
                changeClothesAndGo();
            }
        }
    }
    
    public static void gatherThings() {
        System.out.println("собираю вещи:");
        System.out.println("взял кроссовки");
        System.out.println("взял бутылку и налил воду");
        System.out.println("зарядил телефон");
        System.out.println("взял телефон");
        System.out.println("взял перекус");
    }
    
    public static void changeClothesAndGo() {
        System.out.println("переоденься в подготовленную одежду");
        System.out.println("возьми сумку и всё необходимое");
        System.out.println("выйди из дома");
        System.out.println("доберись до зала пешком или на транспорте");
        System.out.println("начни тренировку");
        System.out.println("Тренировка началась! Молодец!");
    }
    
    public static void endss() {
        System.out.println("Вы не пошли в зал((((((((((((((((((((");
    }
}