/*Расширяем логику нашего приложения!
Пользователю предоставляется возможность выбрать валюту из следующего списка: рубли, доллары, евро или юани.
Если пользователь вводит некорректный номер валюты,
 программа автоматически устанавливает валюту по умолчанию (рубли) и производит расчёты на основе этой валюты.*/

public class Converter2 {
    public static void main(String[] args) {
        // Курсы валют
        double exchangeRateUSD = 94.8;
        double exchangeRateEUR = 103.8;
        double exchangeRateCNY = 13.1;

        // Процентные ставки
        double interestRateRUB = 7;
        double interestRateUSD = 1;
        double interestRateEUR = 0.8;
        double interestRateCNY = 1.5;

        //Коды валют

        // Вывод меню
        System.out.println("Введите номер валюты:");
        System.out.println("1 – рубли;");
        System.out.println("2 – доллары;");
        System.out.println("3 – евро;");
        System.out.println("4 – юани.");

        // посчитайте номер валюты и сохраните в переменную currency
        //double currency = NumberReader.getDouble();
        double currency = 1;

        // объявите переменную exchangeRate для курса и проинициализируйте единицей
        double exchangeRate = currency;
        // объявите переменную interestRate для процентной ставки
        double interestRate = currency;
        // объявите переменную currencySymbol для обозначения аббревиатуры валюты
        String currencySymbol = " ";

        /* обновите значения переменных rate, interestRate и currencySymbol
           в зависимости от номера валюты */

        //валюта
        if (currency == 1) { // если валюта – рубль,
            interestRate = interestRateRUB; // устанавливаем соответствующую ставку,
            currencySymbol = "RUB"; // устанавливаем код валюты
        } else if (currency == 2) { // если валюта – доллар,
            interestRate = interestRateUSD; // устанавливаем курс обмена, ставку и код валюты
            currencySymbol = "USD";
        } else if (currency == 3) {
            interestRate = interestRateEUR;
            currencySymbol = "EUR";
        } else if (currency == 4) {
            interestRate = interestRateCNY;
            currencySymbol = "CNY";
        } else {
            System.out.println("Ошибка: выбрана некорректная валюта. Валюта по умолчанию — рубли.");
            /* обновите переменные
               interestRate и currencySymbol
               для валюты по умолчанию – рублей */
            interestRate = interestRateRUB;
            currencySymbol = "RUB";
        }

        System.out.println("Введите начальную сумму в выбранной валюте:");
        // double amount = NumberReader.getDouble();
        double amount = 1000;

        System.out.println("Введите количество лет для расчёта:");
        //int years = NumberReader.getInteger();
        int years = 5;

        for (int i = 1; i <= years; i++) {
            amount = amount + amount * (interestRate / 100);
        }
        System.out.println("К окончанию срока сумма составит: " + amount + " " + currencySymbol);
    }
}


