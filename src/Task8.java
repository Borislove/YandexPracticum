/*Транспортная компания попросила вас разработать программу для расчёта стоимости билета по программе лояльности.
 Действуют следующие условия:
Для пассажиров меньше шести лет проезд бесплатный.
Для пассажиров 65 лет и старше стоимость проезда пять баллов, а в воскресенье — три балла.
Для всех остальных — в понедельник стоимость проезда восемь баллов, а обычная цена — десять баллов.
Составьте условное выражение, реализующее эту логику.*/
public class Task8 {
    public static void main(String[] args) {

        int age = 23;
        String dayOfWeek = "SATURDAY";

        int ticketPrice = 10; //default , init;

        // Логика по вычислению ticketPrice
        if (age < 6) {
            ticketPrice = 0;
        }
        if (age >= 65) {
            ticketPrice = 5;
            if (dayOfWeek.equals("SUNDAY")) ticketPrice = 3;
        } else {
            if (dayOfWeek.equals("MONDAY")) {
                ticketPrice = 8;
            } else {
                ticketPrice = 10;
                System.out.println("Цена билета составляет: " + ticketPrice);
            }
        }
        System.out.println("👀");
    }

}


