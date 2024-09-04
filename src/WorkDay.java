import java.util.Random;

public class WorkDay {
    public WorkDay() {
    }

    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(28801);
        System.out.println("Осталось " + n + " секунд");
        int hoursLeft = n / 3600;
        if (hoursLeft > 1) {
            System.out.println("Осталось " + hoursLeft + " часов");
        } else if (hoursLeft == 1) {
            System.out.println("Остался 1 час");
        } else {
            System.out.println("Осталось менее часа");
        }

    }
}
