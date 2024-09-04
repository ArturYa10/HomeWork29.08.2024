import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя два числа
        System.out.print("Введите число m: ");
        double m = scanner.nextDouble();

        System.out.print("Введите число n: ");
        double n = scanner.nextDouble();

        // Вызываем метод для определения ближайшего числа к 10
        double closest = findClosestToTen(m, n);

        // Выводим результат
        System.out.println("Ближайшее к 10: " + closest);

        scanner.close();
    }

    // Метод для нахождения числа, ближайшего к 10
    public static double findClosestToTen(double m, double n) {
        // Вычисляем абсолютные разности между числами и 10
        double distanceM = Math.abs(10 - m);
        double distanceN = Math.abs(10 - n);

        // Сравниваем разности и возвращаем ближайшее значение
        if (distanceM < distanceN) {
            return m;
        } else if (distanceN < distanceM) {
            return n;
        } else {
            // Если оба числа равноудалены от 10, можно вернуть любое (например, m)
            return m; // или return n;
        }
    }
}
