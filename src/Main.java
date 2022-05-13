public class Main {
    //Задание 2.
    public static void clientYearOs(int clieanOSs, int yearr) {
        if (clieanOSs <= 0 && yearr >= 2015) {
            System.out.println("Установите версию приложения для IOS ");
        } else if (clieanOSs <= 0 && yearr < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS");
        } else if (clieanOSs >= 1 && yearr >= 2015) {
            System.out.println("Установите версию приложения для Android");
        } else if (clieanOSs >= 1 && yearr < 2015) {
            System.out.println("Установите облегченную версию приложения для Android");
        }
    }

    public static void methodLeapYear(int methodY) {
        if (methodY % 4 == 0 && methodY % 100 != 0 || methodY % 400 == 0) {
            System.out.println(methodY + " год является високосным");
        } else {
            System.out.println(methodY + " год не является високосным");
        }
    }
    public static void delivery1(int deliveryDistance2,int deliveryDay2 ) {
        if (deliveryDistance2 > 20)
        { deliveryDay2++;
        }
        if (deliveryDistance2 > 60 ){
            deliveryDay2++;}
        if (deliveryDistance2 >= 100)
            deliveryDay2++; {

            System.out.println("Потребуется дней: " + deliveryDay2);
        }
    }

    public static void main(String[] args) {
        int clientOS = 1;
        int year = 2015;
        clientYearOs(clientOS, year);

        // Задание 1.

        int leapYear = 2020;
        methodLeapYear(leapYear);

        //Задание 3.
        byte deliveryDistance = 95;
        byte deliveryDay = 1;
        delivery1(deliveryDistance,deliveryDay);
    }
}