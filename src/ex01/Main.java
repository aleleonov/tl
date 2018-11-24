package ex01;


import java.util.Scanner;

/**
 * Программа вычисляет какой свет на светофоре после прошествия
 * заданного временного интервала.
 */


public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        insertTime(trafficLight);
    }

    private static void insertTime(TrafficLight trafficLight) {  // ввод - вывод
        Scanner scanner = new Scanner(System.in);
        int timeInterval;
        System.out.println("Введите временной интервал в секундах - цифрой:");

        while (true) {
            if (scanner.hasNextInt()) {
                timeInterval = scanner.nextInt();
                if (timeInterval < 0 || (timeInterval > Integer.MAX_VALUE)) {
                    System.out.println("Ввод некорректен. Просим повторить введение времени, с");
                } else {
                    System.out.printf("На светофоре горит %s свет!", trafficLight.color(timeInterval));
                    break;
                }
            } else {
                System.out.println("Ввод некорректен. Просим повторить введение времени, с");
                scanner.nextLine();
            }
        }
    }


}

