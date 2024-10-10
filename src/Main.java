public class Main {
    //Эта часть проверяет високосный ли год
    public static void checkYear(short year) {
        if (year % 4 == 0 && year % 100 != 0 && year > 1584) {
            System.out.println("Данный год является високосным.");
        } else if (year % 400 == 0 && year > 1584) {
            System.out.println("Данный год является високосным.");
        } else if (year < 1584) {
            System.out.println("Этот год не может считаться високосным так как это понятие ввели в 1584 году.");
        } else {
            System.out.println("Данный год не является високосным.");
        }

    }

    //Тут проверяем операционную систему и год
    public static void checkOSAndYear(byte clientOS, short clientDeviceYear) {
        if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке.");
        } else {
            System.out.println("Ошибка. Неизвестная операционная система.");
        }
    }

    //Тут проверяем расстояние до клиента
    public static void checkDistance(byte deliveryDistance) {
        var deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + deliveryTime);
        } else if (deliveryDistance <= 60) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней " + deliveryTime);
        } else if (deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 1 + 1;
            System.out.println("Потребуется дней " + deliveryTime);
        } else {
            System.out.println("Доставка на такое расстояние не предусмотрена.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        //Исследуемый год
        short year = 996;
        checkYear(year);

        System.out.println("Задание 2");
        // 1 = iOS; 0 = android
        byte clientOS = 1;
        //Год выпуска устройства
        short clientDeviceYear = 2013;
        checkOSAndYear(clientOS, clientDeviceYear);

        System.out.println("Задание 3");
        //Расстояние до клиента в километрах
        byte deliveryDistance = 45;
        checkDistance(deliveryDistance);
    }
}