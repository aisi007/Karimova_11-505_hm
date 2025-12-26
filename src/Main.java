import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Проверка палиндрома
        System.out.println("1. Проверка палиндрома:");
        String polindroma = sc.nextLine();
        System.out.println("   'А роза упала на лапу Азора': " + isPalindrome("А роза упала на лапу Азора"));
        System.out.println("   'madam': " + isPalindrome("madam"));
        System.out.println("   'hello': " + isPalindrome("hello"));
        System.out.println("   " + polindroma + " " + isPalindrome(polindroma));

        // 2. Удаление повторяющихся символов
        System.out.println("\n2. Удаление повторяющихся символов:");
        String p = sc.nextLine();
        System.out.println("   Строка: \"" + "программирование" + "\"");
        System.out.println("   Результат: \"" + removeDuplicates("программирование") + "\"");
        System.out.println("   Результат: \"" + removeDuplicates(p) + "\"");

        // 3. Первый неповторяющийся символ
        System.out.println("\n3. Первый неповторяющийся символ:");
        String d = sc.nextLine();
        String test3 = "swiss";
        System.out.println("   Строка: \"" + test3 + "\"");
        System.out.println("   Результат: '" + firstUniqueChar(test3) + "'");
        System.out.println("   Результат: '" + firstUniqueChar(d) + "'");

        // 4. Замена 'a' на '@'
        System.out.println("\n4. Замена 'a' на '@':");
        String pp1 = sc.nextLine();
        String test4 = "Java is amazing";
        System.out.println("   Строка: \"" + test4 + "\"");
        System.out.println("   Результат: \"" + replaceAWithAt(test4) + "\"");
        System.out.println("   Результат: \"" + replaceAWithAt(pp1) + "\"");

        // 5. Подсчет слов
        System.out.println("\n5. Подсчет слов в предложении:");
        String dd1 = sc.nextLine();
        String test5 = "   Java   is   a   programming   language   ";
        System.out.println("   Строка: \"" + test5 + "\"");
        System.out.println("   Количество слов: " + countWords(test5));
        System.out.println("   Количество слов: " + countWords(dd1));

        // 6. Сравнение строк без учета регистра
        System.out.println("\n6. Сравнение строк без учета регистра:");
        String g = sc.nextLine();
        String h = sc.nextLine();
        String test6_1 = "Hello";
        String test6_2 = "HELLO";
        System.out.println("   Строки: \"" + test6_1 + "\" и \"" + test6_2 + "\"");
        System.out.println("   Равны? " + equalsIgnoreCase(test6_1, test6_2));
        System.out.println("   Равны? " + equalsIgnoreCase(g, h));

        // 7. Проверка формата телефона
        System.out.println("\n7. Проверка формата телефона:");
        String gg1 = sc.nextLine();
        String test7_1 = "+7 (999) 123-45-67";
        String test7_2 = "89991234567";
        String test7_3 = "1234567";
        System.out.println("   '" + test7_1 + "': " + isValidPhone(test7_1));
        System.out.println("   '" + test7_2 + "': " + isValidPhone(test7_2));
        System.out.println("   '" + test7_3 + "': " + isValidPhone(test7_3));
        System.out.println("   '" + gg1 + "': " + isValidPhone(gg1));

        // 8. Поиск чисел в тексте
        System.out.println("\n8. Поиск чисел в тексте:");
        String a = sc.nextLine();
        String test8 = "Цена: 1500 руб., вес: 2.5 кг, температура: -3.7°C";
        System.out.println("   Текст: \"" + test8 + "\"");
        System.out.print("   Числа: ");
        findNumbers(test8);
        findNumbers(a);

        // 9. Замена множественных пробелов
        System.out.println("\n9. Замена множественных пробелов:");
        String aa1 = sc.nextLine();
        String test9 = "Это   текст   с    лишними   пробелами";
        System.out.println("   До: \"" + test9 + "\"");
        System.out.println("   После: \"" + normalizeSpaces(test9) + "\"");
        System.out.println("   После: \"" + normalizeSpaces(aa1) + "\"");

        // 10. Валидация email
        System.out.println("\n10. Валидация email:");
        String z = sc.nextLine();
        String test10_1 = "user@example.com";
        String test10_2 = "invalid.email@";
        System.out.println("   '" + test10_1 + "': " + isValidEmail(test10_1));
        System.out.println("   '" + test10_2 + "': " + isValidEmail(test10_2));
        System.out.println("   '" + z + "': " + isValidEmail(z));

        // 11. Форматирование цены
        System.out.println("\n11. Форматирование цены:");
        String zz1 = sc.nextLine();
        double zz2 = sc.nextDouble();
        String productName = "Ноутбук";
        double price = 54999.999;
        System.out.println("   Товар: " + productName + ", Цена: " + price);
        System.out.println("   Результат: " + formatProductInfo(productName, price));
        System.out.println("   Результат: " + formatProductInfo(zz1, zz2));

        // 12. Объединение массива строк
        System.out.println("\n12. Объединение массива строк:");
        String[] test12 = {"Яблоко", "Банан", "Апельсин", "Груша"};
        System.out.println("   Массив: " + Arrays.toString(test12));
        System.out.println("   Результат: \"" + joinStrings(test12) + "\"");
    }

    // 1. Метод проверки палиндрома
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // 2. Метод удаления повторяющихся символов
    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == currentChar) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    // 3. Метод поиска первого неповторяющегося символа
    public static char firstUniqueChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                return currentChar;
            }
        }
        return ' ';
    }

    // 4. Метод замены 'a' на '@'
    public static String replaceAWithAt(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == 'a' || currentChar == 'A') {
                result.append('@');
            } else {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    // 5. Метод подсчета слов
    public static int countWords(String sentence) {

        String trimmed = sentence.trim();


        if (trimmed.isEmpty()) {
            return 0;
        }


        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < trimmed.length(); i++) {
            if (trimmed.charAt(i) != ' ') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        return wordCount;
    }

    // 6. Метод сравнения строк без учета регистра
    public static boolean equalsIgnoreCase(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }


        for (int i = 0; i < str1.length(); i++) {
            char c1 = Character.toLowerCase(str1.charAt(i));
            char c2 = Character.toLowerCase(str2.charAt(i));

            if (c1 != c2) {
                return false;
            }
        }

        return true;
    }

    // 7. Метод проверки формата телефона
    public static boolean isValidPhone(String phone) {

        String pattern1 = "^\\+7\\s?\\(\\d{3}\\)\\s?\\d{3}-\\d{2}-\\d{2}$";

        String pattern2 = "^8\\d{10}$";

        return phone.matches(pattern1) || phone.matches(pattern2);
    }

    // 8. Метод поиска чисел в тексте
    public static void findNumbers(String text) {
        StringBuilder currentNumber = new StringBuilder();
        boolean hasDecimalPoint = false;
        boolean hasDigit = false;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (Character.isDigit(currentChar)) {
                currentNumber.append(currentChar);
                hasDigit = true;
            } else if (currentChar == '.' && hasDigit && !hasDecimalPoint) {
                currentNumber.append(currentChar);
                hasDecimalPoint = true;
            } else if (currentChar == '-' && !hasDigit) {
                currentNumber.append(currentChar);
            } else {
                if (hasDigit) {
                    System.out.print(currentNumber.toString() + " ");
                    currentNumber.setLength(0);
                    hasDigit = false;
                    hasDecimalPoint = false;
                }
            }
        }


        if (hasDigit) {
            System.out.print(currentNumber.toString());
        }
        System.out.println();
    }

    // 9. Метод замены множественных пробелов
    public static String normalizeSpaces(String text) {
        StringBuilder result = new StringBuilder();
        boolean lastWasSpace = false;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (currentChar == ' ') {
                if (!lastWasSpace) {
                    result.append(' ');
                    lastWasSpace = true;
                }
            } else {
                result.append(currentChar);
                lastWasSpace = false;
            }
        }

        return result.toString().trim();
    }

    // 10. Метод валидации email
    public static boolean isValidEmail(String email) {
        String pattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return email.matches(pattern);
    }

    // 11. Метод форматирования информации о товаре
    public static String formatProductInfo(String name, double price) {
        String formattedPrice = String.format("%.2f", price);

        return "Товар: " + name + ", Цена: " + formattedPrice + " руб.";
    }

    // 12. Метод объединения массива строк
    public static String joinStrings(String[] strings) {
        if (strings.length == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder(strings[0]);

        for (int i = 1; i < strings.length; i++) {
            result.append("; ").append(strings[i]);
        }
        return result.toString();
    }
}
