import java.util.Scanner;

public class WorkDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод зарплаты в час
        System.out.print("Введите зарплату в час (не менее 8 долларов): ");
        double hourlyRate = scanner.nextDouble();

        // Ввод количества проработанных часов
        System.out.print("Введите количество проработанных часов (не более 60): ");
        int hoursWorked = scanner.nextInt();

        // Расчёт и вывод недельной зарплаты
        double weeklySalary = calculateWeeklySalary(hourlyRate, hoursWorked);
        System.out.println("Зарплата за неделю: $" + weeklySalary);

        scanner.close();
    }

    // Метод для расчета недельной зарплаты
    public static double calculateWeeklySalary(double hourlyRate, int hoursWorked) {
        // Проверка на минимальную ставку и максимальное количество часов
        if (hourlyRate < 8) {
            System.out.println("Ошибка: зарплата не может быть меньше 8 долларов в час.");
            return 0;
        }
        if (hoursWorked > 60) {
            System.out.println("Ошибка: количество часов не может превышать 60 в неделю.");
            return 0;
        }

        double salary;

        // Оплата до 40 часов по стандартной ставке
        if (hoursWorked <= 40) {
            salary = hoursWorked * hourlyRate;
        } else {
            // Оплата первых 40 часов по стандартной ставке и сверхурочных по полуторной
            int regularHours = 40;
            int overtimeHours = hoursWorked - regularHours;
            salary = (regularHours * hourlyRate) + (overtimeHours * hourlyRate * 1.5);
        }

        return salary;
    }
}
