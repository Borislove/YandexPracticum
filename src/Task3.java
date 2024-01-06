/*
В небольшом тесте по математике было три вопроса. Напишите короткую программу,
которая выводит на экран результат проверки студента.
Ответы студента сохранены в переменных answer1, answer2 и answer3.
В первом вопросе правильный ответ — «2».
Во втором — любой, кроме «4».
В третьем — «1».
Сравните каждый из ответов студента с правильным, выводя true или false.
Например, если на первый вопрос был дан правильный ответ, нужно вывести:
Результат проверки вопроса 1:
 */
public class Task3 {

    public static void main(String[] args) {

        int answer1 = 3; // Ответ на 1 вопрос
        int answer2 = 4; // Ответ на 2 вопрос
        int answer3 = 1; // Ответ на 3 вопрос

        System.out.println("Результат проверки вопроса 1:");
        System.out.println(answer1 == 2);
        System.out.println("Результат проверки вопроса 2:");
        System.out.println(answer2 != 4);
        System.out.println("Результат проверки вопроса 3:");
        System.out.println(answer3 == 1);
    }
}