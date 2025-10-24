import java.util.Scanner;

public class Calculator {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите имя:");
		String name = sc.nextLine();

		System.out.println("Введите операцию (+, -, *, /):");
		String operation = sc.nextLine();

		System.out.println("Введите первое число:");
		int firstnum = sc.nextInt();

		System.out.println("Введите второе число:");
		int secondnum = sc.nextInt();

		double res = 0;

		switch (operation) {
			case "+":
				res = firstnum + secondnum;
				break;
			case "-":
				res = firstnum - secondnum;
				break;
			case "*":
				res = firstnum * secondnum;
				break;
			case "/":
				if (secondnum == 0) {
					System.out.println("Делить на 0 нельзя");
					sc.close();
					return;
				} else {
					res = firstnum / secondnum;
				}
				break;
			default:
				System.out.println("друг, что ты наделал(");
				sc.close();
				return;
		}

		System.out.println( name + ", ваш результат:" + res);
		sc.close();





	}
} 