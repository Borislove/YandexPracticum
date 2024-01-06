//копилка
public class PiggyBank {
    public static void main(String[] args) {
        int days = 365; // количество дней
        int moneyPerDay = 200; // нужно откладывать в день
        int sum = 0; // переменная, которая хранит общую сумму накоплений

        for (int i = 1; i <= days; i++) {
            sum += moneyPerDay; // каждый день увеличивается на значение moneyPerDay
            // место для вывода
            System.out.println("День " + i + ". Уже " + sum + " руб.");
        }
    }
}
