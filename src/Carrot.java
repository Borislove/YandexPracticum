public class Carrot {
    public static void main(String[] args) {
        int carrotCount = 0; // объявляем переменную для суммарного числа морковок
        int carrotPerDay = 5; // в этой переменной фиксируем, сколько морковок съедается за день

        // число итераций совпадает с количеством дней в неделе
        for(int day = 1; day <= 7; day++) { // переменная итерирования — day
            carrotCount = carrotCount + carrotPerDay; // при каждой итерации плюс 5 морковок
            // сколько всего морковок Байт съедает за указанное количество дней
            System.out.println(day + "-й день, Байт съест " + carrotCount + " морковок.");
        }
        // сколько овощей требуется покупать на неделю
        System.out.println("Рацион на неделю: " + carrotCount + " морковок.");
    }
}
