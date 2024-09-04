public class Main {
    public static void main(String[] args) {
        double m = 10.5;
        double n = 10.45;
        printClosestToTen(m, n);
    }

    public static void printClosestToTen(double m, double n) {
        double distanceM = Math.abs(10.0 - m);
        double distanceN = Math.abs(10.0 - n);
        if (distanceM < distanceN) {
            System.out.println("Число " + m + " ближе к 10.");
        } else if (distanceN < distanceM) {
            System.out.println("Число " + n + " ближе к 10.");
        } else {
            System.out.println("Оба числа " + m + " и " + n + " равноудалены от 10.");
        }

    }
}
