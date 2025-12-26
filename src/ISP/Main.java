package ISP;

public class Main {
    public static void main(String[] args) {
        Fly fly = new Fly();
        Sleep sleep = new Sleep();
        Eat eat = new Eat();
        fly.fly();
        sleep.sleepp();
        eat.eat();
    }
}