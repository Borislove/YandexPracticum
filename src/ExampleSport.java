/*Байт решил заняться спортом и просит вас помочь написать ему программу для тренировки в зале.
В тренировке должно быть пять кругов. На нечётных нужно отжиматься, на чётных — качать пресс,
 в конце каждого круга нужно бегать в колесе. В конце программа благодарит пользователя.
Результат вашей программы должен получиться таким:
Круг 1
Отжимаемся
Бегаем в колесе
Круг 2
Качаем пресс
Бегаем в колесе
Круг 3
Отжимаемся
Бегаем в колесе
Круг 4
Качаем пресс
Бегаем в колесе
Круг 5
Отжимаемся
Бегаем в колесе
Отлично позанимались сегодня! Вы молодец! */

public class ExampleSport {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            // в тренировке должно выполниться 5 кругов — напишите здесь цикл
            System.out.println("Круг " + i);
            // выполнение каждого круга зависит от условия — проверьте, является ли круг чётным
            // если да, то нужно качать пресс
            if (i % 2 == 0) System.out.println("Качаем пресс");
            else
                // иначе нужно отжаться
                System.out.println("Отжимаемся");

            // независимо от номера круга бегаем в колесе
            System.out.println("Бегаем в колесе");
        }
        System.out.println("Отлично позанимались сегодня! Вы молодец!");
    }
}
