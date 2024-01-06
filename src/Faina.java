/*Опишите цикл, в котором переменная итерирования line отвечает за строки и принимает значения от 1 до 10.
Используя if - else if:
Для строк 3 и 9 выведите текст "Файна-на".
Для строк 4 и 10 выведите текст "Фаина Файна-на".
Для всех остальных случаев выведите строку "Фаина Фаина".
В конце, за пределами цикла, выведите финальную строку — "Ах люблю тебя, Фаина-Фаина".*/
public class Faina {
    public static void main(String[] args) {
        String doubleFaina = "Фаина Фаина";
        String fainaNa = "Файна-на";
        String fainaFainaNa = "Фаина Файна-на";

        for (int line = 1; line <= 10; ) { // объявите цикл с переменной line от 1 до 10.
            // напишите if...else if согласно условию, используя переменные в начале программы
            if (line == 3) {
                System.out.println("Файна-на");
            } else if (line == 9) {
                System.out.println("Файна-на");
            } else if (line == 4) {
                System.out.println("Фаина Файна-на");
            } else if (line == 10) {
                System.out.println("Фаина Файна-на");
            } else
                System.out.println("Фаина Фаина");
            line++;
        }
        // выведите финальную строку
        System.out.println("Ах люблю тебя, Фаина-Фаина");
    }
}

