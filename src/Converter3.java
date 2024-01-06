/*Финальные штрихи!
Через каждые три года начисляется бонус — сумма увеличивается на 1%.
Если выбрана валюта, отличная от рублей, программа также переводит итоговую сумму в рубли и выводит сообщение вида: В рублях это будет: … руб..
В конце программа выводит сообщение о завершении работы: Работа с программой завершена.. */

public class Converter3 {
    public static void main(String[] args) {
        double exchangeRateUSD = 94.8;
        double exchangeRateEUR = 103.8;
        double exchangeRateCNY = 13.1;

        double interestRateRUB = 7;
        double interestRateUSD = 1;
        double interestRateEUR = 0.8;
        double interestRateCNY = 1.5;


        System.out.println("Введите номер валюты:");
        System.out.println("1 – рубли;");
        System.out.println("2 – доллары;");
        System.out.println("3 – евро;");
        System.out.println("4 – юани.");

        // TODO: 06.01.2024    //int currency = NumberReader.getInteger();
        int currency = 2;

        double exchangeRate = 1;
        double interestRate;
        String currencySymbol;

        if (currency == 1) {
            interestRate = interestRateRUB;
            currencySymbol = "RUB";
        } else if (currency == 2) {
            exchangeRate = exchangeRateUSD;
            interestRate = interestRateUSD;
            currencySymbol = "USD";
        } else if (currency == 3) {
            exchangeRate = exchangeRateEUR;
            interestRate = interestRateEUR;
            currencySymbol = "EUR";
        } else if (currency == 4) {
            exchangeRate = exchangeRateCNY;
            interestRate = interestRateCNY;
            currencySymbol = "CNY";
        } else {
            System.out.println("Ошибка: выбрана некорректная валюта. Валюта по умолчанию — рубли.");
            currency = 1; // устанавливаем валюту по умолчанию — рубли
            interestRate = interestRateRUB;
            currencySymbol = "RUB";
        }

        System.out.println("Введите начальную сумму в выбранной валюте:");
        // TODO: 06.01.2024        //double amount = NumberReader.getDouble();
        double amount = 100;
        double tmp_amount = amount;

        System.out.println("Введите количество лет для расчёта:");
        // TODO: 06.01.2024    //int years = NumberReader.getInteger();
        int years = 3;

        for (int i = 1; i <= years; i++) {
            amount = amount + amount * (interestRate / 100);

            // добавьте условие, при котором каждые три года сумма также увеличивается на 1%
            if (years % 3 == 0) {
                // формула для изменения на 1%
                amount = amount + amount * (1 / 100);
                System.out.println("изменено на 1% : " + amount);
            }
        }
        System.out.println("К окончанию срока сумма составит: " + amount + " " + currencySymbol);

        // если валюта – не рубли
        if (currency != 1) {
            // сохраните в переменную roubles результат перевода в рубли
            double roubles = tmp_amount * exchangeRate;
            // выведите на экран сообщение с результатом: "В рублях это будет: ... руб."
            System.out.println("В рублях это будет: " + roubles + " RUB");
        }
        // выведите на экран сообщение о завершении работы программы: "Работа с программой завершена"
        System.out.println("Работа с программой завершена");
    }
}
