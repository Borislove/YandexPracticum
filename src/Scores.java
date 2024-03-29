//
/*Для участия в программе лояльности зоомагазина можно выбрать один из двух тарифов:
Ежедневные начисления начинаются с 1 балла, но каждый день доход увеличивается вдвое.
Начисления начинаются со 100 баллов, каждый день доход увеличивается также на 100 баллов.
Мечта Пикселя — телевизор за 40 000 баллов. Помогите ему написать программу,
 которая бы отображала состояние счёта каждый день для каждого из вариантов и итог — на какой день будет достигнута нужная сумма.*/


public class Scores {
    public static void main(String[] args) {
        int targetAmount = 40000; // нужно накопить

        int day = 1; // переменная для подсчёта количества дней
        int dailyMoney = 1; // переменная, показывающая ежедневные поступления
        for (int money = 0; dailyMoney <= 40000; money++) { // условие для цикла, переменную итерирования назовите money

            System.out.println("День " + day + ". На счету " + dailyMoney);
            // правила изменения дня и ежедневных поступлений
            dailyMoney = dailyMoney * 2;
            dailyMoney++;
            day++;
        }
        System.out.println("В варианте I на " + day + "-й день будет достигнута нужная сумма.");

        day = 1;
        dailyMoney = 100;
        // не забудьте обновить значения переменных day и dailyMoney
        for (int money = 0; dailyMoney <= 40000; money++) { // условие для цикла. Переменную итерирования назовите money
            System.out.println("День " + day + ". На счету " + dailyMoney);
            // правила изменения дня и ежедневных поступлений
            dailyMoney = dailyMoney + 100 + day * 100;
            day++;

        }
        System.out.println("В варианте II на " + day + "-й день будет достигнута нужная сумма.");
    }
}
