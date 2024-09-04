public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyRate = 10.0;
        int hoursWorked = 45;
        double weeklySalary = calculateWeeklySalary(hourlyRate, hoursWorked);
        if (weeklySalary != -1.0) {
            System.out.println("Недельная зарплата: $" + weeklySalary);
        }

    }

    public static double calculateWeeklySalary(double hourlyRate, int hoursWorked) {
        if (hourlyRate < 8.0) {
            System.out.println("Ошибка: зарплата не может быть меньше 8 долларов в час.");
            return -1.0;
        } else if (hoursWorked > 60) {
            System.out.println("Ошибка: работник не может работать больше 60 часов в неделю.");
            return -1.0;
        } else {
            double regularHours = (double)Math.min(hoursWorked, 40);
            double overtimeHours = (double)Math.max(0, hoursWorked - 40);
            double regularPay = regularHours * hourlyRate;
            double overtimePay = overtimeHours * hourlyRate * 1.5;
            return regularPay + overtimePay;
        }
    }
}
