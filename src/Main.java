public class Main {
    //Эта часть проверяет високосный ли год
    public static void checkYear(short year) {
        if ((year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) && year > 1584) {
            System.out.println("Данный год является високосным.");
        } else if (year < 1584) {
            System.out.println("Этот год не может считаться високосным так как это понятие ввели в 1584 году.");
        } else {
            System.out.println("Данный год не является високосным.");
        }
    }

    //Тут проверяем операционную систему и год выпуска устройства
    public static void checkOSAndYear(byte clientOS, short clientDeviceYear) {
        if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для " + (clientOS == 1 ? "iOS" : "Android") + " по ссылке.");
        } else {
            System.out.println("Установите облегчённую версию приложения для " + (clientOS == 1 ? "iOS" : "Android") + " по ссылке.");
        }
    }


//Тут проверяем расстояние до клиента
public static void checkDistance(byte deliveryDistance) {
    var deliveryTime = 1;
    if (deliveryDistance > 100) {
        System.out.println("Доставка на такое расстояние не предусмотрена.");
        return;
    }

    if (deliveryDistance >= 60) {
        deliveryTime += 2;
    }

    if (deliveryDistance < 60 && deliveryDistance > 20) {
        deliveryTime += 1;
    }
    System.out.println("Потребуется дней: " + deliveryTime);
    }


public static void main(String[] args) {
    System.out.println("Задание 1");
    //Исследуемый год
    short year = 1900;
    checkYear(year);

    System.out.println("Задание 2");
    // 1 = iOS; 0 = android
    byte clientOS = 0;
    //Год выпуска устройства
    short clientDeviceYear = 2016;
    checkOSAndYear(clientOS, clientDeviceYear);

    System.out.println("Задание 3");
    //Расстояние до клиента в километрах
    byte deliveryDistance = 102;
    checkDistance(deliveryDistance);
}
}