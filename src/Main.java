public class Main {
    public static void main(String[] args) {

        // Зададание N1
        // Задача № 1
        System.out.println("Задание 1, Задача №1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляю, дружище, детсво кончилось!");
        }
        if (age < 18) {
            System.out.println("Поздравляю, друг, Ты ещЁ мал! Тебе повезло");
        }

        // Задача N2
        // мой вариант
        System.out.println("Задание 1, Задача №2");
        int childAge = 8;
        if (childAge >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        if (childAge < 7) {
            System.out.println("Ребенку рано в школу");
        }
        int personAge = 18;
        if (personAge >= 18) {
            System.out.println("Универ жет тебя! Полезных познаний!");
        }
        if (personAge < 18) {
            System.out.println("Надеюсь, ты не расстроился... Ты сможешь поступить в универ после окончания школы");
        }
        int peopleAge = 25;
        if (peopleAge >= 24) {
            System.out.println("Началась взрослая жизнь, пора искать работу");
        }
        if (peopleAge < 24) {
            System.out.println("Человек уще учится в универе, еще рано искать работу");
        }

        // Вариант из проверочного видео
        if (personAge >= 7 && personAge < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (personAge >= 18 && personAge < 24) {
            System.out.println("Студенческие годы");
        }
        if (personAge >= 24) {
            System.out.println("Универ за плечами, трудовые будни");
        }

        // Задача N3
        System.out.println("Задание 1, Задача №3");
        int wagonCapacity = 102;
        int seatPlace = 60;
        int standingPlace = wagonCapacity - seatPlace; // стоячих мест

        int seatUsed = 60;
        int standingUsed = 35;

        if (seatUsed < seatPlace) {
            System.out.println("Свободно " + (seatPlace - seatUsed) + " Сидячих мест ");
        }
        if (standingUsed < standingPlace) {
            System.out.println("Свободно " + (standingPlace - standingUsed) + " Стоячих мест ");
        }
        if (seatPlace == seatUsed) {
            System.out.println("Сидячих мест нет");
        }
        if (standingPlace == standingUsed) {
            System.out.println("Стоячих мест нет");
        }
        // Задание N2
        // Задача №1
        System.out.println("Задание 2, Задача №1");
        int personeAge = 35;
        if (personeAge >= 18) {
            System.out.println("Поздравляю, дружище, детсво кончилось!");
        } else {
            System.out.println("Поздравляю, друг, Ты ещЁ мал! Тебе повезло!");
        }

        // Задача N2
        System.out.println("Задание 2, Задача №2");
        if (personeAge >= 7 && personeAge < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (personeAge >= 18 && personeAge < 24) {
            System.out.println("Студенческие годы");
        } else if (personeAge >= 24) {
            System.out.println("Универ за плечами, трудовые будни");
        }

        // Задача N3
        System.out.println("Задание 2, Задача №3");
        int salunCapacity = 102;
        int seatCount = 60;
        int standingCount = salunCapacity - seatCount; // стоячих мест

        int seatUse = 60;
        int standingUse = 42;

        if (seatUse < seatCount) {
            System.out.println("Свободно " + (seatCount - seatUse) + " Сидячих мест ");
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (standingUse < standingCount) {
            System.out.println("Свободно " + (standingCount - standingUse) + " Стоячих мест ");
        } else {
            System.out.println("Стоячих мест нет");
        }

        // Задание 3
        // Задача №1
        System.out.println("Задание 3, Задача №3");

    }
}