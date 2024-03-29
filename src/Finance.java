import java.io.LineNumberReader;

/*Как будет работать новая функциональность.
Пользователю предоставляется возможность выбрать валюту из следующего списка: рубли, доллары, евро или юани.
Если пользователь вводит некорректный номер валюты, программа автоматически устанавливает валюту по умолчанию (рубли) и производит расчёты на основе этой валюты.
Пользователь вводит начальную сумму в выбранной валюте.
Пользователь указывает количество лет для расчёта.
Программа рассчитывает и выводит итоговую сумму по окончании указанного периода, учитывая сложный процент.
Через каждые три года начисляется бонус — сумма увеличивается на 1%.
Если выбрана валюта, отличная от рублей, программа также переводит итоговую сумму в рубли.
В конце программа выводит сообщение о завершении работы.*/

/*
💡 Как считать доход по вкладу
        Имеющаяся сумма каждый год увеличивается на процентную ставку.
        Общая формула: [сумма на начало года] + [сумма на начало года] * [процентная ставка] = [сумма на конец года].
        Процентную ставку можно считать как [количество процентов] / 100.
        Например:
        Если в начале первого года было 1000 рублей, а процентная ставка — 3%, то в конце первого года станет: 1000+1000*(3 / 100) = 1030 рублей.
        В начале второго года было 1030 рублей, тогда в конце второго года станет: 1030 + 1030 * (3 / 100) = 1060.9 рубля. И так далее по количеству лет, на которые открыт вклад.
 */


/*Вот ещё несколько моментов, которые стоит учесть.
Если пользователь вводит некорректный номер валюты, должно выводиться сообщение:
Ошибка: выбрана некорректная валюта. Валюта по умолчанию — рубли.. Расчёты должны производиться так, будто выбраны рубли.
Вывод итоговой суммы должен быть в формате: К окончанию срока сумма составит: [итоговая сумма] [аббревиатура валюты].
 Например: К окончанию срока сумма составит: 1030 USD.
Вывод перевода в рубли должен быть в формате: В рублях это будет: [сумма в рублях] руб.. Например: В рублях это будет: 80000 руб..
Практикум
Также вы можете использовать переменные exchangeRate, interestRate и currencySymbol.*/

/*Посчитайте количество лет для расчёта с помощью NumberReader.getInteger(). Сохраните результат в переменную years типа int.
Используя цикл for, выполните расчёт итоговой суммы на основе процентной ставки и количества лет. Обновляйте значение amount на каждой итерации.
1. Условие цикла: начинается с единицы, меньше или равно years, увеличивается на единицу.
2. Формула для расчёта процентной ставки: amount = amount + amount * (interestRate / 100);.
Выведите на экран итоговую сумму по окончании указанного периода с помощью System.out.println.
 Выражение для вывода: "К окончанию срока сумма составит: " + amount + " " + RUB".*/
public class Finance {
    public static void main(String[] args) {
        double interestRate = 10;

        System.out.println("Введите начальную сумму в выбранной валюте:");
        // посчитайте начальную сумму и сохраните в переменную amount
        // TODO: 06.01.2024  //double amount = NumberReader.getDouble();
        double amount = 1500;

        System.out.println("Введите количество лет для расчёта:");
        // посчитайте количество лет и сохраните в переменную years
        // TODO: 06.01.2024  //int years = NumberReader.getInteger();
        //int years = 3;

        // напишите условие выполнения цикла
        for (int years = 3; years >= 1; years--) {
            amount = amount + amount * (interestRate / 100);
            // формула для суммы за один год на процентную ставку
        }
        // выведите на экран сообщение с итоговой суммой
        System.out.println("К окончанию срока сумма составит: " + amount + " " + "RUB");
    }
}



