public class Carrot2 {
    public static void main(String[] args) {
        int day = 1; // переменная для подсчёта количества дней
        int carrotReserve = 23; // запас моркови
        int carrotPerDay = 1; // порция Байта

        for (int carrotCount = carrotPerDay; carrotCount <= carrotReserve; carrotCount = carrotCount + carrotPerDay) {
            System.out.println("День " + day + ". Будет съедено морковок: " + carrotPerDay + ". Всего: " + carrotCount);
            carrotPerDay++;
            day++;
        }
        System.out.println("На " + day + "-й день запасы закончатся.");
    }
}

