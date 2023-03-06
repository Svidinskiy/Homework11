import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkYear(int year)
    {
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (leapYear) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
    public  static  void task1 () {
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        checkYear(year);

        System.out.println("\n");
    }

    public static void checkPhone(int clientOS, int clientDeviceYear)
    {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0){
            if (clientDeviceYear < currentYear) System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1){
            if (clientDeviceYear < currentYear) System.out.println("Установите облегченную версию приложения для Android по ссылке");
            else System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите тип своей ОС (0 — iOS, 1 — Android): ");
        int clientOS = scanner.nextInt();
        System.out.print("Укажите год выпуска вашего телефона: ");
        int clientDeviceYear = scanner.nextInt();
        checkPhone(clientOS, clientDeviceYear);

        System.out.println("\n");
    }

    public static int checkDelivery(int deliveryDistance)
    {
        int days = 1;
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            days += 1;
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            days += 2;
        }
        return days;
    }
    public  static void checkDistance(int deliveryDistance)
    {
        if (deliveryDistance > 100)
            System.out.println("Доставка не осуществляется");
        else{
            int totalDays = checkDelivery(deliveryDistance);
            System.out.println("Потребуется дней: " + totalDays);
        }
    }
    public  static void task3 () {
        System.out.println("Задача 3");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите расстояние от офиса банка до адреса доставки: ");
        int deliveryDistance = scanner.nextInt();
        checkDistance(deliveryDistance);
        System.out.println("\n");
    }
}