import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Введи \"Тренировка\" для начала");
            String startMessage = sc.next();
            if (startMessage.trim().equalsIgnoreCase("тренировка")) {
                break;
            }
        }
        System.out.println("Введите свой вес");
        double weight = sc.nextDouble();
        showWelcome();

        int fitnessLevel = 0;
        String[] inventory = {"Бутылка воды", "Полотенце", "Перчатки", "Плеер", "Пустая шейкер-бутылка"};
        boolean exitFlag = false;
        boolean foundSupplement = false;

        while (!exitFlag) {
            System.out.println("\nЧто будем делать дальше?");
            System.out.println("1. Раздевалка (инвентарь)");
            System.out.println("2. Кардио-зона");
            System.out.println("3. Силовая зона");
            System.out.println("3. Зона растяжки");
            System.out.println("4. Бар питания");
            System.out.println("0. Выйти из зала");
            System.out.print("\nВыберите вариант: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showLockerRoom(inventory, weight);
                    break;
                case 2:
                    double lastWeight = weight;
                    weight = cardioZone(sc, weight, foundSupplement);
                    if (weight < lastWeight && (lastWeight - weight) > 0.5) {
                        inventory[4] = "Протеиновый коктейль";
                        foundSupplement = true;
                    }
                    break;
                case 3:
                    fitnessLevel = strengthZone(sc, fitnessLevel);
                    break;
                case 4:
                    stretchingZone(sc);
                    break;
                case 5:
                    nutritionBar(sc);
                    break;
                case 0:
                    System.out.println("\nУже уходишь?");
                    System.out.println("1. Да, сегодня достаточно       2. Нет, продолжу");
                    int answer1 = sc.nextInt();
                    if (answer1 == 1) {
                        System.out.println("Точно? Может еще один подход?");
                        System.out.println("1. Точно, хватит на сегодня       2. Ладно, еще немного");
                        int answer2 = sc.nextInt();
                        if (answer2 == 1) {
                            exitFlag = true;
                            System.out.println("Отличная тренировка! До завтра!");
                        }
                    }
                    break;
                default:
                    System.out.println("Такого варианта нет, выбери из списка!");
            }
        }
        sc.close();
    }

    public static void showWelcome() {
        System.out.println("\nДОБРО ПОЖАЛОВАТЬ В ФИТНЕС-КЛУБ!");
        System.out.println("\nТвой путь к идеальному телу начинается здесь!");
        System.out.println("\nПомни: No pain, no gain!");
    }

    public static void showLockerRoom(String[] inv, double w) {
        System.out.println("\n   РАЗДЕВАЛКА");
        System.out.println("Твой инвентарь:");
        for (int i = 0; i < inv.length; i++) {
            System.out.println((i + 1) + ". " + inv[i]);
        }
        System.out.println("Твой вес: " + w + " кг");
    }

    public static double cardioZone(Scanner sc, double w, boolean foundSupplement) {
        System.out.println("\n   КАРДИО-ЗОНА");
        double currentWeight = w;

        String[] cardioMachines = {"Беговая дорожка", "Эллипс", "Велотренажер", "Степпер", "Гребной тренажер"};

        for (int i = 0; i < 3; i++) {
            System.out.println("\nВыбери тренажер для кардио (10 минут):");
            System.out.println("1. " + cardioMachines[0] + " (-0.3 кг)");
            System.out.println("2. " + cardioMachines[1] + " (-0.2 кг)");
            System.out.println("3. " + cardioMachines[2] + " (-0.25 кг)");
            System.out.println("4. " + cardioMachines[3] + " (-0.35 кг)");
            System.out.println("5. " + cardioMachines[4] + " (-0.4 кг)");

            int machineChoice = sc.nextInt();
            double weightLoss = 0;

            switch (machineChoice) {
                case 1: weightLoss = 0.3; break;
                case 2: weightLoss = 0.2; break;
                case 3: weightLoss = 0.25; break;
                case 4: weightLoss = 0.35; break;
                case 5: weightLoss = 0.4; break;
                default: weightLoss = 0.1;
            }

            currentWeight -= weightLoss;
            System.out.println("Отлично! Сожжено " + (weightLoss * 1000) + " калорий");
            System.out.println("Текущий вес: " + String.format("%.1f", currentWeight) + " кг");

            if (i < 2) {
                System.out.println("\nПродолжить кардио?");
                System.out.println("1. Да, еще подход       2. Нет, хватит");
                int answer = sc.nextInt();
                if (answer == 2) {
                    return currentWeight;
                }
            }
        }

        if (!foundSupplement && currentWeight < w) {
            System.out.println("\nОтличная работа! Тренер похвалил тебя и дал протеиновый коктейль!");
        }

        return currentWeight;
    }

    public static int strengthZone(Scanner sc, int lvl) {
        System.out.println("\n   СИЛОВАЯ ЗОНА");

        if (lvl == 0) {
            System.out.println("Тренер: Для работы со свободными весами нужно знать пароль!");
            System.out.println("Тренер: Подсказка: 'мотивирующая фраза в начале'");
            sc.nextLine(); // Очистка буфера
            String password = sc.nextLine();
            if (password.matches("[A-Z][a-z]+ [a-z]+, [a-z]+ [a-z]+[0-9]{3}!")){
                System.out.println("Тренер: Верно! Добро пожаловать в мир железа!");
                lvl = 1;
            } else {
                System.out.println("Тренер: Неверно! Иди на кардио!");
                return lvl;
            }
        }

        if (lvl >= 1) {
            System.out.println("\nВыбери группу мышц для тренировки:");
            System.out.println("1. Грудь (+1 к силе)");
            System.out.println("2. Спина (+1 к силе)");
            System.out.println("3. Ноги (+2 к силе)");
            System.out.println("4. Руки (+1 к силе)");
            System.out.println("5. Плечи (+1 к силе)");

            int muscleChoice = sc.nextInt();
            int strengthGain = 0;

            switch (muscleChoice) {
                case 1:
                    System.out.println("Выполняем жим лежа: 3x10");
                    strengthGain = 1;
                    break;
                case 2:
                    System.out.println("Выполняем тягу штанги: 3x10");
                    strengthGain = 1;
                    break;
                case 3:
                    System.out.println("Выполняем приседания: 4x8");
                    strengthGain = 2;
                    break;
                case 4:
                    System.out.println("Выполняем подъемы на бицепс: 3x12");
                    strengthGain = 1;
                    break;
                case 5:
                    System.out.println("Выполняем жим над головой: 3x10");
                    strengthGain = 1;
                    break;
            }

            lvl += strengthGain;
            System.out.println("Отличная работа! Уровень силы: " + lvl);
        }

        return lvl;
    }

    public static void stretchingZone(Scanner sc) {
        System.out.println("\n   ЗОНА РАСТЯЖКИ");
        System.out.println("Расслабляем мышцы после тренировки...");

        String[] stretches = {
                "Наклоны вперед (30 сек)",
                "Растяжка квадрицепсов (30 сек на каждую ногу)",
                "Бабочка (30 сек)",
                "Растяжка трицепсов (30 сек на каждую руку)",
                "Наклоны в стороны (30 сек)"
        };

        for (int i = 0; i < stretches.length; i++) {
            System.out.println((i + 1) + ". " + stretches[i]);
            if (i < stretches.length - 1) {
                System.out.println("Следующее упражнение?");
                System.out.println("1. Продолжить       2. Закончить");
                int answer = sc.nextInt();
                if (answer == 2) {
                    break;
                }
            }
        }

        System.out.println("Отличная растяжка! Гибкость улучшена!");
    }

    public static void nutritionBar(Scanner sc) {
        System.out.println("\n=== БАР ПИТАНИЯ ===");
        System.out.println("Меню:");
        System.out.println("1. Протеиновый коктейль (+0.5 кг, +1 к силе)");
        System.out.println("2. Энергетический батончик (+0.2 кг)");
        System.out.println("3. Вода (бесплатно)");
        System.out.println("0. Назад");

        System.out.print("\nВыбери напиток: ");
        int drink = sc.nextInt();

        switch (drink) {
            case 1:
                System.out.println("Отличный выбор! Протеин поможет мышцам расти!");
                break;
            case 2:
                System.out.println("Энергия для следующей тренировки!");
                break;
            case 3:
                System.out.println("Вода - основа жизни! Не забывай пить!");
                break;
            default:
                System.out.println("Возвращаемся в зал...");
        }
    }
}
