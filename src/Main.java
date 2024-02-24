public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 4.");
        System.out.println("Task 1.");
        int age = 19;
        if (age >= 18) {
            System.out.println("Ваш возраст " + age + " - значит вы уже совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Ваш возраст" + age + " - значит вы еще не достигли совершеннолетия.");
        }
        age = 9;
        if (age >= 18) {
            System.out.println("Ваш возраст " + age + " - значит вы уже совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Ваш возраст" + age + " -значит вы еще не достигли совершеннолетия.");
        }
        System.out.println("Task 2.");
        int airTemperature = 0;
        if (airTemperature < 5) {
            System.out.println("на улице сегодня " + airTemperature + " градусов. Надо надеть шапку.");
        }
        if (airTemperature >= 5) {
            System.out.println("на улице сегодня " + airTemperature + " градусов. Можно не надевать шапку.");
        }
        airTemperature = 22;
        if (airTemperature < 5) {
            System.out.println("на улице сегодня " + airTemperature + " градусов. Надо надеть шапку.");
        }
        if (airTemperature >= 5) {
            System.out.println("на улице сегодня " + airTemperature + " градусов. Можно не надевать шапку.");
        }
        System.out.println("Task 3.");
        int speed = 255;
        if (speed <= 60) {
            System.out.println("Превышения скорости нет. Ваша скорость " + speed + " Км/ч.");
        } else {
            System.out.println(speed + " километров в час?! Привыкни к аппарату, не топи!");
        }
        speed = 55;
        if (speed <= 60) {
            System.out.println("Превышения скорости нет. Ваша скорость " + speed + " Км/ч.");
        } else {
            System.out.println(speed + " километров в час?! Привыкни к аппарату, не топи!");
        }
        System.out.println("Task 4.");
        int age2 = 1;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("если возраст человека " + age2 + ", то надо ходить в детский сад.");
        }
        if (age2 >= 7 && age2 <= 17) {
            System.out.println("если возраст человека " + age2 + ", то надо ходить в школу.");
        }
        if (age2 >= 18 && age2 <= 24) {
            System.out.println("если возраст человека " + age2 + ", то надо ходить в университет.");
        }
        if (age2 > 24) {
            System.out.println("если возраст человека " + age2 + ", то надо ходить на работу.");
        } else {
            System.out.println("если возраст человека " + age2 + " год, то ему еще никуда не надо ходить.");
        }

    }
}