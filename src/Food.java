/*Байт тем временем налёг на новый корм — съедает по целой пачке в день.
 Ветеринар считает, что это не очень полезно, и рекомендует делить пачку на три дня.
 Вы отложили на корм 500 рублей. Используя цикл, посчитайте, на сколько дней вам хватит этих денег,
  если одна пачка корма для Байта стоит 100 рублей. Ваша программа должна выводить каждый трёхдневный период и остаток средств к этому моменту:*/
public class Food {
    public static void main(String[] args) {
        int money = 500; // деньги на корм
        int foodPerDay = 100; // стоимость пачки корма
        int days = 0; // дни, когда вы сможете покупать корм

        // здесь опишите цикл
        for (int i = days; money > 0; ) {
            // здесь отразите, что вы будете покупать корм каждые три дня
            money -= foodPerDay;
            System.out.println("day: " + days + " money " + money);
            days +=3;
            // опишите строку вывода
            // цикл заканчивается здесь
        }
        System.out.println("");
    }
}
