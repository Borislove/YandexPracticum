/*public class Task7 {
    public static void main(String[] args) {
        int rowNumber = 7;
        System.out.println("Добро пожаловать на борт!");
        String utilities = "вода";
        String businessUtilities = "бизнес-ланч";
        if (rowNumber <= 5) {
            System.out.println(utilities + " и " + businessUtilities);
        }
        System.out.println("Вам доступны:");
        System.out.println(utilities);
    }
}*/

public class Task7 {
    public static void main(String[] args) {
        int rowNumber = 7;
        System.out.println("Добро пожаловать на борт!");
        String utilities = "вода";
        String businessUtilities = "бизнес-ланч";
        if (rowNumber <= 5) {
            utilities = " и " + businessUtilities;
        }
        System.out.println("Вам доступны:");
        System.out.println(utilities);
    }
}



/*Проверьте, является ли значение rowNumber меньше или равным пяти (<= 5),
 чтобы определить, что ряд относится к бизнес-классу.
Обновите значение переменной utilities, добавив к нему строку " и " и значение businessUtilities.
 Таким образом, в utilities будут содержаться оба набора преимуществ: "вода" и "бизнес-ланч".
Выведите значение utilities после условия if, чтобы отобразить доступные преимущества для пассажиров.
Запустите программу и проверьте, что выводится правильный список доступных преимуществ для различных значений rowNumber.*/