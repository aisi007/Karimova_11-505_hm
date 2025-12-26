import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        int[] age = new int[5];
        String[] profs = new String[5];
        String[] lessons = new String[5];
        String[] emails = new String[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("Пользователь " + (i + 1));

            System.out.print("Введите почту: ");
            emails[i] = sc.nextLine();

            System.out.print("Введите имя: ");
            names[i] = sc.nextLine();

            System.out.print("Введите возраст: ");
            age[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Введите профессию: ");
            profs[i] = sc.nextLine();

            System.out.print("Введите предмет: ");
            lessons[i] = sc.nextLine();

            System.out.println();
        }


        String n = names[0];
        for (int i = 0; i < 5; i++){
         	if (names[i].length() > n.length()){
         		n = names[i];
         	}
        }
        int m = 0;
        for (int i  = 0; i < 5; i++){
         	m += age[i];
        }
        double averageAge = (double) m / 5;

        System.out.println("1. Имена пользователей из почт:");
        for (int i = 0; i < 5; i++) {
            String email = emails[i];
            int atIndex = email.indexOf('@');
            if (atIndex != -1) {
                String username = email.substring(0, atIndex);
                System.out.println("   " + names[i] + " -> " + username);
            } else {
                System.out.println("   " + names[i] + " -> некорректный email");
            }
        }

        System.out.println("2. Список предметов:");
        for (int i = 0; i < 5; i++) {
            System.out.println("   " + (i + 1) + ". " + lessons[i]);
        }

        System.out.println("3. Список профессий:");
        for (int i = 0; i < 5; i++) {
            System.out.println("   " + (i + 1) + ". " + profs[i] + " (возраст: " + age[i] + ")");
        }

        System.out.println("4. Средний возраст: " + averageAge);
        System.out.println("5. Самое длинное имя: " + n);

    }
}