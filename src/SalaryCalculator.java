import java.util.Random;

public class SalaryCalculator {
    public static void main(String[] args) {
        // Создаем объект Random для генерации случайных чисел
        Random random = new Random();

        // Генерируем случайное количество секунд от 0 до 28800
        int n = random.nextInt(28801); // Верхняя граница exclusive, поэтому +1

        // Выводим количество секунд на табло
        System.out.println("На табло: " + n + " секунд");

        // Вызываем метод для вывода сообщения о количестве оставшихся часов
        printHoursLeft(n);
    }

    // Метод для вывода информации о количестве полных часов
    public static void printHoursLeft(int seconds) {
        // Вычисляем количество полных часов
        int hours = seconds / 3600;

        // В зависимости от количества часов выводим соответствующее сообщение
        if (hours > 1) {
            System.out.println("Осталось " + hours + " часов");
        } else if (hours == 1) {
            System.out.println("Остался 1 час");
        } else {
            System.out.println("Осталось менее часа");
        }
    }
}
