/*
Вас попросили написать рекомендательную систему для умного холодильника ХОЛОД-3000.
 Холодильник анализирует оставшееся количество яиц и предлагает вариант для завтрака:
Если яиц больше трёх, отвечает: «Рекомендую приготовить омлет.».
Если меньше трёх, отвечает: «Рекомендую позавтракать бутербродами.».
В любом случае желает: «Приятного аппетита!».
Напишите программу, которая работает по заданному алгоритму.
 */
public class Task5 {
    public static void main(String[] args) {
        int numberOfEggs = 10;
        if (numberOfEggs > 3) {
            System.out.println("Рекомендую приготовить омлет.");
        } else{
            System.out.println("Рекомендую позавтракать бутербродами.");
        }
        System.out.println("Приятного аппетита!");
    }
}
