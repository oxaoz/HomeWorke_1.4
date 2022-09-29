public class Main {
    public static void main(String[] args) {

        // Задача N1
        System.out.println("Задача N1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляю, дружище, детсво кончилось!");
        }
        if (age < 18) {
            System.out.println("Поздравляю, друг, Ты ещЁ мал! Тебе повезло");
        }

        // Задача N2
        // мой вариант
        System.out.println("Задача N2");
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
        if (peopleAge >=24) {
            System.out.println("Началась взрослая жизнь, пора искать работу");
        }
        if (peopleAge < 24) {
            System.out.println("Человек уще учится в универе, еще рано искать работу");
        }

        // Вариант из проверочного видео
        if (personAge >= 7 && personAge < 18){
            System.out.println("Ребенок ходит в школу");
        }
        if (personAge >= 18 && personAge < 24) {
            System.out.println("Студенческие годы");
        }
        if (personAge >= 24) {
            System.out.println("Универ за плечами, трудовые будни");
        }

        // Задача N3
        System.out.println("Задача N3");
        int wagonCapacity = 102;
        int seatPlace = 60;
        int standingPlace = wagonCapacity - seatPlace; // стоячих мест

        int seatUsed = 60;
        int standingUsed = 35;

        if (seatUsed<seatPlace) {
            System.out.println("Свободно " + (seatPlace - seatUsed) + " Сидячих мест ");
        }
        if (standingUsed<standingPlace){
                System.out.println("Свободно " + (standingPlace - standingUsed) + " Стоячих мест ");
        }
        if (seatPlace==seatUsed){
            System.out.println("Сидячих мест нет");
        }
        if (standingPlace==standingUsed){
            System.out.println("Стоячих мест нет");
        }
    }
}