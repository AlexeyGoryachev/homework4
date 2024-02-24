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
        } else if (age2 >= 7 && age2 <= 17) {
            System.out.println("если возраст человека " + age2 + ", то надо ходить в школу.");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("если возраст человека " + age2 + ", то надо ходить в университет.");
        } else if (age2 > 24) {
            System.out.println("если возраст человека " + age2 + ", то надо ходить на работу.");
        } else {
            System.out.println("в столь юном возрасте, никуда ходить не надо.");
        }
        int age3 = 99;
        if (age3 < 5) {
            System.out.println("в возрасте " + age3 + " лет, еще нельзя кататься на аттракционе.");
        } else if (age3 >= 5 && age3 <= 14) {
            System.out.println("в возрасте " + age3 + " лет ребёнок может кататься на аттракционе, только в сопровождении взрослого");
        } else {
            System.out.println("в возрасте " + age3 + " лет, человек может кататься без сопровождения взрослого");
        }
        System.out.println("Task 6.");
        System.out.println("Задача 6");
        int totalPlaces = 102;
        int sitPlaces = 60;
        int stand = totalPlaces - sitPlaces;
        System.out.println("Сколько людей по вашим подсчетам на данный момент в вагоне?: ");
        int available;
        int totalPassengers = 99;
        if (totalPassengers > totalPlaces) {
            System.out.println("Свободных мест не хватает");
        } else if (totalPassengers == totalPlaces) {
            System.out.println("Вагон заполнен");
        } else if (totalPassengers < totalPlaces && totalPassengers >= sitPlaces) {
            available = totalPlaces - totalPassengers;
            System.out.println("Свободных сидячих мест нет. " + available + " мест доступно для продолжения пути стоя");
        } else if (totalPassengers < sitPlaces) {
            available = sitPlaces - totalPassengers;
            System.out.println("Доступно " + available + " сидячих мест и " + stand + " мест для продолжения пути стоя");
        }
    }
}

